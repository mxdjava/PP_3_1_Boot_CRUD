package web.Service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    private List<Car> cars = new ArrayList<>();
    public List<Car> getCars() {
        cars.add(new Car("e200", "Mercedes"));
        cars.add(new Car("GLK", "Mercedes"));
        cars.add(new Car("L200", "Mitsubishi"));
        cars.add(new Car("Optima", "KIA"));
        cars.add(new Car("Patriot", "UAZ"));
        return cars;
    }
}
