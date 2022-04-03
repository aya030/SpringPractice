package com.example.demo.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@GetMapping("/hello-world")
	public String getHello(Model model) {

        //ModelクラスのaddAttributeメソッドにキー名と値を指定
		model.addAttribute("hello", "GoodMorning! ");
		model.addAttribute("name", "Tom");

		// helloWorld.htmlに遷移する
		return "hello-world";
	}
	
	@PostMapping("/hello-world")
	public String postHello(@RequestParam("nameResponse") String name,Model model) {

		// ModelクラスのaddAttributeメソッドにキー名と値を指定
		model.addAttribute("hello", "GoodNight! ");
		model.addAttribute("name", "Tom");
		model.addAttribute("nameResponse", name);

		// helloResponse.htmlに遷移する
		return "helloworld/hello-response";
	}
}
