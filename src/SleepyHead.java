//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /*
         * Ask the user for these values using
         
         * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
         * JOptionPane.YES_NO_OPTION);
         */
    
       int s= JOptionPane.showConfirmDialog(null, "is it a weekday?","",JOptionPane.YES_NO_OPTION);
       
       
       int r= JOptionPane.showConfirmDialog(null, "is it a vacation?","",JOptionPane.YES_NO_OPTION);


        /*
         * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!” If it is a weekday, and we are on vacation,
         * print “sleep in”.
         */
        if(s==0||r==0) {
        	System.out.println("sleep in");
        }
        else if(s==1) {
        	System.out.println("get up ladybones!");
        }
       
    }
}
