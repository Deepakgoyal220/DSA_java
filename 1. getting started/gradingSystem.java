import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      if(n>90)
      System.out.println("excellent");
      if(n>80 && n<=90)
      System.out.println("good");
      if(n>70 && n<=80)
      System.out.println("fair");
      if(n>60 && n<=70)
      System.out.println("meets expectations");
      if(n<=60)
      System.out.println("below par");
  
   }
  }