

import java.util.Scanner;

public class Main
{
  public static void main(String [] args){
  
  int num = (int) (Math.random()*100) + 1;
  int chute, chutePC, cont=0,contPC=0, op, left=1, right=100; 
	System.out.println("Pensei em um número inteiro entre 1 100 (incluidos) tente adivinhar...");
  //Usuario
  Scanner scanner = new Scanner(System.in);
  do{
    cont++;
    System.out.println(cont + " tentativa");
    chute = scanner.nextInt();
    if(chute==num){
      System.out.println("Respota correta!\nTentativas = "+ cont);
      break;
    }
    else if(num>chute)
      System.out.println("Errou!! é maior!!");
    else
      System.out.println("Errou!! é menor!!"); 
  }while(true);
  //Competidor
  chutePC =(int) (Math.random()*right) + left;
  do{
    if(num==chutePC)
        op = 0;
    else if(num>chutePC)
          op = 1;
    else
          op=2;
		contPC++;
		switch(op){
			case 0:
				System.out.println("Competidor encontrou em tentativas!!!" + contPC);
				break;
			case 1: 
				left = chutePC;
				chutePC = (left + right) / 2;
				break;
			case 2:
				right = chutePC;
				chutePC = (left + right) / 2;
				break;
			default:
				break;
		}
	}while (op != 0); 

  if(cont < contPC){
      System.out.println("Parabéns você adivinhou primeiro!!!");
  }else if(cont > contPC)
      System.out.println("O Competidor adivinhou primeiro!!\n");
  else
    System.out.println("Empate !!\n");
}
}

























