package restservices.api.employee;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeDaoService {

    //ToDO implement Httpmethods to post, delete, and get resource

    public static List<Employee> employees  = new ArrayList<>();
    public  static int   employeeID = 1;

    static {
        employees.add(new Employee(1,"bolofbaba@gmail.com","bolofbaba","1234 test driver","8322452388"
        ,"github.com/bolof2000",30,"engineer"));
    }


    //Todo API method to post objects
    public Employee save(Employee employee){
        if(employee.getId() == null){
            employee.setId(++employeeID);
        }employees.add(employee);
        return employee;
    }

    //TODO API method to get all objects
    public List<Employee> findAll(){
        return employees;
    }

    // TODO API method to get one object using id

    public Employee findOne(int id){
        for(Employee em:employees){
            if(em.getId()==id){
                return em;
            }

        }
        return null;
    }



    }


