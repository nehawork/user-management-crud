package com.learn.usermanagement.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import springfox.documentation.annotations.ApiIgnore;

@RestController
@ApiIgnore
public class AppController {

	@GetMapping("/")
	public RedirectView GetAppDocumentation() {
		return new RedirectView("swagger-ui/");
	}
}
