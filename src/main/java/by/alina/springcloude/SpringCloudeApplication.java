package by.alina.springcloude;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringCloudeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudeApplication.class, args);
	}

}
