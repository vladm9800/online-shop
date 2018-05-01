package by.bsuir.service.serviceImpl;


import by.bsuir.dao.DeliveryPlaceDao;
import by.bsuir.model.DeliveryPlace;
import by.bsuir.service.DeliveryPlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryPlaceServiceImpl implements DeliveryPlaceService {
    private DeliveryPlaceDao placeDao;

    @Override
    public void save(DeliveryPlace place) {
        placeDao.save(place);
    }

    @Autowired
    public void setPlaceDao(DeliveryPlaceDao placeDao) {
        this.placeDao = placeDao;
    }
}
