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

import java.util.List;

@Controller
public class AdminController {

    private UserService userService;
    private OrdersService ordersService;

    @GetMapping(value = "/admin")
    String getAdmin(){
        return "admin";
    }

    @PostMapping(value = "/admin/manageUsers")
    String getUsers(Model model){
        List<User> user =  userService.getAll();
        model.addAttribute("users",user);
        return "manageUsers";
    }

    @PostMapping(value = "/admin/manageUsers/delete")
    String deleteUsers(@ModelAttribute User user,Model model){
        userService.deleteCliens(user);
        List<User> user1 =  userService.getAll();
        model.addAttribute("users",user1);
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
    @Autowired
    public void setOrdersService(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
