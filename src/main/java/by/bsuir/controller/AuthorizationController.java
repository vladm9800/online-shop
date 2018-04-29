package by.bsuir.controller;

import by.bsuir.model.Goods;
import by.bsuir.service.ClientsService;
import by.bsuir.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AuthorizationController {


    private ClientsService clientsService;
    private GoodsService goodsService;

    @GetMapping(value = "/")
    public String getPage(Model model) {
        List<Goods> phones = goodsService.getGoods();
        model.addAttribute("phones", phones);
        return "index";
    }
    @GetMapping(value = "/registration")
    String getRegistration() {
        return "registration";
    }

    @GetMapping(value = "/login")
    String getLogin() {
        return "login";
    }

    @PostMapping(value = "/phone")
    public String getLogin13(@ModelAttribute Goods phone, Model model) {
        Goods goods = goodsService.getGoodsById(phone.getId());
        model.addAttribute("phone",goods);
        return "phone";
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


    @Autowired
    public void setClientsService(ClientsService clientsService) {
        this.clientsService = clientsService;
    }

    @Autowired
    public void setGoodsService(GoodsService goodsService) {
        this.goodsService = goodsService;
    }
}