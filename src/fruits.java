/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raja
 */
interface m1
{
    void get();
    void a();
    
}
class apple implements m1
{
    int apple=10;
    void get()
    {
        System.out.println(apple);
    }
}
class orange implements m1
{
    int orange=20;
    void a()
    {
        
    }
}
