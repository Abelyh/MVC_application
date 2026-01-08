package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import web.dao.CarDAO;
import web.model.Car;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private final CarDAO dao;

    @Autowired
    public CarServiceImpl(CarDAO dao) {
        this.dao = dao;
    }

    @Override
    public List<Car> getByCount(int count) {
        return dao.getByCount(count);
    }
}
