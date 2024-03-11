package divan.springframework.model;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder
@Data
public class Arbiter {
    private UUID id;
    private String firstName;
    private String lastName;
    private Documents documents;

}
