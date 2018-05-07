package by.bsuir.service.serviceImpl;

import by.bsuir.dao.OrderDao;
import by.bsuir.model.Goods;
import by.bsuir.model.Orders;
import by.bsuir.service.OrdersService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {

    private OrderDao orderDao;

    @Override
    @Transactional
    public void addOrder(Goods phone, String date,String time,Long idplace,Long userId){
        Orders orders = new Orders();
        orders.setGoods(new ArrayList<>());
        orders.getGoods().add(phone);
        orders.setOrderDate(date);
        orders.setTimeOfOrder(time);
        orders.setOrderCost(phone.getCost());
        orders.setIdDeliveryPlace(idplace);
        orders.setIdClient(userId);
        orders.setOrderStatus("Подготовка к отправке");
        orders.setPayment("Оплачено");
        orders.setDelivery("Курьером");
        orderDao.save(orders);
    }

    @Override
    @Transactional
    public void deleteOrder(Orders order) {
        orderDao.delete(order);
    }

    @Override
    @Transactional
    public List<Orders> getAll() {

        return (List<Orders>) orderDao.findAll();
    }

    @Override
    @Transactional
    public void changeStatus(Orders orders) {
        Orders orders1= orderDao.findById(orders.getId()).get();
        orders1.setOrderStatus("Доставлено");
        orderDao.save(orders1);
    }



    @Autowired
    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }
}
