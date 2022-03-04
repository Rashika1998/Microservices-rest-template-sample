package com.dialogintern.microstudent.controller;
import com.dialogintern.microstudent.entity.College;
import com.dialogintern.microstudent.entity.ResponseData;
import com.dialogintern.microstudent.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/micro-student")
public class StudentController {

    @Autowired
    private WebClient.Builder webClient;


    @GetMapping("/student/{studentId}")
    public ResponseEntity<ResponseData> getStudent(@PathVariable("studentId") Long studentId){

        ResponseData responseData = new ResponseData();

        Student s1 = new Student(100L, "Rashika", "kirindiwela", 10L);
        responseData.setStudent(s1);
        Long collegeId = s1.getCollegeId();

        // Rest template

        /**
        RestTemplate restTemplate = new RestTemplate();
        String endPoint = "http://localhost:8101/micro-college/college/{collegeId}";
        ResponseEntity<College> data = restTemplate.getForEntity(endPoint, College.class, collegeId);

        if (data.getStatusCodeValue() == 200){
            College college = data.getBody();
            responseData.setCollege(college);
        }

        **/


        // Web client

        College c1 = webClient.build().get()
                .uri("http://localhost:9101/micro-college/college/" + collegeId)
                .retrieve().bodyToMono(College.class).block();

        responseData.setCollege(c1);

        return new ResponseEntity<ResponseData>(responseData, HttpStatus.OK);

    }


}
