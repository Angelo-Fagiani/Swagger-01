package it.develhope.Swagger01.controllers;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value ="/name")
public class NameController {
    @GetMapping(value = "/name")
    @ApiOperation(value = "Name of controller", notes = "print out the name of controller")
    @ResponseStatus(HttpStatus.OK)
    @ApiResponses({
            @ApiResponse(code = 200, message = "Created"),
            @ApiResponse(code = 400, message = "Not found"),
            @ApiResponse(code = 500, message = "Internal server error",response = String.class)
    })
    public String nameController(@ApiParam(value = "Name of user") @RequestParam String name){
        return name;
    }
}
