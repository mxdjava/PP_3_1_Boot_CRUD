package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("e200", "Mercedes"));
        cars.add(new Car("GLK", "Mercedes"));
        cars.add(new Car("L200", "Mitsubishi"));
        cars.add(new Car("Optima", "KIA"));
        cars.add(new Car("Patriot", "UAZ"));
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Car> numCars(int num) {
        List<Car> subCars = cars.subList(0, num);
        return subCars;
    }
}
