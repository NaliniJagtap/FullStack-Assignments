package com.Nalini.Model;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class UserModel {
	
	@Id
	private int id;
	private String fname;
	private String lname;
	private String pass;
	private String cpass;
	private String gender;
	private String email;
	private int mob;
	private String ans;
	
	public UserModel(int id, String fname, String lname, String pass, String cpass, String gender, String email,
			int mob, String ans) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.pass = pass;
		this.cpass = cpass;
		this.gender = gender;
		this.email = email;
		this.mob = mob;
		this.ans = ans;
	}

	public String getCpass() {
		return cpass;
	}

	public void setCpass(String cpass) {
		this.cpass = cpass;
	}

	
	
	public UserModel() {}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMob() {
		return mob;
	}

	public void setMob(int mob) {
		this.mob = mob;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	@Override
	public String toString() {
		return "UserModel [id=" + id + ", fname=" + fname + ", lname=" + lname + ", pass=" + pass + ", gender=" + gender
				+ ", email=" + email + ", mob=" + mob + ", ans=" + ans + "]";
	}
	
	
	
	
	

}
