package com.idat.javawebavanzado.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class Producto {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long id;
	 
	 @Column(name="Nombre")
	 private String Nombre;
	 
	 @Column(name="Categoria")
	 private String Categoria;
	 
	 @Column(name="Stock")
	 private int Stock;
	 
	 @Column(name="Precio")
	 private int Precio;

	 public long getId() {
	  return id;
	 }

	 public void setId(long id) {
	  this.id = id;
	 }

	 public String getNombre() {
	  return Nombre;
	 }

	 public void setNombre(String Nombre) {
	  this.Nombre = Nombre;
	 }

	 public String getCategoria() {
	  return Categoria;
	 }

	 public void setCategoria(String Categoria) {
	  this.Categoria = Categoria;
	 }
	 
	 public int getStock() {
		  return Stock;
		 }

	 public void setStock(int Stock) {
	  this.Stock = Stock;
		 }
		 
		 public int getPrecio() {
			  return Precio;
			 }

			 public void setPrecio(int Precio) {
			  this.Precio = Precio;
			 }

}

