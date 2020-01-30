package com.young.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/security-context.xml"})
public class passwordEncodingTest {
	
	private static final Logger logger = LoggerFactory.getLogger(passwordEncodingTest.class);
	@Inject
	BCryptPasswordEncoder bcryptPasswordEncoder;

	@Test
	public void test1() {
		String password = "asd";
		String encodedpassword = bcryptPasswordEncoder.encode(password);
		
		logger.info(encodedpassword);
		
	}
}
