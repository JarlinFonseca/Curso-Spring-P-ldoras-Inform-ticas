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
		
		System.out.println("Jefe de la empresa: Juan");
		
		System.out.println(Juan.getTareas());
		
		System.out.println(Juan.getInforme());
		
		SecretarioEmpleado Lucas =contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		System.out.println(Juan.equals(Lucas));
		
		System.out.println("Secretario de la empresa: Lucas");
		System.out.println(Lucas.getTareas());
		
		System.out.println(Lucas.getInforme());
		
		System.out.println("Email: "+Lucas.getEmail());
		
		System.out.println("Empresa: "+Lucas.getNombreEmpresa());
		
		System.out.println("Email de Pablo: "+Lucas.getEmail());
		
		DirectorEmpleado Maria =contexto.getBean("miDirectorEmpleado", DirectorEmpleado.class);
		System.out.println("Director de la empresa: Maria");
		
		System.out.println(Maria.getTareas());
		System.out.println(Maria.getInforme());
		System.out.println(Maria.getEmail());
		System.out.println(Maria.getNombreEmpresa());
		
		contexto.close();
		
	}

}
