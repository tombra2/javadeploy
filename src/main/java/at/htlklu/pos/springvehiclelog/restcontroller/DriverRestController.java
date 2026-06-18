package at.htlklu.pos.springvehiclelog.restcontroller;

import java.util.ArrayList;
import java.util.List;
import at.htlklu.pos.springvehiclelog.enties.Driver;
import at.htlklu.pos.springvehiclelog.repositories.DriverRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/driver")
public class DriverRestController {

    private DriverRepository driverRepository;

    public DriverRestController(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    @GetMapping("/")
    public List<Driver> findAll(){
        return driverRepository.findAll();
    }
}
