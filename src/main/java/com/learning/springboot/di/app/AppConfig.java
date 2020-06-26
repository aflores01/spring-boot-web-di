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
}
