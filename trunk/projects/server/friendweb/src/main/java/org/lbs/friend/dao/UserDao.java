package org.lbs.friend.dao;

import com.mongodb.BasicDBObject;

public class UserDao extends AbstractDao {
	
	@Override
	public void setCollection() {
		collection = this.db.getCollection("user");
	}

	
	public void insert(String username, String password, String regDate, String logonDate) {
		
		BasicDBObject user = new BasicDBObject();
		user.put("name", username);
		user.put("pwd", password);
		user.put("rdt", regDate);
		user.put("ldt", logonDate);
		
		collection.insert(user);
	}
}
