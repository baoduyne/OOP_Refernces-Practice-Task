import java.util.*;

public class breakcontinue{
  public static void main(String[] args){
    int a = 10;
    for(int i = 0 ; i <10 ; i++){
      a--;
      if(a==5){
        break;}
    if(a>5){
      System.out.println(i);
      continue;
    }
  }
}
}
