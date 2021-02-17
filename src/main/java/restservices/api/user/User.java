package restservices.api.user;

import java.util.Date;

public class User {
    private Integer id;
    private String name;
    private Date DOB;
    private String address;
    private String githubAddress;
    private Character genger;

    public User(Integer id, String name, Date DOB, String address, String githubAddress, Character genger) {
        this.id = id;
        this.name = name;
        this.DOB = DOB;
        this.address = address;
        this.githubAddress = githubAddress;
        this.genger = genger;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDOB() {
        return DOB;
    }

    public String getAddress() {
        return address;
    }

    public String getGithubAddress() {
        return githubAddress;
    }

    public Character getGenger() {
        return genger;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGithubAddress(String githubAddress) {
        this.githubAddress = githubAddress;
    }

    public void setGenger(Character genger) {
        this.genger = genger;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", DOB=" + DOB +
                ", address='" + address + '\'' +
                ", githubAddress='" + githubAddress + '\'' +
                ", genger=" + genger +
                '}';
    }
}
