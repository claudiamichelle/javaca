package javaca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import javaca.model.UserRole;

public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {

}
