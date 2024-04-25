package br.com.workfacul.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.workfacul.crud.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
