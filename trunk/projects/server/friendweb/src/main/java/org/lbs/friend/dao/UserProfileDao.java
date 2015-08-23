package org.lbs.friend.dao;

import com.mongodb.BasicDBObject;

public class UserProfileDao extends AbstractDao {
	
	@Override
	public void setCollection() {
		collection = this.db.getCollection("userprofile");
	}
	
	public void insert(String username, Float latitude, Float longitude, Boolean gender){
		BasicDBObject profile = new BasicDBObject();
		profile.put("name", username);
		profile.put("g", gender);
		
		BasicDBObject loc = new BasicDBObject();
		loc.put("long", longitude);
		loc.put("lat", latitude);
		profile.put("loc", loc);
		
		collection.insert(profile);
	}

}

