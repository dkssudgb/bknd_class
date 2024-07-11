package kr.ac.cu.gbict.bknd_class_02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/about")
    public String about() {
        return "about";
    }
    @GetMapping("/post")
    public String post() {
        return "post";
    }
    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
}
