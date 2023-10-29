package com.example.userReg.registration;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/registration")
@AllArgsConstructor
public class RegController {
    private RegService regService;
    public String register(@RequestBody RegistratioRequest request){
        return regService.register(request);
    }
}
