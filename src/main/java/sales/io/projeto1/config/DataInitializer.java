package sales.io.projeto1.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import sales.io.projeto1.entity.User;
import sales.io.projeto1.repository.UserRepository;

@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent>  {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		List<User> users = userRepository.findAll();
		
		if (users.isEmpty()) {
			createUser("Felipe Sales", "felipe.sales.dev@gmail.com");
			createUser("João", "joao@gmail.com");
			createUser("Maria", "maria@gmail.com");
		}
		
//		User user = userRepository.getOne(2L);
//		System.out.println(user.getName());
		
//		userRepository.deleteById(2l);
		
		User user = userRepository.getOne(1L);
		user.setName("Felipe Ferreira de Sales");
		userRepository.save(user); 
	}
	
	public void createUser(String name, String email) {
		User user = new User(name, email);
		userRepository.save(user);
	}
}
 