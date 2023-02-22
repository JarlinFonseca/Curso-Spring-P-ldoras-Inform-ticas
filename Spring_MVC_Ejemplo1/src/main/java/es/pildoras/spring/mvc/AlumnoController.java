package es.pildoras.spring.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("/alumno")
public class AlumnoController {
	
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario(Model model) {
		Alumno alumno = new Alumno();
		model.addAttribute("alumno", alumno);
		return "alumnoRegistroFormulario";
	}
	
	@RequestMapping(value = "/procesarFormulario", method = RequestMethod.POST)
	public String procesarFormulario(@Valid @ModelAttribute("alumno") Alumno alumno, 
			BindingResult resultadoValidacion){
		if(resultadoValidacion.hasErrors()) {
			return "alumnoRegistroFormulario";
		}else {
			return "confirmacionRegistroAlumno";
		}
	}

}
