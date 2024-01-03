package drissi.omar.accountservice.clients;

import drissi.omar.accountservice.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@FeignClient(name = "customer-service", url = "${application.config.customers-url}")
public interface CustomerRestClient {

    @GetMapping("/customer/{id}")
    Customer findCustomerById(@PathVariable Long id);

    @GetMapping("/customers")
    List<Customer> allCustomers();
}
