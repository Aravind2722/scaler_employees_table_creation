package org.example.scaler_employees_table_creation.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;

@Entity
@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class PermanentEmployee extends Employee {
    @Id
    private String email;
    private Double costToCompany;
}
