package web.service;
import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("e200", "Mercedes", 2019, "Black", 50000));
        cars.add(new Car("GLK", "Mercedes", 2015, "Silver", 40000));
        cars.add(new Car("L200", "Mitsubishi", 2020, "White", 35000));
        cars.add(new Car("Optima", "KIA", 2018, "Red", 25000));
        cars.add(new Car("Patriot", "UAZ", 2017, "Green", 20000));
    }


    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getLimitedCars(int count) {
        if (count >= cars.size() || count <= 0) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}