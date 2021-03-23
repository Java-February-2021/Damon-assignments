package com.codingdojo.routing.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class DojoController {
		@RequestMapping("/dojo")
		public String index(@RequestParam() String query) {
	        return "The dojo is awesome!";
		}
		@RequestMapping("/dojo/burbank")
		public String index1(@RequestParam() String query) {
	        return "Burbank Dojo is located in Southern California";
		}
		@RequestMapping("/dojo/san-jose")
		public String index2(@RequestParam() String query) {
	        return "SJ dojo is the headquarters";
		}

}
