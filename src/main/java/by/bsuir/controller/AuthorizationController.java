package by.bsuir.controller;


import by.bsuir.dto.CardAndDelivery;
import by.bsuir.dto.Select;
import by.bsuir.model.CreditCard;
import by.bsuir.model.DeliveryPlace;
import by.bsuir.model.Goods;
import by.bsuir.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

@Controller
//@SessionAttributes(value = "select")
public class AuthorizationController {


    private UserService userService;
    private GoodsService goodsService;
    private CreditCardService cardService;
    private DeliveryPlaceService placeService;
    private OrdersService ordersService;



    @GetMapping(value = "/")
    public String getPage(HttpSession session, Model model) {
        List<Goods> phones = goodsService.getGoods();
        model.addAttribute("phones", phones);
        Select select = new Select();
        session.setAttribute("select",select);
        return "index";
    }

    @GetMapping(value = "/select")
    public  String getSelect(@ModelAttribute Goods phone,@SessionAttribute Select select, HttpSession session, Model model){
        if(select.getIdPhoneOne()==null){
            select.setIdPhoneOne(phone.getId());
            session.setAttribute("select",select);
        }
        else {
            select.setIdPhoneTwo(phone.getId());
            session.setAttribute("select",select);
        }
        List<Goods> phones = goodsService.getGoods();
        model.addAttribute("phones", phones);

        return "index";
    }
    @GetMapping(value = "/comparison")
    public String getComparison(HttpSession session,Select select,Model model){
        select= (Select) session.getAttribute("select");
        Goods phoneOne = goodsService.getGoodsById(select.getIdPhoneOne());
        Goods phoneTwo= goodsService.getGoodsById(select.getIdPhoneTwo());
        model.addAttribute("phoneOne",phoneOne);
        model.addAttribute("phoneTwo",phoneTwo);
        return "comparison";
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
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setGoodsService(GoodsService goodsService) {
        this.goodsService = goodsService;
    }
}