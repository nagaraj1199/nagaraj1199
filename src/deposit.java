
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
public class deposit 
{
    int p,n,r,menu;
    double A;
    void get()
    {
        Scanner S1= new Scanner(System.in);
        System.out.println("enter the value");
        System.out.println("1.principal");
        System.out.println("2.no of years");
        System.out.println("3.rate of interest");
        p=S1.nextInt();
        n=S1.nextInt();
        r=S1.nextInt();
        System.out.println("Menu");
        System.out.println("1..term deposit");
        System.out.println("2..recurring deposit");
        menu=S1.nextInt();
        switch(menu)
        {
            case 1:
                A=p*(1+(r/100));
                System.out.println("term deposit"+A);
                break;
            case 2:
                A=(p*n*r)/100;
                System.out.println("recurring deposit"+A);
                break;
            
        }
    }
    public static void main(String arg[])
    {
        deposit S2=new deposit();
        S2.get();
    }
            
    
    
}
