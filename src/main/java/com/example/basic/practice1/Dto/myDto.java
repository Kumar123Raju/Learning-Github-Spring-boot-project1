package com.example.basic.practice1.Dto;

import org.springframework.stereotype.Component;

@Component
public class myDto {
    private String name;
    private String address;
    public myDto(){}

    public myDto(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "myDto{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

