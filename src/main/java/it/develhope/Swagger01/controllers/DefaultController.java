package it.develhope.Swagger01.controllers;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DefaultController {

    @GetMapping(value = "")
    @ApiOperation(value = "Welcome message!", notes = "Prints out welcome message for the user")
    public String sayWelcomeMess(){
        return "Welcome Message";
    }
}
