package es.pildoras.spring.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("/alumno")
public class AlumnoController {
	
	@InitBinder
	public void miBinder(WebDataBinder binder) {
		StringTrimmerEditor recortaEspaciosBlanco = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, recortaEspaciosBlanco);
	}
	
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
