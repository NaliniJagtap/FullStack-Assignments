package construcorBasedDI;

public class Payment {
	private int id;  
    private String name;  
    public Payment() {System.out.println("Tanhaji");}  
    public Payment(int id) {this.id = id;}  
    public Payment(String pName) {  this.name = pName;}  
    public Payment(int id, String pName) {  
        this.id = id;  
        this.name = pName;  
    }  
    
    public void init()
    {
    	System.out.println("Welcome to Init Method");
    }
    
    public void destroy()
    {
    	System.out.println("Welcome to Destroy Method :  Bye !!!!");
    }
    public void Set(String pName) {  
        this.name = pName;  
    } 
    void display(){  
        System.out.println(id+" "+name);  
    }  

}
