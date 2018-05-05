package by.bsuir.service;

import by.bsuir.model.Goods;

public interface OrdersService {
    void addOrder(Goods phone, String date,String time,Long idplace);
}
