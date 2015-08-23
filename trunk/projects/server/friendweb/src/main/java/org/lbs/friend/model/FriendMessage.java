package org.lbs.friend.model;

import java.sql.Timestamp;

public class FriendMessage {
	//收件人id
	private long toId;
	//发件人id
	private long fromId;
	//发送时间
	private Timestamp sentTime;
	//内容
	private String content;
	
	public long getToId() {
		return toId;
	}
	public void setToId(long toId) {
		this.toId = toId;
	}
	public long getFromId() {
		return fromId;
	}
	public void setFromId(long fromId) {
		this.fromId = fromId;
	}
	public Timestamp getSentTime() {
		return sentTime;
	}
	public void setSentTime(Timestamp sentTime) {
		this.sentTime = sentTime;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	

}
