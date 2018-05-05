package by.bsuir.service.serviceImpl;

import by.bsuir.dao.OrderDao;
import by.bsuir.model.Goods;
import by.bsuir.model.Orders;
import by.bsuir.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class OrdersServiceImpl implements OrdersService {

    private OrderDao orderDao;

    public void addOrder(Goods phone, String date,String time,Long idplace,Long userId){
        Orders orders = new Orders();
        orders.setGoods(new ArrayList<>());
        orders.getGoods().add(phone);
        orders.setOrderDate(date);
        orders.setTimeOfOrder(time);
        orders.setOrderCost(phone.getCost());
        orders.setIdDeliveryPlace(idplace);
        orders.setIdClient(userId);
        orderDao.save(orders);
    }

    @Autowired
    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }
}
