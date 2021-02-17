package restservices.api.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserDaoService userDaoService;

    @GetMapping("/users")
    public List<User> getUser(){
        return userDaoService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public User getUserID(@PathVariable int id){
        return userDaoService.getUserWithId(id);
    }

    @PostMapping("/users")
    public ResponseEntity<Object> createUserAPI(@RequestBody User user){
        User savedUser = userDaoService.createUser(user);

        URI location = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id").buildAndExpand(savedUser.getId()).toUri();
        return ResponseEntity.created(location).build();
    }
}
