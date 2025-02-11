package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    // 웹에서 /hello라고 들어오면 호출
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "spring!!"); // 키가 data고 값이 hello!!
        return "hello";
    }
}
