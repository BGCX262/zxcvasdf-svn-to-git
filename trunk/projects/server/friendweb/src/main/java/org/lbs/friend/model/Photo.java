package org.lbs.friend.model;

public class Photo {
	//用户id
	private long id;
	//照片路径
	private String photoPath;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPhotoPath() {
		return photoPath;
	}
	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

}
