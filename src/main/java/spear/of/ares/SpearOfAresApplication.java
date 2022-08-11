package spear.of.ares;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpearOfAresApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpearOfAresApplication.class, args);
	}

}
