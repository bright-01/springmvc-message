package hello.itemservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;

@SpringBootApplication
public class ItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemServiceApplication.class, args);
	}

//
	// 국제화, 다국어?? 를 사용하기 위한 빈등록
	// MessgaeSource를 스프링 빈으로 등록하면 된다. MessageSource는 인터페이스라서
	// 구현체인 ResourceBundleMessageSource를 스프링빈으로 등록
	// 파일 위치는 /resources/messages.properties
	// 근데 Spring Boot에서 자동으로 등록해줌
//	@Bean
//	public MessageSource messageSource() {
//		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
//		messageSource.setBasenames("messages", "errors");
//		messageSource.setDefaultEncoding("utf-8");
//		return messageSource;
//	}


}
