package prod.psgm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import prod.psgm.dtos.UserDTO;
import prod.psgm.services.interfaces.UserSerivce;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserSerivce userSerivce;

    @Autowired
    public UserController(UserSerivce userSerivce) {
        this.userSerivce = userSerivce;
    }

    @GetMapping("/tutors")
    public List<UserDTO> tutors() {
        return userSerivce.getAllTutors();
    }

}
