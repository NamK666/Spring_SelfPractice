package thPractice;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/index")
    public String index(Model model){
        User draco = new User("Draco","draco@gmail.com",true,true);
        model.addAttribute("user", draco);
        return "day0720/index";
    }
}
