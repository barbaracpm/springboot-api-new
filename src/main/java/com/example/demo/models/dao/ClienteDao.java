package com.example.demo.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.entity.Cliente;
import com.example.demo.models.entity.Region;

public interface ClienteDao extends CrudRepository<Cliente, Long>{//IMPLEMENTA METODOS DE MANIPULACION
	
	@Query("from Region")//desde la entidad, ponemos @Query porque no vamos a hacer un crud completo, solo consultar
	public List<Region>findAllRegions();

}
