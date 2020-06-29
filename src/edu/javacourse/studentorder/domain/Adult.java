package edu.javacourse.studentorder.domain;

import edu.javacourse.studentorder.domain.Person;

import java.time.LocalDate;

public class Adult extends Person {
    private  String pasportSeria;
    private  String pasportNumber;
    private LocalDate issueDate;
    private  String issueDepartament;
    private  String university;
    private  String studenyId;

    public Adult(String surName, String givenName, String patronymic, LocalDate dateOfBirth) {
        super(surName, givenName, patronymic, dateOfBirth);
    }

  /*  @Override
    public String getSurName() {
        return super.getSurName();
    }*/

    public String  getAdultString(){

        return surName + "" + givenName;

    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setStudenyId(String studenyId) {
        this.studenyId = studenyId;
    }

    public String getUniversity() {
        return university;
    }

    public String getStudenyId() {
        return studenyId;
    }

    public void setPasportSeria(String pasportSeria) {
        this.pasportSeria = pasportSeria;
    }

    public void setPasportNumber(String pasportNumber) {
        this.pasportNumber = pasportNumber;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public void setIssueDepartament(String issueDepartament) {
        this.issueDepartament = issueDepartament;
    }

    public String getPasportSeria() {
        return pasportSeria;
    }

    public String getPasportNumber() {
        return pasportNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public String getIssueDepartament() {
        return issueDepartament;
    }
}
