package restservices.api.microservice;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Address {
    private String city;
    private String country;
    private String street;

}
