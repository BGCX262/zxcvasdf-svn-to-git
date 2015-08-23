package org.lbs.friend.model;

public class UserProfile {
	// 用户id
	private long id;
	// 地理位置
	private Position geoInfo;
	// 头像位置
	private String AvatorPath;
	// 性别 F/M
	private String gender;
	// 年龄
	private String age;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Position getGeoInfo() {
		return geoInfo;
	}

	public void setGeoInfo(Position geoInfo) {
		this.geoInfo = geoInfo;
	}

	public String getAvatorPath() {
		return AvatorPath;
	}

	public void setAvatorPath(String avatorPath) {
		AvatorPath = avatorPath;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
