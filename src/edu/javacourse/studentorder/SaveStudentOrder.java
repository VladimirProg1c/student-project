package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.Adult;
import edu.javacourse.studentorder.domain.StudentOrder;

public class SaveStudentOrder {
    public static void main(String[] args) {

        StudentOrder so = new StudentOrder();

        long ans = SaveStudentOrder(so);


    }

    static long SaveStudentOrder(StudentOrder studentOrder){

        long answer= 199;
        System.out.println("Save Student Order:"  );

        return answer;
    }

    public static StudentOrder buildStudentOrder(long id){
        StudentOrder so = new StudentOrder();
        so.setStudentOrderId(id);

        Adult husband = new Adult("Васильев","Андрей","Петович",null);
        husband.setGivenName("Андрей");
        so.setHusband(husband);
        return so;
    }
}
