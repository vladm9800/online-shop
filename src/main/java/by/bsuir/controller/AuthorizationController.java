package by.bsuir.controller;

import by.bsuir.model.Clients;
import by.bsuir.service.ClientsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.xml.ws.Response;

@Controller
public class AuthorizationController {

    ClientsService clientsService;

//    @GetMapping(value = "/index")
//    String getPage(){
//        return "index";
//    }
//    @GetMapping(value = "/registration")
//    String getRegistration(){
//        return "registration";
//    }
    @PostMapping(value = "/authorization")
   public ModelAndView authorization(@ModelAttribute String login,@ModelAttribute String password){
        ModelAndView modelAndView = new ModelAndView();
        Clients clients = clientsService.getClientByLogin(login);
        if(clients==null){
          modelAndView.setViewName("authorization");
          return modelAndView;
        }else {
            if(clients.getPassword().equals(password)){
                modelAndView.setViewName("catalog");
                return modelAndView;
            }else {modelAndView.setViewName("authorization");
            return modelAndView;}
        }
    }

}
