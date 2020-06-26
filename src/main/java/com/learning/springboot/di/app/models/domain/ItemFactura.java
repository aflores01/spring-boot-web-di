package com.learning.springboot.di.app.models.domain;

public class ItemFactura {

	private Producto product;
	private Integer cantidad;

	public ItemFactura(Producto product, Integer cantidad) {
		this.product = product;
		this.cantidad = cantidad;
	}

	public Producto getProduct() {
		return product;
	}

	public void setProduct(Producto product) {
		this.product = product;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

}
