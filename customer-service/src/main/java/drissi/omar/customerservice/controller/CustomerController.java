package drissi.omar.customerservice.controller;


import drissi.omar.customerservice.entities.Customer;
import drissi.omar.customerservice.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(
            @RequestBody Customer customer
    ) {
        service.saveCustomer(customer);
    }


    @GetMapping
    public ResponseEntity<List<Customer>> findAllCustomers() {
        return ResponseEntity.ok(service.findAllCustomers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> customerById(@PathVariable Long id){
        return ResponseEntity.ok(service.getCustomerById(id));
    }


}