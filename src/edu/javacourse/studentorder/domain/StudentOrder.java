package edu.javacourse.studentorder.domain;

public class StudentOrder {

    private long studentOrderId;
    private Adult husband;
    private Adult wife;
    private Child child;

    public void setStudentOrderId(long studentOrderId) {
        this.studentOrderId = studentOrderId;
    }

    public void setHusband(Adult husband) {
        this.husband = husband;
    }

    public void setWife(Adult wife) {
        this.wife = wife;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public long getStudentOrderId() {
        return studentOrderId;
    }

    public Adult getHusband() {
        return husband;
    }

    public Adult getWife() {
        return wife;
    }

    public Child getChild() {
        return child;
    }
}
