package es.pildoras.pruebaannotations;

/*import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;*/

//@Component
public class DirectorFinanciero implements Empleados {

	/*
	 * @Autowired
	 * 
	 * @Qualifier("informeFinancieroDtoCompras")
	 */
	private CreacionInformeFinanciero informeFinanciero;
	
	
	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestión y dirección de las operaciones financieras de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return informeFinanciero.getInformeFinanciero();
	}

}
