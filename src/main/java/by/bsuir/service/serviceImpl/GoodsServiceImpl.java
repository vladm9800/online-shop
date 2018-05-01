package by.bsuir.service.serviceImpl;

import by.bsuir.dao.GoodsDao;
import by.bsuir.model.Goods;
import by.bsuir.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    private GoodsDao goodsDao;

    @Override
    @Transactional
    public void save(Goods goods) {
        goodsDao.save(goods);
    }

    @Override
    @Transactional
    public Goods getGoodsById(Long id) {
        return goodsDao.findById(id).get();
    }

    @Override
    @Transactional
    public List<Goods> getGoods() {
        return (List<Goods>) goodsDao.findAll();
    }


    @Autowired
    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }
}
