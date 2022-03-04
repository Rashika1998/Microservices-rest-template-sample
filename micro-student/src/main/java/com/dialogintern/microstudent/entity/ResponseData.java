package com.dialogintern.microstudent.entity;

public class ResponseData {

    private Student student;
    private College college;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public ResponseData(Student student, College college) {
        this.student = student;
        this.college = college;
    }

    public ResponseData() {
    }

    @Override
    public String toString() {
        return "ResponseData{" +
                "student=" + student +
                ", college=" + college +
                '}';
    }


}
