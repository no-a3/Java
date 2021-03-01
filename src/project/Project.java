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
    public static void main(String[] args) {
        pro();
    }
        

    public static void pro() {
        Date date = new Date(); // Date object 
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date); // set time 
        int year = calendar.get(Calendar.YEAR); // now year 

        Scanner commandObj = new Scanner(System.in); // scanner command input
        Scanner ageObj = new Scanner(System.in); // scanner age input 
        String cmd;
        System.out.print("Enter command :");
        cmd = commandObj.nextLine();
    
        
            int age;
            do {
                System.out.print("Please enter your age : ");
                while (!ageObj.hasNextInt()) {
                    System.out.println("That's not a number!");
                    System.out.print("Please enter your age : ");
                    ageObj.next();

                }
                age = ageObj.nextInt();
            } while (age <= 0);

            switch (cmd) {
                case "-y":
                    System.out.println(year - age);
                    break;
                case "-m":
                    System.out.println(age * 12);
                    break;
                case "-d":
                    System.out.println(age * 365);
                    break;
                default:
                    System.out.println("this is not command");
                    break;
            }
    }

    }

