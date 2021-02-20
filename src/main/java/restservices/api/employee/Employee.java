package restservices.api.employee;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class Employee {

    //Todo Define all the attributes of the employee class and setters and getters/constructors

    private Integer id;
    private String name;
    private String email;
    private String address;
    private String phone_Number;
    private String website;
    private int age;
    private String jobTitle;

    protected Employee(){

    }

    public Employee(Integer id, String name, String email, String address, String phone_Number, String website, int age, String jobTitle) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone_Number = phone_Number;
        this.website = website;
        this.age = age;
        this.jobTitle = jobTitle;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone_Number() {
        return phone_Number;
    }

    public String getWebsite() {
        return website;
    }

    public int getAge() {
        return age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone_Number(String phone_Number) {
        this.phone_Number = phone_Number;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phone_Number='" + phone_Number + '\'' +
                ", website='" + website + '\'' +
                ", age=" + age +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
