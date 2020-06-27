package com.learning.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learning.springboot.di.app.models.domain.ItemFactura;
import com.learning.springboot.di.app.models.domain.Producto;
import com.learning.springboot.di.app.models.service.IService;
import com.learning.springboot.di.app.models.service.MyComplexService;
import com.learning.springboot.di.app.models.service.MyService;

@Configuration
public class AppConfig {

	@Bean("MyComplexService")
	public IService registerMyService() {
		return new MyComplexService();
	}

	@Bean("MyService")
	public IService registerMyComplexService() {
		return new MyService();
	}

	@Bean("ItemsFactura")
	public List<ItemFactura> getItems() {
		Producto producto1 = new Producto("Utilería", 100);
		Producto producto2 = new Producto("Vestuario", 500);

		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 4);

		return Arrays.asList(linea1, linea2);
	}

	@Bean("ItemsFacturaOficina")
	public List<ItemFactura> registrarItemsOficina() {
		Producto producto1 = new Producto("Crema para gordos", 50);
		Producto producto2 = new Producto("Notebook ASUS", 500);
		Producto producto3 = new Producto("Multifuncional", 1500);
		Producto producto4 = new Producto("Escritorio XXL", 5500);
		Producto producto5 = new Producto("Cuadro con pescado diciendo 'Harder'", 2500);

		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 4);
		ItemFactura linea3 = new ItemFactura(producto3, 1);
		ItemFactura linea4 = new ItemFactura(producto4, 1);
		ItemFactura linea5 = new ItemFactura(producto5, 1);
		return Arrays.asList(linea1, linea2, linea3, linea4, linea5);
	}
}
