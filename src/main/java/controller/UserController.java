package controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;


@RestController

@CrossOrigin(origins="*", maxAge = 3600)

@RequestMapping("/user")

public class UserController {

}
