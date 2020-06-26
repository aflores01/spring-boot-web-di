package com.learning.springboot.di.app.models.service;

//@Component("myPrincipalComplexService")
//@Primary
//Primary establece prioridad por defecto sobre la selección de componentes inyectados
//@Service se puede usar por igual pero solo es a manera de "fachada" ya que funciona igual que component
public class MyComplexService implements IService{

	@Override
	public String operacion() {
		return "ejecutando proceso complejo con inyección de dependencias...";
	}
	
	//Todo componente debe tener un constructor sin parametros por defecto

}
