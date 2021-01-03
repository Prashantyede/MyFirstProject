package com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="User_id")
	int uid;
    String code;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getuFName() {
		return uFName;
	}
	public void setuFName(String uFName) {
		this.uFName = uFName;
	}
	public String getuLName() {
		return uLName;
	}
	public void setuLName(String uLName) {
		this.uLName = uLName;
	}
	public String getuMob() {
		return uMob;
	}
	public void setuMob(String uMob) {
		this.uMob = uMob;
	}
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	public String getuAddr() {
		return uAddr;
	}
	public void setuAddr(String uAddr) {
		this.uAddr = uAddr;
	}
	public String getuPass() {
		return uPass;
	}
	public void setuPass(String uPass) {
		this.uPass = uPass;
	}
	public String getuPassword() {
		return uPassword;
	}
	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Column(name="First_Name")
	String uFName;
	@Column(name="Last_Name")
	String uLName;
	@Column(name="Mobile_number")
	String uMob;
	@Column(name="Email")
	String uEmail;
	@Column(name="Address")
	String uAddr;
	@Column(name="Password")
	String uPass;
	@Column(name="ConformPassword")
	String uPassword;
	
	
}
