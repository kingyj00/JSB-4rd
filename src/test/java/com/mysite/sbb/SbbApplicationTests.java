package com.mysite.sbb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.sbb.question.QuestionService;

@SpringBootTest
class SbbApplicationTests {

	@Autowired
	private QuestionService questionService;

	@Test
	void testJpa() {
		for (int i = 1; i <= 5; i++) {
			String subject = String.format("안녕하세요~ :[%03d]", i);
			String content = "화이팅 화이팅 힘을내요 슈퍼파월~";
			this.questionService.create(subject, content);
		}
	}
}