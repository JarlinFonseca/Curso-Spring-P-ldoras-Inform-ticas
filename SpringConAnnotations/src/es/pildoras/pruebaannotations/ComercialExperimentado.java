package es.pildoras.pruebaannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ComercialExperimentado implements Empleados {
	
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
