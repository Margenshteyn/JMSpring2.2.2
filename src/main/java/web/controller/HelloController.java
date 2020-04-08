package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class HelloController {

	@Autowired
	CarService carService;

	@RequestMapping(value = "hello", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.5 version by march'20 ");
		model.addAttribute("messages", messages);
		return "hello";
	}

	@RequestMapping(value = "cars", method = RequestMethod.GET)
	public String getAllCars(ModelMap modelMap) {
		modelMap.addAttribute("cars", carService.getAllCars());  // по attributeName "cars" выдергиваем в jsp
		return "cars";															// cars наше название файла jsp
	}
	
}