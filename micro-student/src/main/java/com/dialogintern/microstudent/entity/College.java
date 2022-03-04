package com.dialogintern.microstudent.entity;

public class College {

    private Long collegeId;
    private String collegeName;
    private String address;

    public Long getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Long collegeId) {
        this.collegeId = collegeId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public College(Long collegeId, String collegeName, String address) {
        this.collegeId = collegeId;
        this.collegeName = collegeName;
        this.address = address;
    }

    public College() {
    }

    @Override
    public String toString() {
        return "College{" +
                "collegeId=" + collegeId +
                ", collegeName='" + collegeName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
