package org.springAOP.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before("execution(* org.springAOP.Registration.doRegisterUser(..))")
	public void logBefore(JoinPoint joinPoint) {

		System.out.println("logBefore() is running!");
		System.out.println("Function : " + joinPoint.getSignature().getName());
		System.out.println("Function arguments : " + Arrays.toString(joinPoint.getArgs()));
		System.out.println("==================================================");
	}
	
	@After("execution(* org.springAOP.Registration.doRegisterUser(..))")
	public void logAfter(JoinPoint joinPoint) {

		System.out.println("logAfter() is running!");
		System.out.println("Function : " + joinPoint.getSignature().getName());
		System.out.println("Function arguments : " + Arrays.toString(joinPoint.getArgs()));
		System.out.println("==================================================");

	}
	
	@AfterReturning(
			pointcut = "execution(* org.springAOP.Registration.addCustomerReturnValue(..))",
			returning= "result")
	public void logAfterReturning(JoinPoint joinPoint, Object result) {

		System.out.println("logAfterReturning() is running!");
		System.out.println("Function : " + joinPoint.getSignature().getName());
		System.out.println("Function returned value is : " + result);
		System.out.println("==================================================");

	}
	
	@Around("execution(* org.springAOP.Registration.doRegisterUser(..))")
	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {

		System.out.println("logAround() is running!");
		System.out.println("Function method : " + joinPoint.getSignature().getName());
		
		System.out.println("Function arguments : " + Arrays.toString(joinPoint.getArgs()));
		
		System.out.println("Around before is running!");
		
		String val ="";
		
		for (int i=0;i<joinPoint.getArgs().length;i++) {
			System.out.println(joinPoint.getArgs()[i].toString());
			val = joinPoint.getArgs()[i].toString();
		}
		
		
		System.out.println(joinPoint.getArgs());
		
		if (val.equalsIgnoreCase("Nalini")) {
			joinPoint.proceed();
		} else {
			doFallBackMethod(val);
		}
		
		
		System.out.println("Around after is running!");
		
		System.out.println("==================================================");

	}
	
	private void doFallBackMethod(String val) {
		System.out.println("******* Fallback method ********" + val);
	}
}
