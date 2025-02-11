package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    // 웹에서 /hello라고 들어오면 호출
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!!"); // 키가 data고 값이 hello!!
        return "hello";
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name); // 키와 값
        return "hello-template"; // hello-template.html 파일 실행
    }
}
