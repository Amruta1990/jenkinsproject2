package com.AmrutaIT.SpringDataJPAFirstProject.Repository;

import org.springframework.data.repository.CrudRepository;

import com.AmrutaIT.SpringDataJPAFirstProject.Model.User;

public interface UserRepo extends CrudRepository<User, Integer> {
	

}
