package com.example.basic.practice1.Controller;

import com.example.basic.practice1.Dto.myDto;
import com.example.basic.practice1.Service.myService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController("/base")
public class myController {
//    @Autowired
//    private myDto mydto;

    @Autowired
    private myService myservice;

    @PostMapping("/validate")
    public ResponseEntity<myDto> validate(@RequestBody myDto mydto){
//        Map<Integer, Boolean> result=new HashMap<>();
        if(myservice.bussinessValidate(mydto)){
            return new ResponseEntity<>(mydto, HttpStatus.CREATED);
        }
        System.out.println("There is may be some issue with the code or with given data");

        return new ResponseEntity<>(mydto,HttpStatus.CREATED);

    }




}
