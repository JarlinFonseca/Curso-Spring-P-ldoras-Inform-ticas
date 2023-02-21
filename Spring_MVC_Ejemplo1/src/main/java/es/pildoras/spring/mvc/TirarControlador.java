package es.pildoras.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/secundario")
public class TirarControlador {

	@RequestMapping(value="/procesarFormulario2", method=RequestMethod.POST)
	//public String otroProcesoFormulario(HttpServletRequest request, Model modelo) {
	public String otroProcesoFormulario(@RequestParam("nombreAlumno")String nombre , Model modelo) {
		//String nombre = request.getParameter("nombreAlumno");
		nombre+=" es el peor alumno";
		
		String mensajeFinal="¿Quién es el peor alumno? "+nombre;
		
		// Agregando info al modelo
		modelo.addAttribute("mensajeClaro", mensajeFinal);
		
		return "HolaAlumnosSpring";
	}
}
