package br.com.library.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.library.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

}
