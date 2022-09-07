package web.shoppingmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/includes/*")
public class test {
	@GetMapping("/menu")
	public void test01() {
		
	}
}
