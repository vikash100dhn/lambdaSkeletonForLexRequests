package com.aws.data;

public class WebSocketInput {

	private String userid ;
	private String sender ;
	private String intentName ;
	private String speech ;
	private IntentInfo intentInfo ;
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getIntentName() {
		return intentName;
	}
	public void setIntentName(String intentName) {
		this.intentName = intentName;
	}
	public IntentInfo getIntentInfo() {
		return intentInfo;
	}
	public void setIntentInfo(IntentInfo intentInfo) {
		this.intentInfo = intentInfo;
	}
	public String getSpeech() {
		return speech;
	}
	public void setSpeech(String speech) {
		this.speech = speech;
	}
	@Override
	public String toString() {
		return "WebSocketInput [userId=" + userid + ", sender=" + sender + ", intentName=" + intentName + ", speech="
				+ speech + ", intentInfo=" + intentInfo + "]";
	}
	
	
}
