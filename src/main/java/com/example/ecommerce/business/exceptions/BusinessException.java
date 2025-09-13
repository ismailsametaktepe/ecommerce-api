package com.example.ecommerce.business.exceptions;

public class BusinessException extends RuntimeException {

private final String code;

public BusinessException(String code,String message) {
	super(message);
	this.code=code;
}
public String getCode() {
	return code;
	
}

}
