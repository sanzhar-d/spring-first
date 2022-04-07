package kg.megacom.firstSpringProject.controllers;

import kg.megacom.firstSpringProject.models.GoodBye;
import kg.megacom.firstSpringProject.models.Greeting;
import kg.megacom.firstSpringProject.services.GoodByeService;
import kg.megacom.firstSpringProject.services.GreetingService;
import kg.megacom.firstSpringProject.services.impl.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/home")
public class HomeController {

    @Autowired
    private GreetingService greetingService;
    @Autowired
    private GoodByeService goodByeService;

    @GetMapping("/page")
    public String homePage(){
        return " HOME PAGE 1";
    }
    private static final String text = "Hello, %s!";

    @GetMapping("/greeting")
    public Greeting greeting (@RequestParam(value = "name", defaultValue = "World") String name){
        return new Greeting(1L, String.format(text, name));
    }

    //GreetingServiceImpl greetingService = new GreetingServiceImpl();

    @GetMapping("/privet")
    public Greeting privet(){
        return greetingService.save();
    }

    @GetMapping("/goodbye")
    public GoodBye goodBye(){
        return goodByeService.save();
    }



}
