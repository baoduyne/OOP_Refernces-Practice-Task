public class Page { 
public int i;
public static void main(String[] args) {
Page n1 = new Page();
Page n2 = new Page();
ainn1.i = 2;        n2.i = 5;        n1.i = n2.i;        n2.i = 10;
System.out.println(n1.i);
System.out.println(n2.i);
}}
