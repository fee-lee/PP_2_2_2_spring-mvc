package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService{

    private final CarDAO carDAO;

    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> getCars(String model, int count) {
        return carDAO.getCars().stream()
                .filter(car -> car.getModel().contains(model))
                .limit(count)
                .collect(Collectors.toList());
    }
}
