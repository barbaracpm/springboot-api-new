package com.example.demo.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{
	
	//public Usuario findByUsername(String username); 
	
	//@Query("select u from Usuario u where u.username=?")
	//public Usuario findByUsername2(String username);

}
