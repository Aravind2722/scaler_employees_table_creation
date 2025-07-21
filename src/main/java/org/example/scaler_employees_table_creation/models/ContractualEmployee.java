package org.example.scaler_employees_table_creation.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;

@Entity
@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class ContractualEmployee extends Employee {
    @Id
    private String alias;

    private  Double hourlyRenumeration;
}
