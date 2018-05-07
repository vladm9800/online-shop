package by.bsuir.controller;

import by.bsuir.model.Orders;
import by.bsuir.model.User;
import by.bsuir.service.OrdersService;
import by.bsuir.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Controller

public class AdminController {

    private UserService userService;
    private OrdersService ordersService;

    @GetMapping(value = "/admin")
    public String getAdmin(){
        return "admin";
    }

    @PostMapping(value = "/admin/manageUsers")
    public String getUsers(Model model){
        List<User> user =  userService.getAll();
        model.addAttribute("users",user);
        return "manageUsers";
    }

    @PostMapping(value = "/admin/manageUsers/delete")
    public String deleteUsers(@ModelAttribute User user,Model model){
        userService.deleteCliens(user);
        List<User> user1 =  userService.getAll();
        model.addAttribute("users",user1);
        return "manageUsers";
    }
    @PostMapping(value="/admin/manageUsers/ban")
    public String getBan(@ModelAttribute User user,Model model){
        User user1= userService.findUserByLogin(user.getLogin());
        if(user1.getActive()==1){
            user1.setActive(0);}

        else {
            user1.setActive(1);

        }
        userService.changeStaus(user1);

        List<User> user2 =  userService.getAll();
        model.addAttribute("users",user2);
        return "manageUsers";
    }

    @PostMapping(value = "/admin/manageOrders")
    String getOrders(Model model){
        List<Orders> orders =  ordersService.getAll();

        model.addAttribute("orders",orders);
        return "manageOrders";
    }

    @PostMapping(value = "/admin/manageOrders/delete")
    String deleteOrders(@ModelAttribute Orders order,Model model){
       ordersService.deleteOrder(order);
        List<Orders> orders =  ordersService.getAll();
        model.addAttribute("orders",orders);
        return "manageOrders";
    }
    @PostMapping(value = "/admin/manageOrders/changeStatus")
    String changeStatus(@ModelAttribute Orders order,Model model){

        ordersService.changeStatus(order);
        List<Orders> orders =  ordersService.getAll();
        model.addAttribute("orders",orders);
        return "manageOrders";
    }
    @GetMapping(value = "/error")
    public String getError(){
        return "error";
    }


    @Autowired
    public void setOrdersService(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
