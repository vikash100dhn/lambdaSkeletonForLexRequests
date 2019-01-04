package com.aws.manager;

import java.io.ByteArrayOutputStream;

import com.aws.data.Request;

public interface ICustomerDetailsManager {
	
	public String handleRequest(Request input);
}