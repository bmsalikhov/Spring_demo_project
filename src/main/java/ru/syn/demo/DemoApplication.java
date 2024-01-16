package ru.syn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.syn.demo.service.UserService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(DemoApplication.class, args);

		UserService service = context.getBean(UserService.class);
		var authedU = service.isAuth("I'm a user");
		System.out.println(authedU);
		var notAuthedU = service.isAuth("bmsalikhov");
		System.out.println(notAuthedU);
	}

}
