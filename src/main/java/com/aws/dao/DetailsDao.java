package com.aws.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.aws.data.Customer;
import com.aws.handler.ConnManager;
import com.aws.handler.Database;

public class DetailsDao implements IDetailsDao {

	@Override
	public int saveConnectConversation(String intentName, String inputTranscript) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getCustomerName(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<String> getConversation() {

		List<String> conversationList = new ArrayList<>();
		Connection conn;
		try {
			conn = ConnManager.createConnection();
			PreparedStatement preparedStatement = conn
					.prepareStatement("SELECT val1,val2 FROM tbl");
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				String string = resultSet.getString(1) + " : " + resultSet.getString(2);
				conversationList.add(string);
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conversationList;
	}

}