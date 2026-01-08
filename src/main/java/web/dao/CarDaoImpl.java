package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDAO{

    private final List<Car> cars = new ArrayList<>();

    public List<Car> getCars() {
        return cars;
    }

    public CarDaoImpl() {
        getCars().add(new Car("Volkswagen", "Passat", "blue"));
        getCars().add(new Car("BMW", "m5", "green"));
        getCars().add(new Car("Mercedes", "w124", "red"));
        getCars().add(new Car("Toyota", "Land Cruiser", "black"));
        getCars().add(new Car("Honda", "CRV", "white"));
    }

    @Override
    public List<Car> getByCount(int count) {
        if (count <= 0) {
            return getCars();
        }
        return getCars().stream().limit(count).collect(Collectors.toList());
    }
}
