/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author Raja
 */
public class doublea 
{
    int a[][]=new int[3][3];
    int i,j;
    void get()
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("value");
        for(i=0;i<3;i++)
        for(j=0;j<3;j++)
        a[i][j]=s1.nextInt();
        System.out.println("view");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print("\t"+a[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println("transvers");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print("\t"+a[j][i]);
            }
            System.out.print("\n");
        }
        
    }
    public static void main(String arg[])
    {
        doublea s2=new doublea();
        s2.get();
    }
    
}
