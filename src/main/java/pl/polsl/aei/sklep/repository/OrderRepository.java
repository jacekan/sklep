package pl.polsl.aei.sklep.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.polsl.aei.sklep.repository.entity.Order;
import pl.polsl.aei.sklep.repository.entity.User;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
    Order findOrderByUserAndOrderDateIsNull(User user);
}
