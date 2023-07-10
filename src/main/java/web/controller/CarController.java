package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import web.DAO.CarDao;

@Controller
@RequestMapping("/cars")
public class CarController {
    private final CarDao carDao;

    public CarController(CarDao carDao) {
        this.carDao = carDao;
    }

    @GetMapping()
    public String AllCars(Model model) {
        model.addAttribute("cars", carDao.getCars());
        return "cars";
    }
    @GetMapping("?count={num}")
    public String numOut (@PathVariable("num") int num, Model model) {
        model.addAttribute("cars", carDao.numCars(num));
        return "cars?count={num}";
    }
}
