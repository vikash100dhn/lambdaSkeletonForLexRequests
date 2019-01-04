package com.aws.dao;

import java.util.List;

public interface IDetailsDao {

	public int saveConnectConversation(String intentName, String inputTranscript);

	String getCustomerName(int id);

	public List<String> getConversation();
}
