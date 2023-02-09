package es.pildoras.pruebaannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComercialExperimentado implements Empleados {

	private CreacionInformeFinanciero creacionInformeFinanciero;
	
	@Autowired
	public ComercialExperimentado(CreacionInformeFinanciero creacionInformeFinanciero) {
		this.creacionInformeFinanciero = creacionInformeFinanciero;
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
