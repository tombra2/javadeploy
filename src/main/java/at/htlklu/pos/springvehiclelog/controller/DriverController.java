package at.htlklu.pos.springvehiclelog.controller;

import at.htlklu.pos.springvehiclelog.enties.Driver;
import at.htlklu.pos.springvehiclelog.repositories.DriverRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping("/driver")
public class DriverController {

    private DriverRepository driverRepository;

    public DriverController(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    @GetMapping("/")
    public ModelAndView getAllDrivers() {
        List<Driver> drivers = driverRepository.findAll();
        ModelAndView modelAndView = new ModelAndView("driver.index");
        modelAndView.addObject("drivers", drivers);
        return modelAndView;
    }

}
