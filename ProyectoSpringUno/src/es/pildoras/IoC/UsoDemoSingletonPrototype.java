package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {
		//Carga de XML de configuración
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		//Petición de Beans al contenedor Spring
		SecretarioEmpleado María =contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		SecretarioEmpleado Pedro =contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		SecretarioEmpleado Manolo =contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		SecretarioEmpleado Juan =contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		SecretarioEmpleado Ana =contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		System.out.println(María);
		
		System.out.println(Pedro);
		
		System.out.println(Manolo);
		
		System.out.println(Juan);
		
		System.out.println(Ana);
		
		System.out.println(María.equals(Pedro));
		
		String mensaje ="";
		
		mensaje = (María.equals(Pedro))?"Apuntan al mismo objeto":"No se trata del mismo objeto";
		System.out.println(mensaje);
		
		contexto.close();
	}

}
