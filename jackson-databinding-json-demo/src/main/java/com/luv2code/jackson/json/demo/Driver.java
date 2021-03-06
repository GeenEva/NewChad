package com.luv2code.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.Arrays;

public class Driver {

    public static void main(String[] args) {

        try{

            ObjectMapper mapper = new ObjectMapper();

            Student student = mapper.readValue(new File("jackson-databinding-json-demo/data/sample-full.json"), Student.class);

            System.out.println(student.getId() + " " +  student.getFirstName() + " " + student.getLastName() + " " +  student.isActive());

            student.getLanguages().forEach(System.out::println);
        }
        catch (Exception x){
            x.printStackTrace();
        }


    }
}
