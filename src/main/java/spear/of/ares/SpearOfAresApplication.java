package spear.of.ares;

import org.apache.catalina.security.SecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@SpringBootApplication(exclude = { SecurityAutoConfiguration.class, SecurityConfig.class })
@SpringBootApplication
@EnableFeignClients
public class SpearOfAresApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpearOfAresApplication.class, args);
	}

}
