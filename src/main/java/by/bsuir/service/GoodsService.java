package by.bsuir.service;

import by.bsuir.model.Goods;

import java.util.List;

public interface GoodsService {
    Goods getGoodsById(Long id);
    List<Goods> getGoods();
}
