package drissi.omar.accountservice.clients;

import drissi.omar.accountservice.model.Customer;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@FeignClient(name = "customer-service", url = "${application.config.customers-url}")
public interface CustomerRestClient {

    @GetMapping("/{id}")
    @CircuitBreaker(name = "customerService",fallbackMethod = "getDefaultCustomer")
    Customer findCustomerById(@PathVariable("id") Long id);

    @GetMapping("/customers")
    @CircuitBreaker(name = "customerService", fallbackMethod = "getDefaultCustomers")
    List<Customer> allCustomers();

    default Customer getDefaultCustomer(Long id,Exception exception) {
        Customer customer= new Customer();
        customer.setId(id);
        customer.setFirstName("not available");
        customer.setLastName("not available");
        customer.setEmail("not available");
        return customer;
    }

    default List<Customer> getDefaultCustomers(Exception exception){
        return List.of();
    }


}
