package restservices.api.user;

import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class UserDaoService {


    //ToDO Create a User objects with some values
   private static List<User> users = new ArrayList<>();
   private static int userID = 8;
   static{
       users.add(new User(1,"BOLOFINDE",new Date(),"1234 CENTER DRIVER","https://github.com/bolof",
               'M'));
       users.add(new User(2,"Adriel",new Date(),"4556 CENTER DRIVER","https://github.com/bolof21",
               'M'));
       users.add(new User(3,"RERE",new Date(),"1234 CENTER DRIVER","https://github.com/bolof2000",
               'M'));

   }
    //TODO Create methods to get all users
    public  List<User> getAllUsers(){
       return users;
    }
    // TODO create methods to create users
    public User createUser(User user){
       if(user.getId() == null){
           user.setId(++userID);
       }
       users.add(user);
       return user;

    }
    //TODO create methods to get user given a particular ID
    public User getUserWithId(int id){
       for(User user:users){
           if(user.getId()== id){
               return user;
           }
       }
       return null;
    }
}
