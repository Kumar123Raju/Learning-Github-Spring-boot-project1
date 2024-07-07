package com.example.basic.practice1.Validator;

import com.example.basic.practice1.Dto.myDto;
import org.springframework.stereotype.Component;

@Component
public class myValidate {

    public boolean validate(myDto mydto){
           if(mydto.getName().equals("India")) return true;
           else return false;
    }


}
