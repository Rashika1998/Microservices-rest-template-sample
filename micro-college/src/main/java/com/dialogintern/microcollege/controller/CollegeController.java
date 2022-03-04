package com.dialogintern.microcollege.controller;
import com.dialogintern.microcollege.entity.College;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/micro-college")
public class CollegeController {

    @GetMapping("/college/{collegeId}")
    public ResponseEntity<College> getCollegeDetails(@PathVariable("collegeId") Long collegeId){

        College c1 = new College(10L, "DSA", "USA");
        College c2 = new College(11L, "DBMS", "Sri Lanka");
        College c3 = new College(12L, "WEB", "India");

        return new ResponseEntity<College>(c1, HttpStatus.OK);
    }

}
