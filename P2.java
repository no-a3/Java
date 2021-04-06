/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;
import javax.swing.*;
class P2{
      public static void main(String args[]){
           JFrame frame = new JFrame("My First GUI");
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.setSize(300,300);
          JButton button1 = new JButton("Button 1");
          JButton button2 = new JButton("Button 2");
          frame.getContentPane().add(button1);
          frame.getContentPane().add(button2);
          frame.setVisible(true);
     }
}