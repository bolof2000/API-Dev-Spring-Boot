package restservices.api.microservice;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Employee {
    private int id;
    private String name;
    private Address address;
    private String email;
    private long phone;
}
