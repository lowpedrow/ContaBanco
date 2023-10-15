import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
      
    //Criando Scanner

      Scanner sc = new Scanner (System.in).useLocale(Locale.US);

      //Declarando Variáveis
      
      String agencia, sobrenomeCliente, nomeCliente, numero;
      double saldo;
    
      //Requests ao usuário

      System.out.println("Por favor, digite o número da agência! ");
      agencia = sc.nextLine();

      System.out.println("Por favor, digite o número da conta! ");
      numero = sc.next();

      System.out.println("Por favor, digite o seu nome! ");
      nomeCliente = sc.next();

      System.out.println("Por favor, digite o seu sobrenome! ");
      sobrenomeCliente = sc.next();

      System.out.println("Por favor, digite o seu saldo! ");
      saldo = sc.nextDouble();
      
      //Saída
    
      System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
