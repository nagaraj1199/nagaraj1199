/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open t he template in the editor.
 */

/**
 *
 * @author Raja
 */
public class bluewhale extends marineanimal 
{
  void bw()
  {
      ma();
      System.out.println("i am both");
  }   
}
class marineanimal extends mammal
{
     void ma()
    {
        m();
        System.out.println("i am marine animal");
    }
}
class mammal 
{
    void m()
    {
        
        System.out.println("iam mammals");
    }
}
class all
{
    public static void main(String arg[])
    {
        bluewhale s1=new bluewhale();
        s1.bw();
        
    }
}