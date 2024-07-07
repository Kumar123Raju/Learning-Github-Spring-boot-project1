package com.example.basic.practice1.Service;


import com.example.basic.practice1.Dto.myDto;
import com.example.basic.practice1.Validator.myValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class myService {

    @Autowired
    private myValidate myvalidate;

    public boolean bussinessValidate(myDto mydto){
        if(myvalidate.validate(mydto)) return true;
        else return false;

    }



}
