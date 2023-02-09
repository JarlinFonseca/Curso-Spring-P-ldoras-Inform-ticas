package es.pildoras.pruebaannotations;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class ComercialExperimentado implements Empleados, InitializingBean, DisposableBean  {
	
	@Autowired
	@Qualifier("informeFinancieroTrim4") // been ID que debe utilizar
	private CreacionInformeFinanciero creacionInformeFinanciero;
	
	
	  public ComercialExperimentado(){
	  
	  }
	 
	
		/*
		 * @Autowired public ComercialExperimentado(CreacionInformeFinanciero
		 * creacionInformeFinanciero) { this.creacionInformeFinanciero =
		 * creacionInformeFinanciero; }
		 */
	
		/*
		 * @Autowired public void q(CreacionInformeFinanciero creacionInformeFinanciero)
		 * { this.creacionInformeFinanciero = creacionInformeFinanciero; }
		 */
	  
	  // No sirve con el patrón de diseño Prototype(Spring no maneja el ciclo completo de un Bean),
	  //solo sirve con Singleton.
	  
	  // Ejecución de código después de creación del Bean
	  // Se ejecuta despues de que se crea el bean (remplaza @PostConstruct )
	  public void afterPropertiesSet()  {
		  System.out.println("Ejecutado tras creación de Bean");
	  }
	  
	  // Ejecuación de código después de apagado contenedor Spring
	  // Se ejecuta antes de la destruccion del bean (remplaza @PreDestroy )
	  public void destroy() {
		  System.out.println("Ejecutando antes de la destrucción");
	  }
	  


	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vender más!";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe generado por el comercial: "+creacionInformeFinanciero.getInformeFinanciero();
	}

}
