package org.lbs.friend.dao;

import org.springframework.beans.factory.InitializingBean;

import com.mongodb.DB;
import com.mongodb.DBCollection;

public abstract class AbstractDao implements InitializingBean {
	// 当前操作的数据库
	protected DB db;
	
	protected DBCollection collection;

	public void setDb(DB db) {
		this.db = db;
	}
	
	// 设置当前要操作的表名
	public abstract void setCollection();
	

	@Override
	public void afterPropertiesSet() throws Exception {
		setCollection();		
	}
}
