package org.example.Services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.Entities.User;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class UserBookingServices
{
    private User user;


    private List<User> userList;

           private ObjectMapper OBJECT_MAPPER = new ObjectMapper();

           private static final String USER_PATH = "../localDB/user.json";
           public UserBookingServices(User user1) throws IOException {
           this.user=user1;

           File users = new File(USER_PATH);
           userList = OBJECT_MAPPER.readValue(users,new TypeReference<List<User>>(){});


    }



    public Boolean loginUser(){
        Optional<User> foundUser = userList.stream().filter(user1 -> {
            return user1.getName().equals(user.getName()) && userServiceUtil.checkPassword(user.getPassword(),user);

        }).findFirst();
    }

   public Boolean signUP(User user1){
               try {
                   userList.add(user1);
                   saveUserListtoFile();
                   return Boolean.TRUE;
               }catch (IOException ex){
                   return Boolean.FALSE;
               }
   }


}
