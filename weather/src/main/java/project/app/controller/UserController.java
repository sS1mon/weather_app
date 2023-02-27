package project.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import project.app.model.dto.UserRegDto;

@RestController
public class UserController {


    @PostMapping("/register")
    public ResponseEntity<Object> register(@RequestBody UserRegDto userRegDto){

    }
}
