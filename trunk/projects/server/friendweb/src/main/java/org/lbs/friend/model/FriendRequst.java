package org.lbs.friend.model;

import java.sql.Timestamp;

public class FriendRequst {
	//请求人id
	private long RequesterId;
	//被请求人id
	private long RequesteeId;
	//发送日期
	private Timestamp sendDate;
	
	public long getRequesterId() {
		return RequesterId;
	}
	public void setRequesterId(long requesterId) {
		RequesterId = requesterId;
	}
	public long getRequesteeId() {
		return RequesteeId;
	}
	public void setRequesteeId(long requesteeId) {
		RequesteeId = requesteeId;
	}
	public Timestamp getSendDate() {
		return sendDate;
	}
	public void setSendDate(Timestamp sendDate) {
		this.sendDate = sendDate;
	}

}
