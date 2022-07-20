package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor    
@NoArgsConstructor
@Builder
@Entity
@Table
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;                                                      
	private String name;  //"name":"adarsh",
	private String email;  // "email":"adarshpagadi1998",
	private String address; //"address":"banglore"
	public  Object getname() {
		// TODO Auto-generated method stub
		return name ;
	}
	public  Object getemail() {
		// TODO Auto-generated method stub
		return email ;
	}
	public  Object getaddress() {
		// TODO Auto-generated method stub
		return address ;
	}
	public void getname(Object getname) {
		// TODO Auto-generated method stub
		
	}
	public void getemail(Object getemail) {
		// TODO Auto-generated method stub
		
	}
	public void getaddress(Object getaddress) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
