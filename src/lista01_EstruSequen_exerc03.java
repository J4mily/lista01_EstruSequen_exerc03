import java.util.Scanner;

public class lista01_EstruSequen_exerc03 {
    public static void main(String[] args) throws Exception {
  //3.Faça um Programa que peça dois números e imprima a soma.
   
        Scanner num = new Scanner(System.in);
      
        System.out.println("Digite um número: ");
        int num1 = num.nextInt();

        System.out.println("Digite um segundo número: ");
        int num2 = num.nextInt();

        System.out.println("A soma desses números é: " + (num1 + num2));
  
        num.close();

    }
    
}
