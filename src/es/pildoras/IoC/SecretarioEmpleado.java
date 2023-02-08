package es.pildoras.IoC;

public class SecretarioEmpleado implements Empleados {

	//Creación de campo tipo creaciónInforme(interfaz)
	private CreacionInformes informeNuevo;
	
	
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la agenda de los Jefes";
	}

	@Override
	public String getInforme() {
		return "Informe generado por el secretario: "+informeNuevo.getInforme();
	}

}
