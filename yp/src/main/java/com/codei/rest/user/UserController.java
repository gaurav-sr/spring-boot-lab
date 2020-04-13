package com.codei.rest.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String info() {
        return "Hello YummyPlatter";
    }


    /**
     * This method handles registration. The default media type is JSON
     *
     * @param user User object
     * @return registerResponse
     */
    @RequestMapping(path="/user", method= RequestMethod.POST)
    public ResponseEntity<RegisterResponse> register(@RequestBody User user) {
        RegisterResponse registerResponse = new RegisterResponse();
        System.out.println(user.getEmailId());
        System.out.println(user.getFirstName());
        System.out.println(user.getFamilyName());
        if(user.getEmailId()!=null){
            registerResponse.setStatus("SUCCESS");
        } else {
            registerResponse.setStatus("FAIL");
        }

        return new ResponseEntity<>(registerResponse, HttpStatus.OK);
    }

}
