package org.lbs.friend.model;

public class Relationship {
	//主人id
	private long id;
	//朋友id
	private long friendId;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getFriendId() {
		return friendId;
	}
	public void setFriendId(long friendId) {
		this.friendId = friendId;
	}
     
}
