package divan.springframework.model;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder
@Data
public class Documents {
    private UUID id;
    private String name;
    private Employee employee;
    private Arbiter arbiter;
    private File file;
    private Media media;
    private State state;
    private Type type;

}
