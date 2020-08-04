package sales.io.projeto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sales.io.projeto1.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByName(String name);
	
//	@Query("SELECT u FROM User u WHERE u.name = ?1")
	@Query("SELECT u FROM User u WHERE u.name like ?1%")
	User findByNomeUsuario(String name);
	
	User findByEmail(String email);
}
