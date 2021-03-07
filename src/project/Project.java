/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;  

/**
 *
 * @author USER
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static final String RESET = "\033[0m";
    public static final String ANSI_RED = "\u001B[31m"; // red color 

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();   //rest console 
        
        // try code
        try{
        // infiniteLoop
        for(;;) {
            for (int i = 0; i == 0; i++) {
                 Headers(); //headers
            }
            // here get the date time
            Date date = new Date(); // Date object 
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date); // set time 
            int year = calendar.get(Calendar.YEAR); // now year 

            // input object
            Scanner commandObj = new Scanner(System.in); // scanner command input
            Scanner ageObj = new Scanner(System.in); // scanner age input 

            // input value
            String cmd;
            int age;

            System.out.print(ANSI_RED + "Enter command : ");
            cmd = commandObj.nextLine();
        
            // validation age for get just number 
            do {
                System.out.print(ANSI_RED + "Please enter your age : ");
                while (!ageObj.hasNextInt()) {
                    System.out.println(ANSI_RED + "That's not a number!");
                    System.out.print(ANSI_RED + "Please enter your age : ");
                    ageObj.next();
                }
                age = ageObj.nextInt();
            } while (age <= -1);
            // end validation
            if (age != 0) {
                if (age > 7) {
                    
                    switch (cmd) {
                        case "-y":
                            System.out.print(ANSI_RED + "your age in years is ");
                            System.out.println(year - age);
                            break;
                        case "-m":
                            System.out.print(ANSI_RED + "your age in months is ");
                            System.out.println(age * 12);
                            break;
                        case "-d":
                            System.out.print(ANSI_RED + "your age in days is ");
                            System.out.println(age * 365);
                            break;
                        default:
                            System.out.println(ANSI_RED + "this is not command ");
                            break;
                    } 
                } else {
                    System.out.println("your age most be > 0");}
            } else {
                System.out.println("your age can't be 0");}
        
        } // end infiniteLoop
    } //end try 
    // catch NoSuchElementException and print bye and rest console color
    catch (java.util.NoSuchElementException e) {System.out.println(RESET+ "\n\nbye" + RESET);}
    }

    public static void Headers() {
        
        System.out.println(ANSI_RED + """
    
         #    #       #     #    #    #     # ####### ####### ####### 
        # #   #       #     #   # #   ##    # #     # #     # #       
       #   #  #       #     #  #   #  # #   # #     # #     # #       
      #     # #       ####### #     # #  #  # #     # #     # #####   
      ####### #       #     # ####### #   # # #     # #     # #       
      #     # #       #     # #     # #    ## #     # #     # #       
      #     # ####### #     # #     # #     # ####### ####### #\n\n""");
    
    }
    }

