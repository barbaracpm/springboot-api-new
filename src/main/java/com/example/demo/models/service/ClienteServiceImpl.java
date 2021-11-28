package com.example.demo.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.ClienteDao;
import com.example.demo.models.entity.Cliente;
import com.example.demo.models.entity.Region;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	private ClienteDao clienteDao;
	

	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		
		return (List<Cliente>) clienteDao.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public Cliente findById(Long id) {
		return clienteDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		return clienteDao.save(cliente);
		
	}
	
	@Override
	@Transactional//esta anotacion es requerida
	public void delete(Long id) {
		clienteDao.deleteById(id);
		System.out.println("Este metodo eliminará un cliente por id");
	}

	@Override
	@Transactional(readOnly=true)//si es de tipo get readOnly
	public List<Region> findAllRegions() {
		
		return clienteDao.findAllRegions();
	}

}
