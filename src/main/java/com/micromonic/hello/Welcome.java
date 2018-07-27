package com.micromonic.hello;

 
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; 

@RestController
public class Welcome {
 
		
		@RequestMapping("/")
		public String disaplyMsg() {
			return "Welcome..!!";
		}

		
		@RequestMapping("/{input}")
		public String disaplyMsg(@PathVariable String input) {
			return "Welcome "+input+"..!!";
		}

}
