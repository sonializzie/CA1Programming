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
    
    public boolean isValid(){
        // Beggining of isValid method
        
        // Validating firstName
        if(!firstName.matches("[a-zA-Z]+")){
            return false;
        }
        
        // Validating lastName
        if(!lastName.matches("a-zA-Z0-9+")){
            return false;
        }
        
        // Validating numberOfClasses
        if(numberOfClasses < 1 || numberOfClasses > 8){
            return false;
        }
        
        // Validating studentNumber
        if(studentNumber.matches("\\d{2}[a-zA-Z]{1,2}\\d+")){
            return false;
        }
        
        //Inputting variables for studentNumber
        int year = Integer.parseInt(studentNumber.substring(0,2));
        int numberAfterLetters = Integer.parseInt(studentNumber.substring(2, studentNumber.length() - 1));
        
        // Validate the student number year and number after letters
        if (year < 20 || numberAfterLetters < 1 || numberAfterLetters > 200){
            return false;
        }
        
        //return true is for isValid()
        return true;
    }// End of isValid method
    
    
    
    
}//End of student class
