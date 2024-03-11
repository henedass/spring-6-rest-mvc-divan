package divan.springframework.model;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder
@Data
public class Employee {
    private UUID id;
    private String firstName;
    private String lastName;
    private String position;
    private String province;
    private String serviceUnit;
    private Documents documents;

}
