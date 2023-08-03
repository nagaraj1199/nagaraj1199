
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
public class digits 
{
    int a;
    void get()
    {
        Scanner S1=new Scanner(System.in);
        a=S1.nextInt();
        switch(a)
        {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("invalid");
        }
    }
    public static void main(String arg[])
    {
        digits S2=new digits();
        S2.get();
    }
     
    
}
