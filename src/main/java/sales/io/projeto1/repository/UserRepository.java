package sales.io.projeto1.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import sales.io.projeto1.entity.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

	User findByName(String name);
	
	User findByEmail(String email);
	
	User findByNameIgnoreCase(String name);
	
	User findByNameIgnoreCaseLike(String name);
	
	@Query("{'email': ?0}")
	User findByQlqCoisa(String email);
	
}
