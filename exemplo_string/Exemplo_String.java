/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo_string;

import java.util.Scanner;

/**
 *
 * @author Herbert Nascimento
 */
public class Exemplo_String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // declaração e intanciação
        //String ola = new String("Hello World");        
        String ola = "Hello World!";//outra forma
        String nome = "Herbert";
        // concatenação
        String exemplo = ola + "\nSeja Bem-vindo, " + nome;
        System.out.println(exemplo);
        
        System.out.println("_________________________________________");
        Scanner ler = new Scanner(System.in);

        String s;
        int i, n, cta = 0;

        System.out.printf("Informe uma string:\n");
        s = ler.nextLine();

        System.out.println();

        n = s.length(); // tamanho da string
        for (i=0; i<n; i++) {
         // verifica se o i-ésimo caractere é a vogal 'a'
          if ((s.charAt(i) == 'A') || (s.charAt(i) == 'a')) {
             cta = cta + 1;
             System.out.printf("%c ---> %do. caractere 'a'\n", s.charAt(i), cta);
          }
          else System.out.printf("%c\n", s.charAt(i));
        }


     System.out.println("_________________________________________");
         String maius, minus;

         System.out.printf("Informe uma string:\n");
         s = ler.nextLine();

         maius = s.toUpperCase(); // string convertida em maiúsculas
         minus = s.toLowerCase(); // string convertida em minúsculas

         System.out.printf("\nResultado:\n");
         System.out.printf("%s\n%s\n", maius, minus);

     System.out.println("_________________________________________");

     String sobrenome;
     System.out.printf("Informe um nome:\n");
     nome = ler.nextLine();
     // retorna a posição da última ocorrência do espaço em branco
     // na string 'nome', ou seja, o sobrenome é a última parte de um nome
     i = nome.lastIndexOf(' ');
     sobrenome = nome.substring(i+1, nome.length());
     System.out.printf("\nSobrenome:\n%s\n", sobrenome);
   
     System.out.println("_________________________________________");
     int  j;
     while (true) {
       System.out.printf("Informe uma String, FIM para encerrar:\n");
       s = ler.nextLine();
        // compara a string informada pelo usuário com a palavra FIM ignorando
        // na comparação se os caracteres são maiúsculos ou minúsculos
       if (s.equalsIgnoreCase("FIM"))
          break;

       System.out.printf("\n");
       n = s.length(); // tamanho da string (qtde de caracteres)

       for (i=0; i<n; i++) {
        // a cada linha mostra 'i' caracteres
         for (j=0; j<=i; j++) {
        // mostra o j-ésimo caractere de 's'
           System.out.printf("%c", s.charAt(j));
         }
         System.out.printf("\n");
       }
       System.out.printf("\n");
     }
   }


 }
    

    

