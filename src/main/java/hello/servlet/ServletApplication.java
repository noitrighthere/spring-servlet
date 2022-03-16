package hello.servlet;

import hello.servlet.web.springmvc.v1.SpringMemberForomControllerV1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

@ServletComponentScan	// 서블릿 자동 등록
@SpringBootApplication
public class ServletApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServletApplication.class, args);
	}

	// SpringMemberForomControllerV1 스프링 빈 직접 등록
	/*
	@Bean
	SpringMemberForomControllerV1 springMemberForomControllerV1() {
		return new SpringMemberForomControllerV1();
	}
	 */
}
