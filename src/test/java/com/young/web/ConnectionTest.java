package com.young.web;

import java.sql.Connection;
import java.sql.SQLException;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/dataSource-context.xml"})
public class ConnectionTest {
	
private static final Logger logger = LoggerFactory.getLogger(ConnectionTest.class);

	
	@Inject
	private DataSource ds;
	
	@Inject
	private SqlSessionFactory sqlsession;
	
	
	@Test
	public void test1() {
		try {
			Connection conn = ds.getConnection();
			logger.info("\n MySQL 연결 : " + conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
