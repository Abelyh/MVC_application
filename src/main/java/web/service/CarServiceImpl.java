package web.service;


import web.model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    private final List<Car> cars = new ArrayList<>();

    public List<Car> getCars() {
        return cars;
    }

    public CarServiceImpl() {
        getCars().add(new Car("Volkswagen", "Passat", "blue"));
        getCars().add(new Car("BMW", "m5", "green"));
        getCars().add(new Car("Mercedes", "w124", "red"));
        getCars().add(new Car("Toyota", "Land Cruiser", "black"));
        getCars().add(new Car("Honda", "CRV", "white"));
    }

    @Override
    public List<Car> getCarsByRequest(int count) {
        if (count <= 0) {
            return getCars();
        }
        return getCars().stream().limit(count).collect(Collectors.toList());
    }

}
