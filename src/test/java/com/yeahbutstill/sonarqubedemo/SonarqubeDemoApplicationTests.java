package com.yeahbutstill.sonarqubedemo;

import com.yeahbutstill.sonarqubedemo.controller.MessageController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SonarqubeDemoApplicationTests {

	@Autowired
	private MessageController messageController;

	@Test
	void contextLoads() {
	}

	@Test
	void testGetMessage() {
		String message = messageController.getMessage();
		Assertions.assertNotNull(message);
	}

}
