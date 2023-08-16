package kr.co.jhta.springboot22.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String hello(Model model) {
		model.addAttribute("msg", "안녕하세요");
		return "home";
	}

}
