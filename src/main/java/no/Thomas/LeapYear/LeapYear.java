package no.Thomas.LeapYear;
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args)
    {
        int years;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year: ");
        years = scan.nextInt();
        scan.close();
        boolean leapY = false;

        if(years % 4 == 0)
        {
            if(years % 100 == 0)
            {
                if(years % 400 == 0)
                    leapY = true;
                else
                    leapY = false;
            }
            else
                leapY = true;
        }
        else {
            leapY = false;
        }

        if(leapY==true){
            System.out.println(years + " Is a leap year!");
        }
        else
            System.out.println(years + "is not a leap year!");
    }



    public static boolean isLeapYear(int year)
    {
        return ((year % 4 == 0) && (year % 100 !=0)) || (year % 400 == 0);
    }


}
