package kr.ac.cu.gbict.bknd_class_04;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HelloController {
    
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("bgimage", "home-bg.jpg");
        model.addAttribute("heading", "Clean Blog");
        model.addAttribute("subheading", "A Blog Theme by Start Bootstrap");
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("bgimage", "about-bg.jpg");
        model.addAttribute("heading", "블로그 소개");
        model.addAttribute("subheading", "소개글을 적는 공간");
        return "about";
    }

    @GetMapping({"/post", "/post/{postid}"})
    public String post(Model model, @PathVariable(value = "postid", required=false) Integer postid) {
        model.addAttribute("bgimage", "post-bg.jpg");
        model.addAttribute("heading", "샘플 포스트");
        model.addAttribute("subheading", "샘플 기사 올리는 공간");
        model.addAttribute("postid", postid);
        return "post";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("bgimage", "contact-bg.jpg");
        model.addAttribute("heading", "연락처");
        model.addAttribute("subheading", "연락처 보이는 공간");
        return "contact";
    }
}
