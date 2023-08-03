
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
public class choice  
{
    int a,menu;
    void get()
    {
        Scanner S1=new Scanner(System.in);
        System.out.println("Enter the value");
        a=S1.nextInt();
        System.out.println("Menu");
        System.out.println("1..postive/negative");
        System.out.println("2..odd/even");
        System.out.println("3..single/not single");
        System.out.println("4..major/minor");
        menu=S1.nextInt();
        switch(menu)
        {
            case 1:
                if(a>0)
                {
                     System.out.println("positive");
                }
                else
                {
                    System.out.println("negative");
                }
                break;
            case 2:
                if(a%2==0)
                {
                     System.out.println("even");
                }
                else
                {
                    System.out.println("odd");
                }
                break;
            case 3:
                if(a>0&&a<9)
                {
                     System.out.println("single digit");
                }
                else
                {
                    System.out.println("double");
                }
                break;
            case 4:
                if(a>18)
                {
                     System.out.println("major");
                }
                else
                {
                    System.out.println("minor");
                }
                break;    
        }}
        public static void main(String arg[])
        {
            choice S2=new choice();
            S2.get();
            
        }
    }
    

