package by.bsuir.service.serviceImpl;

import by.bsuir.dao.GoodsDao;
import by.bsuir.model.Goods;
import by.bsuir.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    private GoodsDao goodsDao;

    @Override
    public Goods getGoodsById(Long id) {
        return goodsDao.findById(id).get();
    }

    @Override
    public List<Goods> getGoods() {
        return (List<Goods>) goodsDao.findAll();
    }


    @Autowired
    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }
}
