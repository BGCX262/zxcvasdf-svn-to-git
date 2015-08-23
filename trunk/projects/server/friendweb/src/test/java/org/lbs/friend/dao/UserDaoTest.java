package org.lbs.friend.dao;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-cfg.xml")
public class UserDaoTest {
	@Autowired
	private UserDao userDao;

	@Autowired
	private UserProfileDao profileDao;
	
	@Test
	public void test1() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date now = new Date();
		String nowString = format.format(now);
		//userDao.insert("haiker", "haiker", nowString, nowString);
		
		profileDao.insert("haiker", 12.0f, 12.0f, false);
	}

}
