
/*: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) */

import java.util.*;
public class java1question{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
         float pen = sc.nextFloat();
         float pencil = sc.nextFloat();
         float eraser = sc.nextFloat();

         float total = (pen + pencil + eraser);
         
        //  System.out.println("Total cost  : " +  total);


       float alltotal = total + (0.18f * total);
         System.out.println("Total cost  : " + alltotal );


    }
}    