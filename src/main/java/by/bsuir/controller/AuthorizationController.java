package by.bsuir.controller;


import by.bsuir.dto.CardAndDelivery;
import by.bsuir.model.CreditCard;
import by.bsuir.model.DeliveryPlace;
import by.bsuir.model.Goods;
import by.bsuir.model.Orders;
import by.bsuir.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
public class AuthorizationController {


    private ClientsService clientsService;
    private GoodsService goodsService;
    private CreditCardService cardService;
    private DeliveryPlaceService placeService;
    private OrdersService ordersService;

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
    public String getPhone(@ModelAttribute Goods phone, Model model) {
        Goods goods = goodsService.getGoodsById(phone.getId());
        model.addAttribute("phone",goods);
        return "phone";
    }

    @PostMapping(value = "/pay")
    public String getCard(@ModelAttribute Goods phone, Model model){

        Goods goods= goodsService.getGoodsById(phone.getId());
        model.addAttribute("phone",goods);
        model.addAttribute("pay",new CardAndDelivery());

        return "pay";
    }

//    @PostMapping(value = "/card")
//    public String getPp(@ModelAttribute Goods phone,@ModelAttribute DeliveryPlace pay, Model model){
//        Goods goods= goodsService.getGoodsById(phone.getId());
//        model.addAttribute("phone",goods);
//        model.addAttribute("card",new CreditCard());
//        DeliveryPlace deliveryPlace = new DeliveryPlace(pay.getCity(),pay.getAddress(),pay.getPhoneNumberDeliv());
//
//        placeService.save(deliveryPlace);
//        return "card";
//    }

    @PostMapping(value = "/accept")
    public String getAccept(@ModelAttribute Goods phone,@ModelAttribute CardAndDelivery cAd,Model model ){
        Goods goods = goodsService.getGoodsById(phone.getId());
        DeliveryPlace place = new DeliveryPlace(cAd.getCity(),cAd.getAddress(),cAd.getPhoneNumberDeliv());
        CreditCard cards = new CreditCard(cAd.getCreditСardNumber(),cAd.getCvv(),cAd.getExpiryDate());

          placeService.save(place);
          place.getId();
          Orders orders = new Orders();

//        ordersService.addOrder(orders);
//        cardService.save(cards);

        List<Goods> phones = goodsService.getGoods();
        model.addAttribute("phones", phones);

    return "index";
    }


//@GetMapping(value = "/pay")
//    public String getPay(@ModelAttribute Goods phone, Model model){
//    Goods goods= goodsService.getGoodsById(phone.getId());
//        model.addAttribute("phone",goods);
//        return "pay";
//}

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
    public void setOrdersService(OrdersService ordersService) {
        this.ordersService = ordersService;
    }


    @Autowired
    public void setCardService(CreditCardService cardService) {
        this.cardService = cardService;
    }
    @Autowired
    public void setPlaceService(DeliveryPlaceService placeService) {
        this.placeService = placeService;
    }

    @Autowired
    public void setClientsService(ClientsService clientsService) {
        this.clientsService = clientsService;
    }

    @Autowired
    public void setGoodsService(GoodsService goodsService) {
        this.goodsService = goodsService;
    }
}