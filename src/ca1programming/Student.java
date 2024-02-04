/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca1programming;

/**
 *
 * @author sonia_ndonga
 */
public class Student {
    //Beginning class for Student
    //Created a class attribute for Student 
    
    private String firstName;
    private String lastName;
    private int numberOfClasses;
    private String studentNumber;
    
    public Student(){
        //Created a Student Method
    }

    //Created a class constructor for Student 
    public Student(String firstName, String lastName, int numberOfClasses, String studentNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberOfClasses = numberOfClasses;
        this.studentNumber = studentNumber;
    }
    
    
    
    
}//End of student class
