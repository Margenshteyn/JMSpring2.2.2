package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getAllCars() {
        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car((long) 1, "Lamborghini", 15001));
        carsList.add(new Car((long) 2, "Porsche", 1007));
        carsList.add(new Car((long) 3, "Bugatti",100));
        carsList.add(new Car((long) 4, "Maybach", 700));
        return carsList;
    }
}
