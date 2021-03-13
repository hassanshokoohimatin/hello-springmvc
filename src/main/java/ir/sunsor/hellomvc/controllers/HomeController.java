package ir.sunsor.hellomvc.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;

@Controller("/")

@SessionAttributes({"myModel", "myNumber"})

public class HomeController {

    @ModelAttribute("myModel")
    public String myModel(){
        return "Ali";
    }

    @ModelAttribute("myNumber")
    public Integer myInteger(){
        return 100;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String showMainPage(ModelMap modelMap){
        return "main-page";
    }

    //...


    @RequestMapping(method = RequestMethod.GET, value = "/index")
    public String  showIndex(ModelMap modelMap,
                             @RequestParam("message") String message,
                             @RequestParam("myName") String myName){

        List<String> names = Arrays.asList("Ali", "Hassan", "Mohammad");

        modelMap.addAttribute("names", names);
        modelMap.addAttribute("message", message);
        modelMap.addAttribute("myName", myName);

        return "index";
    }

//    @GetMapping("/form")
//    public void form(@RequestParam(value = "first_name") String firstName,
//                     @RequestParam (value = "last_name") String lastName){
//
//
//        System.out.println(firstName + " " + lastName);
//
//    }

    @GetMapping("/form")
    public void form(@RequestParam (value = "parameter_one") Integer requestParameter){

        System.out.println(requestParameter);
    }

    @GetMapping("/form/{id}/{name}")
    public void form(@PathVariable (value = "id") Integer id,
                     @PathVariable (value = "name") String name){
        System.out.println(id + " " + name);
    }
}






