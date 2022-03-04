package com.dialogintern.microstudent.entity;

public class Student {

    private Long studentId;
    private String studentName;
    private String address;
    private Long collegeId;

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Long collegeId) {
        this.collegeId = collegeId;
    }

    public Student(Long studentId, String studentName, String address, Long collegeId) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.address = address;
        this.collegeId = collegeId;
    }

    public Student(Long studentId, String studentName, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.address = address;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", address='" + address + '\'' +
                ", collegeId=" + collegeId +
                '}';
    }
}
