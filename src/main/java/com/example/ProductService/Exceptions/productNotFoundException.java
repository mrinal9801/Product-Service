package com.example.ProductService.Exceptions;

import org.springframework.stereotype.Component;

@Component
public class productNotFoundException extends RuntimeException {
	private String errorMessage;
	private String errorCode;
	private static final long serialVersionUID=1L;
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * @param errorMessage
	 * @param errorCode
	 */
	public productNotFoundException(String errorMessage, String errorCode) {
		super();
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
		getErrorCode();
		getErrorMessage();
	}
	
	
	public productNotFoundException()
	{
		
	}
}
