/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca1programming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author sonia_ndonga
 * 
 * Module : Object Oriented Programming: CA1
 * Date : 3rd February 2024
 * GitHub Repository Link: https://github.com/sonializzie/CA1Programming
 * 
 */
public class CA1Programming {
    //Beginning of class method 

    public static void main(String[] args) {
        //Beginning of main method
        
        //Prints out Welcome Display
        System.out.println("***************************************");
        System.out.println("\t Welcome to CCT College");
        System.out.println("***************************************");
        
        //Create a Scanner for userInpur
        Scanner userInput = new Scanner(System.in);
        
        //Student Menu
        //Beginning of while loop
        while(true){
            System.out.println("************Student Menu***************");
            System.out.println("1.\t View Students");
            System.out.println("2.\t Add Student Data via Console");
            System.out.println("3.\t Exit Menu");
            System.out.println("***************************************");
            
            // Inputting variable for choice 
            int choice = userInput.nextInt();
            
            // switch case statement for Student Menu
            switch(choice){
                case 1:
                    processStudentFileData(); // Calling method processStudentFileData();
                    break; // Exiting the switch statement and continue code after the switch 
                case 2:
                    getStudentData(); //Calling method getStudentData();
                    break; // Exiting the switch statement and continue code after the switch 
                case 3:
                    System.out.println("Exiting the Student Menu. Thank you using for this service.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice try again. Please enter 1, 2 or 3.");
            }// End of switch case statement 
        }// End of while loop
          
    }//End of main method
    
    
    private static void processStudentFileData(){
        // Beginning of processStudentFileData
        
        //try catch block
        //Creates a BufferedReader using FileReader with "students.txt"
        //Creates a BufferedWriter using FileWriter with "status.txt"
        
        try(BufferedReader br = new BufferedReader(new FileReader("students.txt")); 
            BufferedWriter bw = new BufferedWriter(new FileWriter("status.txt"));){
            
            //Inputting variable for line
            String line;
            
            //Beginning of while loop
            //Reading line from BufferedReader
            while((line = br.readLine()) != null){
                //Reads characters from BufferedReader
                String firstName = line;
                String lastName = br.readLine();
                int numberOfClasses = Integer.parseInt(br.readLine());
                String studentNumber = br.readLine();
                
                //Declaring variable for 'Student' of type 's' 
                //The parameters are passed through the constructor from the Student.java class
                Student s = new Student(firstName, lastName, numberOfClasses, studentNumber);
                
                //If else statement for BufferedWriter
                if(s.isValid()) { 
                    bw.write(s.getFormattedOutput()); // Insert write for getFormattedOutput()
                    bw.newLine(); //Insert newLine for BufferedWriter
                    bw.newLine();
                }else{
                    System.out.println("Invalid Student Data:" + studentNumber);
                }
                          
            }
            
            System.out.println("Student Data is processed successfully.");
            
            
        }catch(Exception e){
            System.out.println(e);
        }
        
    }// End of processStudentFileData
    
    private static void getStudentData(){
        // Beginning of addStudentData method
        
        //Created a Scanner for userInput
        Scanner userInput = new Scanner(System.in);
        
         //Outputting the Student Variables when creating new Student
         System.out.println("Enter First Name:");
         String firstName = userInput.nextLine();
         
         System.out.println("Enter Last Name:");
         String lastName = userInput.nextLine();
         
         System.out.println("Enter Number of Classes (1-8):");
         int numberOfClasses = userInput.nextInt();
         
         System.out.println("Enter Student Number:");
         String studentNumber = userInput.nextLine();
        
        //Declaring variable for 'Student' of type 's' 
        //The parameters are passed through the constructor from the Student.java class
        Student s = new Student(firstName, lastName, numberOfClasses, studentNumber);
        
        //If Else statement for 's' for isValid()
        // Try Catch for BufferedWriter
        if(s.isValid()){
            try(BufferedWriter bw = new BufferedWriter(new FileWriter("status.txt", true))){
                bw.write(s.getFormattedOutput());  // Insert write for getFormattedOutput()
                bw.newLine(); //Insert newLine for BufferedWriter
                System.out.println("Student Data added successfully.");
            }catch(Exception e){ // Beginning of catch block
                System.out.println(e);
            } // End of catch block
        }else{
            System.out.println("Invalid Student Data. Student Data not saved");
        }
             
    }// End of addStudentData method
    
}//End of class method 
