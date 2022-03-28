package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAOImpl implements CarDAO{

    @Override
    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("VAZ", 1 , 1981));
        cars.add(new Car("GAZ", 1 , 1964));
        cars.add(new Car("ZAZ", 1 , 1984));
        cars.add(new Car("KAMAZ", 1 , 2013));
        cars.add(new Car("JAZZ", 1 , 2022));
    return cars;
    }
}
