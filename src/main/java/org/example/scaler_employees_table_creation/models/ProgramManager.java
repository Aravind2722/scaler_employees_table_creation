package org.example.scaler_employees_table_creation.models;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class ProgramManager extends PermanentEmployee {
    private Long featuresCompleted;
}

