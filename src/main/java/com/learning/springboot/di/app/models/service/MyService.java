package com.learning.springboot.di.app.models.service;

//@Component("myService")
//@Service se puede usar por igual pero solo es a manera de "fachada" ya que funciona igual que component
public class MyService implements IService {

	@Override
	public String operacion() {
		return "ejecutando proceso simple con inyección de dependencias...";
	}

	// Todo componente debe tener un constructor sin parametros por defecto

}
