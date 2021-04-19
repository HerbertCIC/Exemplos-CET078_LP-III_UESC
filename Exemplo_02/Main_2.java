//Arquivo para exemplpificar a implementação de uma classse

import java.util.Scanner;

public class Main_2{

  public static void main(String [] args){
    
    String name;
    System.out.println("Hello World!");
    System.out.println(args.length);
    if(args.length > 0){
      System.out.println("Hi "  + args[0] + " good to see you here!!!");
    }      
    else{
      
      Scanner scanner = new Scanner(System.in);
      System.out.print("Whats your name?");
      name = scanner.nextLine();
      System.out.println("Hi " + name + ", good to see you here!!!");
	  }

  }
}