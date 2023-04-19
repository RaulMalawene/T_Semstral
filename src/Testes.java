
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Testes {
    
   public static void main(String[] args){
       
    int a = 2;
    Scanner x = new Scanner(System.in);
    
   //JOptionPane.showMessageDialog(null, "ATINGIU O LIMITE DE TENTATIVAS");
   while(a >=  0){
         --a;
       System.out.println("Insira o primeiro numero");
       int num = x.nextInt();
       System.out.println("Insira o segundo numero");
       int num2 = x.nextInt();
       
       int soma = num + num2;
       System.out.println(soma);
       
  
        }
       System.out.println("ATINGIU O LIMITE DE TENTATIVAS");
    } 
}
