package by.bsuir.controller;

import by.bsuir.model.Clients;
import by.bsuir.service.ClientsService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AuthorizationController {


    private ClientsService clientsService;

    @Autowired
    public void setClientsService(ClientsService clientsService) {
        this.clientsService = clientsService;
    }

    @GetMapping(value = "/index")
    String getPage() {
        return "login";
    }

    @RequestMapping(value = "/main")
    public String mainPage(Model model) {
        model.addAttribute("users", clientsService.getAll());
        return "main";
   }

//    @GetMapping(value = "/index")
//    String getRegistration(){
//        return "index";
//    }
//    @PostMapping(value = "/authorization")
//   public ModelAndView authorization(@ModelAttribute String login,@ModelAttribute String password){
//        ModelAndView modelAndView = new ModelAndView();
//        Clients clients = clientsService.getClientByLogin(login);
//        if(clients==null){
//          modelAndView.setViewName("authorization");
//          return modelAndView;
//        }else {
//            if(clients.getPassword().equals(password)){
//                modelAndView.setViewName("catalog");
//                return modelAndView;
//            }else {modelAndView.setViewName("authorization");
//            return modelAndView;}
//        }
//    }
//    @GetMapping(value = "/authorcization")
//    public ModelAndView auth(){
//       ModelAndView modelAndView = new ModelAndView("authorization");
//
//       return modelAndView;
//    }
//    @GetMapping(value = "/index")
//    public void ind(Model model){
//
//           model.addAttribute("clients",clientsService.getAll());
//
//
//    }





}