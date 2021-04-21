package restservices.api.microservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @RequestMapping("/employee")
    public Employee getEmployee(){
        Employee employee = Employee.builder()
                            .id(1)
                            .email("bolofbaba@gmail.com")
                            .phone(8322452388L)
                            .address(Address.builder().city("Denver").country("USA").street("2575 SWEET WIND").build())
                            .name("BOLOFINDE")
                            .build();
        return employee;
    }
}
