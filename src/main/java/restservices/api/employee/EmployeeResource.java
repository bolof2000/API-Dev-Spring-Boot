package restservices.api.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class EmployeeResource {

    @Autowired
    EmployeeDaoService employeeDaoService;

    //TODO define methods to get all employees
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeDaoService.findAll();
    }

    //TODO define methods to create employees

    @PostMapping("/employees")
    public ResponseEntity<Object> postEmployee(@RequestBody Employee employee){
       Employee employee1 =  employeeDaoService.save(employee);

       // Created status with 201 status code
       URI location= ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").
               buildAndExpand(employee1.getId()).toUri();

         return ResponseEntity.created(location).build();
        //return employee;
    }

    // TODO define methods to get one empplooye with id

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id){

        Employee emp =   employeeDaoService.findOne(id);
        if(emp ==null){

            throw new UserNotFoundException("User not found ");
        }
        return emp ;
    }
    //check your return types and mappings
}
