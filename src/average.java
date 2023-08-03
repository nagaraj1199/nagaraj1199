
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raja
 */
public class average 
{
    String nam;
    int a,b,c;
    double avg;
    void get ()
    {
        Scanner S1 =new Scanner(System.in);
        System.out.println("enter the name");
        nam=S1.next();
        System.out.println("enter the marks");
        a=S1.nextInt();
        b=S1.nextInt();
        c=S1.nextInt();
        avg=((a+b+c)/3);
        System.out.println("Name"+nam);
        System.out.println("average mark"+avg);
        if(avg>=80)
        {
            System.out.println("distinction");
            
        }
        else
            if(avg>60&&avg<80)
            {
                System.out.println("First division");
            }
        else
                if(avg>45&&avg>60)
                {
                 System.out.println("second division");   
                }
        else
                if(avg>40&&avg<45)
                {
                   System.out.println("pass"); 
                }
        else
                    if(avg<40)
                    {
                        System.out.println("Promotion \n not granted");
                    }
        
    }
    public static void main(String arg[])
    {
        average S2=new average();
        S2.get();
    }
    
}
