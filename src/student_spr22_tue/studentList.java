/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_spr22_tue;

/**
 *
 * @author Ronak
 */
public class studentList {
     public static void main(String[] args) {
         
         Student s1 = new Student(1,"Ronak");
         Student s2 = new Student(2,"Sheth");
         Student s3 = new Student(3,"xyz");
         
         Student[] studentList = new Student[3];
         studentList[0]=s1;
         studentList[1]=s2;
         studentList[2]=s3;
         
         System.out.println(studentList[2].getStudentNum());
         System.out.println(studentList[2].getStudentName());
         
     }
    
}
