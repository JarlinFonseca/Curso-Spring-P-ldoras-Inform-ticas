package es.pildoras.pruebaannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotation2 {

	public static void main(String[] args) {
		
		// Leer el XML de configuración
		//ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Leer el class de configuración
		
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		// Pedir un Bean al contenedor
		Empleados Antonio = contexto.getBean("comercialExperimentado", Empleados.class);
		
		Empleados Lucia = contexto.getBean("comercialExperimentado", Empleados.class);
		
		// Usar el Bean
		
		// ¿Apuntan al mismo objeto en memoria?
		
		if(Antonio.equals(Lucia)) { 
			System.out.println("Apuntan al mismo lugar en memoria");
			System.out.println(Antonio+"\n"+Lucia);
		}else {
			System.out.println("No apuntan al mismo lugar en memoria");
			System.out.println(Antonio+"\n"+Lucia);
		}
		
		DirectorFinanciero Lucas = contexto.getBean("directorFinanciero", DirectorFinanciero.class);
		
		System.out.println("Lucas: "+Lucas.getInforme());
		System.out.println(Lucas.getTareas());
		System.out.println("Email del director: "+Lucas.getEmail()+", y nombre de la Empresa: "+Lucas.getNombreEmpresa());
		// Cerrar el contexto
		contexto.close();

	}

}
