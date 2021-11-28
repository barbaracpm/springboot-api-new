package com.example.demo.models.service;

import java.util.List;

import com.example.demo.models.entity.Cliente;
import com.example.demo.models.entity.Region;

public interface ClienteService {
	
	public List<Cliente> findAll();
	public Cliente findById(Long id);
	public Cliente save(Cliente cliente);
	public void delete(Long id);
	
	public List<Region>findAllRegions();

}
