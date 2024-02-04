/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca1programming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author sonia_ndonga
 * 
 * Module : Object Oriented Programming : CA1
 * Date : 3rd February 2024
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
    
}//End of class method 
