package hieu.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@SpringBootApplication
public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				SpringApplication.run(App.class, args);
	}
}
