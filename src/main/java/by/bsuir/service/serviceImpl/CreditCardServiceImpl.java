package by.bsuir.service.serviceImpl;

import by.bsuir.dao.CreditCardDao;
import by.bsuir.model.CreditCard;
import by.bsuir.service.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CreditCardServiceImpl implements CreditCardService {

    private CreditCardDao cardDao;

    @Override
    @Transactional
    public void save(CreditCard card,Long userId) {
        card.setIdClient(userId);
        cardDao.save(card);

    }
    @Autowired
    public void setCardDao(CreditCardDao cardDao) {
        this.cardDao = cardDao;
    }
}
