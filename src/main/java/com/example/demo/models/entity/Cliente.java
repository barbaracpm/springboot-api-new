package com.example.demo.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity//representa una tabla en una base de datos
@Table(name = "clientes")
public class Cliente implements Serializable{
	
	@Id //PARA QUE LA BD LO RECONOZCA COMO IDENTIFICADOR ID
	@GeneratedValue(strategy = GenerationType.IDENTITY) //PARA GENERAR EL AUTOINCREMENT
	private long id;
	
	@Column(nullable = false) // es obligatorio
	private String nombre;
	private String apellido;
	
	@Column(nullable = false, unique = true) // es obligatorio y único
	private String email;
	private int telefono;
	
	@Column(name = "created_at")
	@Temporal(TemporalType.DATE)
	private Date createdAt;
	
	//many donde estamos, la palabra de la izquierda hace referencia donde estamos
	@NotNull(message="no puede estar vacío")
	@ManyToOne(fetch=FetchType.LAZY)//hace una subconsulta atraves de un metodo, carga perezosa
	@JoinColumn(name="region_id")//para relacionar es indispensable
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})// ponemos porque tenemos una carga perezosa
	private Region region;
	
	private String imagen;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
	
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	
	public Region getRegion() {
		return region;
	}
	public void setRegion(Region region) {
		this.region = region;
	}







	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;//PARA MARCAR EL MODELO EN EL CUAL SE IMPLEMENTA
	
	
	
	
	
	

}
