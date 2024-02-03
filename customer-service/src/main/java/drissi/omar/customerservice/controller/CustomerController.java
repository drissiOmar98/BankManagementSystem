package drissi.omar.customerservice.controller;


import drissi.omar.customerservice.entities.Customer;
import drissi.omar.customerservice.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
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
    @PreAuthorize("hasAuthority('USER')")
    public ResponseEntity<List<Customer>> findAllCustomers() {
        return ResponseEntity.ok(service.findAllCustomers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> customerById(@PathVariable Long id){
        return ResponseEntity.ok(service.getCustomerById(id));
    }

    @GetMapping("/auth")
    @ResponseBody
    public Authentication authentication(Authentication authentication) {
        return authentication;
    }


}