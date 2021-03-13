package ir.sunsor.hellomvc.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SecondController {

    @GetMapping("/second")
    public String second(@RequestParam("message") String message,
                         RedirectAttributes ra){
        ra.addAttribute("message", message);
        ra.addAttribute("myName", "Hassan_Shokoohi");
        return "redirect:/index";
    }

    @GetMapping("/testSessionAtt")
    public void test(@SessionAttribute("myNumber") Integer myNumber,
                     @SessionAttribute("myModel") String myModel){

        System.out.println(myModel);
        System.out.println(myNumber);
    }
}




