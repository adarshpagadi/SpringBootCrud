package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
	
	private static final Long SerialversionUID=1L;
	
	private String resourceName;
	private String fildName;
	private Object filedvalue;
	public ResourceNotFoundException(String resourceName, String fildName, Object filedvalue) {
		super(String.format("%s not found %s,'%s' ",resourceName, fildName,filedvalue ));
		this.resourceName = resourceName;
		this.fildName = fildName;
		this.filedvalue = filedvalue;
	}
	
	public String getResourceName() {
		return resourceName;
	}
	public String getFildName() {
		return fildName;
	}
	public Object getFiledvalue() {
		return filedvalue;
	}
}
