package org.example.scaler_employees_table_creation.models;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Ta extends ContractualEmployee {
    private Long numberOfHelpRequests;
}
