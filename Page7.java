public class Page7 {   
  public static void main(String[] args)
{ 
 Page7 n1 = new Page7();
 Page7 n2 = new Page7();
 n1.i = 2;        n2.i = 5;        n1 = n2;    
  n2.i = 10;     
  n1.i = 20;  
  System.out.println(n1.i);
  System.out.println(n2.i);
} 
}

