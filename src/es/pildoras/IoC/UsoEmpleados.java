package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		//Creación de objetos de tipo Empleado
		Empleados Empleado1 = new DirectorEmpleado();
		
		//Uso de los objetos creados
		System.out.println(Empleado1.getTareas());
		*/
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Empleados Juan =contexto.getBean("miEmpleado", Empleados.class);
		
		System.out.println(Juan.getTareas());
		
		System.out.println(Juan.getInforme());
		
		Empleados Lucas =contexto.getBean("miSecretarioEmpleado", Empleados.class);
		
		System.out.println(Lucas.getTareas());
		
		System.out.println(Lucas.getInforme());
		
		contexto.close();
		
	}

}
