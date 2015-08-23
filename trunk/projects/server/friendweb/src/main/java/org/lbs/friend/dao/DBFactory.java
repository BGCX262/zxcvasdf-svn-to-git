package org.lbs.friend.dao;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

import com.mongodb.DB;
import com.mongodb.Mongo;

/**
 * 该类用于创建与mongodb的链接并指定要操作的数据库
 * 
 * @author zhanyuny
 * 
 */
public class DBFactory implements FactoryBean<DB>, InitializingBean {
	protected Mongo mongo;
	// 数据库
	protected DB db;
	// 主机地址
	private String host;
	// 端口
	private Integer port;
	// 默认的数据库名称
	private String defautDB;
	// 用户名
	private String username;
	// 密码
	private String password;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public String getDefautDB() {
		return defautDB;
	}

	public void setDefautDB(String defautDB) {
		this.defautDB = defautDB;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public DB getObject() throws Exception {
		return db;
	}

	@Override
	public Class<?> getObjectType() {
		return DB.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		if (host != null && !"".equals(host)) {
			if (port == null) {
				mongo = new Mongo(host);
			} else {
				mongo = new Mongo(host, port);
			}

			db = mongo.getDB(defautDB);
			if (username != null && password != null) {
				boolean auth = db
						.authenticate(username, password.toCharArray());
				if (!auth) {
					// TODO throws Exception authentication error
				}
			}
		} else {
			// TODO throws Exception unknown host
		}
	}

}