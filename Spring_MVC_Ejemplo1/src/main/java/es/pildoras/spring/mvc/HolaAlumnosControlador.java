package es.pildoras.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HolaAlumnosControlador {
	
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario() { //proporciona el formulario
		return "HolaAlumnosFormulario";
	}
	
	@RequestMapping(value="/procesarFormulario", method=RequestMethod.POST)
	public String procesarFormulario() {
		return "HolaAlumnosSpring";
	}
}
