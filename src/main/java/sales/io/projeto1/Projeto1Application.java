package sales.io.projeto1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.data.mongodb.core.MongoOperations;

@SpringBootApplication
public class Projeto1Application {
	
	@Autowired MongoOperations operations;

	public static void main(String[] args) {
		SpringApplication.run(Projeto1Application.class, args);
	}
}
