package fab.the.chemist.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//l'annotation controller indique que srping gere les web request 
//les response. plus besoin d'étendre httprequest comme pour une servlet 

@Controller
public class LoginController {
	
	//methode qui retourne uniquement les info definie dans la methode
	//car annotation responsebody
	/*
	@RequestMapping(value="/login")
	@ResponseBody
	public String getInfo() {
		return "info from server";
	}
	*/
	
	//spring va chercher une servlet nommée "login" sur base de l'info de retour "login"  et des propriétés définies dans le context.xml
	@RequestMapping(value="/login")
	public String getInfo0() {
		return "login";
	}
	
}
