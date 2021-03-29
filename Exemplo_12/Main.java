
import java.util.Random;
import java.util.Scanner;

//Arquivo para exemplpificar a implementação d e uma classse
public class Main{
  public static void main(String [] args){
    // implementação do corpo da função main
    int vetor[], tam;
		System.out.println("Mega Senna");
    //--------------------------------//
    System.out.println("Jogo 1");
		vetor = GerarVetorNaoRepetido(1, 60, 6, 0);
    tam = vetor.length;
    ordenar(vetor,tam);
    printVet(vetor,tam);
    //--------------------------------//
    System.out.println("Jogo 2");
		vetor = GerarVetorNaoRepetido(1, 60, 6, 0);
    tam = vetor.length;
    ordenar(vetor,tam);
    printVet(vetor,tam);
    //--------------------------------//
    System.out.println("Jogo 3");
		vetor = GerarVetorNaoRepetido(1, 60, 6, 0);
    tam = vetor.length;
    ordenar(vetor,tam);
    printVet(vetor,tam);


  }

   public static void ordenar(int vetor[],int tam){
    int aux;
    for (int i = 0; i < tam; i++){
        for (int j = 0; j < tam; j++){
          if (vetor[i] < vetor[j]){
              aux = vetor[i];
              vetor[i] = vetor[j];
              vetor[j] = aux;
          }
      }
    }
  }
  public static int []GerarVetorNaoRepetido(int min, int tam, int qtVezes,int semente){
   int[ ] vetor = new int[qtVezes];
    Random rand = new Random();
		if (semente > 0)
			rand.setSeed(semente);
    for(int i=0;i<qtVezes;i++){
      do{
       vetor[i] = min + rand.nextInt(tam);
        int rep = 0;
        for(int j=0;j<i;j++){
          if(vetor[i]==vetor[j]){
              rep=1;
              break;
          }
        }
      }while(false);    
    }
    return vetor;
}

    public static void printVet(int vet[],int tam){
      System.out.print("( ");
      for(int i = 0; i < tam; i++){
        System.out.print(vet[i]);
        if (i < tam-1)
          System.out.print(", ");
        else
        System.out.println(")");
	    }
    }
}