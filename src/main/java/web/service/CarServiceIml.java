package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceIml implements CarService{
    @Override
    public List<Car> getCars(int count) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Porsche", 2015, "German"));
        carList.add(new Car("Opel", 2010, "German"));
        carList.add(new Car("Reno", 2013, "Roman"));
        carList.add(new Car("Lada", 2020, "Russia"));
        carList.add(new Car("BMW", 1998, "German"));

        return count < 0 ?
                carList :
                carList.stream().limit(count).collect(Collectors.toList());
    }
}
