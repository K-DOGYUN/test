package web.shoppingmall.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import web.shoppingmall.domain.categoryVO;

@RestController
@RequestMapping("/includes/*")
public class includesController {
	@GetMapping(value = "/menu")
	public List<categoryVO> test01() {
		System.out.println("menu");
		return null;
	}
}
