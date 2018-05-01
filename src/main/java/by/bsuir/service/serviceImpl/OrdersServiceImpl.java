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

    public void addOrder(Goods phone){
        Orders orders = new Orders();
        orders.setGoods(new ArrayList<>());
        orders.getGoods().add(phone);
        orderDao.save(orders);
    }

    @Autowired
    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }
}
