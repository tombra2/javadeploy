package at.htlklu.pos.springvehiclelog.repositories;

import at.htlklu.pos.springvehiclelog.enties.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Integer>
{
}
