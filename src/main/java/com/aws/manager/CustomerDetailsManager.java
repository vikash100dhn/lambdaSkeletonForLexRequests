package com.aws.manager;

import com.aws.dao.DetailsDao;
import com.aws.dao.IDetailsDao;
import com.aws.data.Request;

public class CustomerDetailsManager implements ICustomerDetailsManager {
	IDetailsDao customerDetailsDao = new DetailsDao();

	private String username;

	public CustomerDetailsManager() {
	}

	public String handleRequest(Request input) {
		String response = "";

		String intent = input.getCurrentIntent().getName();
		String previousIntent = input.getSessionAttributes().getPreviousIntent();
		String identifier = input.getSessionAttributes().getIdentifier();
		String speech = input.getInputTranscript();

		
		switch (intent) {

		case "Intent A":
			return handleIntentA(input);

		case "putonhold":
					
			
			return "My apologies";

		case "confirmIntent":
			if (previousIntent.equals("getCustomerId")) {

				response = "Thanks for the confirmation!";
			}

		}

		response = handleDefaultIntent(input);

		return response;
	}

	private String handleIntentA(Request input) {
		return null;
	}

	private String handleDefaultIntent(Request input) {
		return "";
	}
		
}
