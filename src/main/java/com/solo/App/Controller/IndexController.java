package com.solo.App.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/**")
public class IndexController {

	@GetMapping(value = "/", produces = {"application/xml","text/xml"})
	public XMLExample hello() {
		
		XMLExample xmlExample = new XMLExample();
		xmlExample.setId(001);
		xmlExample.setName("Solo utd");
		xmlExample.setJobTitle("Soccer professional player");
		return xmlExample;
	}
//	<XMLExample>
//	<id>1</id>
//	<jobTitle>Soccer professional player</jobTitle>
//	<name>Solo utd</name>
//	</XMLExample>
	
}
