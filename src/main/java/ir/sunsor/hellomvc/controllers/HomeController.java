package ir.sunsor.hellomvc.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("/")
public class HomeController {


    @RequestMapping(method = RequestMethod.GET)
    public String showMainPage(){

        return "main-page";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/index")
    public String showIndex(){
        return "index";
    }
}




