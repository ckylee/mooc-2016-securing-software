package sec.hellotemplates;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloTemplatesController {
     @RequestMapping("/")
    public String home() {
        return "index";
    }
    
     @RequestMapping("/video")
    public String video() {
        return "video";
    }
}
