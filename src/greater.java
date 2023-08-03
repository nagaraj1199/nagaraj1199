
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
public class greater 
{
    int a;
    void get ()
    {
        Scanner S1 =new Scanner(System.in);
        a=S1.nextInt();
        if(a<100)
        {
            System.out.println("The number is less than 100");
        }
        else
        {
            System.out.println("the number is greater than 100");
        }
    }
        public static void main (String arg[])
        {
            greater S2=new greater();
            S2.get();
        }
    }
    

