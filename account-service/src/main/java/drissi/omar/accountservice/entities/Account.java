package drissi.omar.accountservice.entities;


import drissi.omar.accountservice.enums.AccountType;
import drissi.omar.accountservice.model.Customer;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Account {

    @Id
    private String accountId;

    private Double balance;

    private LocalDate createAt;

    private String currency;

    @Enumerated(EnumType.STRING)
    private AccountType type;

    @Transient
    private Customer customer;

    private Long customerId;


}
