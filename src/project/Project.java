/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Scanner;
import java.util.function.Function;
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
    
    public static final String ANSI_GREEN = "\u001B[32m"; // green color 
    public static void main(String[] args) {
        for (;;) {
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

        System.out.print(ANSI_GREEN + "Enter command :");
        cmd = commandObj.nextLine();
            // validation age for get just number 
            do {
                System.out.print(ANSI_GREEN + "Please enter your age : ");
                while (!ageObj.hasNextInt()) {
                    System.out.println(ANSI_GREEN + "That's not a number!");
                    System.out.print(ANSI_GREEN + "Please enter your age : ");
                    ageObj.next();
                }
                age = ageObj.nextInt();
            } while (age <= 0);
            // end validation
        
            switch (cmd) {
                case "-y":
                    System.out.print(ANSI_GREEN + "your age in years is ");
                    System.out.println(year - age);
                    break;
                case "-m":
                System.out.print(ANSI_GREEN + "your age in months is ");
                    System.out.println(age * 12);
                    break;
                case "-d":
                System.out.print(ANSI_GREEN + "your age in days is ");
                    System.out.println(age * 365);
                    break;
                default:
                    System.out.println(ANSI_GREEN + "this is not command ");
                    break;
            }
        }
    }
        

    }

