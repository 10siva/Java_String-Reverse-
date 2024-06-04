package String_Reverse;
import java.util.*;
import java.io.*;


class Suffle
{
    
    void get()
    
    {
        
       /* Scanner obj=new Scanner(System.in);
        String Sentence=obj.nextLine();*/
        String Sentence="What is, then, the special character of the work under review?";
       String  Result="";
        
        
        for(int i=0; i<Sentence.length();i++)
        {
            if(Sentence.charAt(i)>60  &&  Sentence.charAt(i)<=122)
            {
                Result=Result+Sentence.charAt(i);
                
            }
            
            
        }
        System.out.println(Sentence);
    System.out.println("  "+Result);
        System.out.println();
    
    }
    
}



class Build 
{
    void get()
    {
        
        String Hack="Hacking an Laptop";
        String Empty="";
        
        
        for(int i=0;i<Hack.length();i++)
        {
            
           
            Empty=Hack.charAt(i)+Empty;
            
            
        }
        System.out.println(Hack);
        System.out.println(Empty);
    }
    
    
}


        

public class Main {
    
    public static void main(String[] args)
    {
        
        Suffle obj1 =new Suffle();
        obj1.get();
        Build Obj=new Build();
        Obj.get();
        
    }
    
}