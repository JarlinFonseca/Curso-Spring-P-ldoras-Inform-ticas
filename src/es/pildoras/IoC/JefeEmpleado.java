package es.pildoras.IoC;

public class JefeEmpleado implements Empleados {
	//Creación de campo tipo creaciónInforme(interfaz)

	private CreacionInformes informeNuevo;
		
	//Creación de constructor que inyecta la dependencia
	
	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

		
	@Override
	public String getTareas() {
		return "Gestiono las cuestiones relativas a mis empleados de sección";
	}


	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe presentado por el Jefe con arreglos: "+informeNuevo.getInforme();
	}

}
