/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aswinaji;

import java.util.Scanner;


/**
 *
 * @author Student
 */
public class c {
 
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
 
   // TODO code application logic here
        
        
        
          int a,b=0,t;
        Scanner s=new Scanner(System.in);
          int n=s.nextInt();//It is the number variable to be checked for palindrome  
  
               t=n;    
           while(n>0)
  {    
   a=n%10;    
   b=(b*10)+a;    
   n=n/10;    
  }    
  if(t==b)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome"); 
    }
    
         }
         
                
      
       
  
    

          
              
          
      
        

    

            
        
    
