package by.bsuir.service;

import by.bsuir.model.Goods;
import by.bsuir.model.Orders;

import java.util.List;

public interface OrdersService {
    void addOrder(Goods phone, String date,String time,Long idplace,Long userId);
    List<Orders> getAll();
    void deleteOrder(Orders order);
}
