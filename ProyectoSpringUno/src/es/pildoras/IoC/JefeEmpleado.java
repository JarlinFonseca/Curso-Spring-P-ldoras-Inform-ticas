package es.pildoras.IoC;

public class JefeEmpleado implements Empleados {
	//Creación de campo tipo creaciónInforme(interfaz)

	private CreacionInformes informeNuevo;
	
	private String email;
	
	private String nombreEmpresa;
	
	
	//Creación de constructor que inyecta la dependencia
	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getNombreEmpresa() {
		return nombreEmpresa;
	}


	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
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
