package by.bsuir.controller;


import by.bsuir.dto.CardAndDelivery;
import by.bsuir.model.CreditCard;
import by.bsuir.model.DeliveryPlace;
import by.bsuir.model.Goods;
import by.bsuir.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.text.SimpleDateFormat;
import java.util.Calendar;
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


    @PostMapping(value = "/accept")
    public String getAccept(@ModelAttribute Goods phone,@ModelAttribute CardAndDelivery cAd,Model model ){
        Goods goods = goodsService.getGoodsById(phone.getId());
        DeliveryPlace place = new DeliveryPlace(cAd.getCity(),cAd.getAddress(),cAd.getPhoneNumberDeliv());
        CreditCard cards = new CreditCard(cAd.getCreditСardNumber(),cAd.getCvv(),cAd.getExpiryDate());
        String date = new SimpleDateFormat("yyyy.MM.dd").format(Calendar.getInstance().getTime());
        String time = new SimpleDateFormat("HH:mm").format(Calendar.getInstance().getTime());
        placeService.save(place);

        ordersService.addOrder(goods,date,time, place.getId());
        cardService.save(cards);

        List<Goods> phones = goodsService.getGoods();
        model.addAttribute("phones", phones);

        return "index";
    }

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