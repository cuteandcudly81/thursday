package se.lexikon;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ) {
        /*
        String name = "Mohamed";
        System.out.println(name);
        String lastName= "Yusuf";
        String space = " ";
        System.out.println(name + space + lastName);
        String age = "42";
        System.out.println(name + " " + lastName + "  " + " is " + age);
        */

        /*
        long number1 = 20220323L;
        long number2 = 20220324L;
        long sum = number1 + number2;
        System.out.println(sum);
        */

        /*
        Car volvoXC90 = new Car ();
        volvoXC90.color = "black";
        volvoXC90.registrationNumber = "BIL911";
        volvoXC90.brand = "Volvo";
        volvoXC90.ownersName = "John Doe";
        volvoXC90.maxSpeed = 210;
        */



        /*
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName = sc.next();
        System.out.println("Enter your last name");
        String lastName = sc.next();
        System.out.println("My Name is " + firstName + " " + lastName);
         */


        /*
        int number1 = 10;
        int number2 = 5;
        int result = number1 + number2;
        System.out.println(result);

        int number3 = 2;
        int number4 = 7;
        int result1 = number3 + number4;
        System.out.println(result1);



        int res =   addition(10,5);
        System.out.println(res);
        int res2 = addition(2,7);
        System.out.println(res2);
        */


        /*
        int res1 = addition(9,7);
        System.out.println(res1);
        int res3 = addition(8,6);
        System.out.println(res3);
        */
        int resu = addition(11,12);
        System.out.println(resu);
        int resus = addition(13,14);
        System.out.println(resus);


        System.out.println("forsok");

    }

   public static int addition(int number1,int number2){

        int result = number1 + number2;
        return result;
   }


}
