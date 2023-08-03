
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
public class maths 
{
    int a,b,c,menu;
    void get ()
    {
        Scanner S1=new Scanner(System.in);
        System.out.println("Enter the value");
        a=S1.nextInt();
        b=S1.nextInt();
        System.out.println("MENU "
                +"\n"+ "1ADD "
                + "2SUBRACT "
                + "3MULTIPLY5");
        menu=S1.nextInt();
        switch(menu)
        {
            case 1:
                c=a+b;
                System.out.println("Add="+c);
                break;
            case 2:
                c=a-b;
                System.out.println("Subtract="+c);
                break;
            case 3:
                c=a*b;
                System.out.println("Multiply="+c);
                break;    
        }
    }
    public static void main(String arg[])
    {
        maths S2=new maths();
        S2.get();
    }
}
