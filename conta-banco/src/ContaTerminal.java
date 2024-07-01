import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        //ToDo:Importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        
        //Exibir as mensagens para os usuários 
        //Obter os valores digitados

        System.out.println("Por favor, digite o numero da agencia");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o numero da sua conta");
        int numero = scanner.nextInt();

        System.out.println("Digite seu nome e sobrenome:");
        scanner.nextLine();
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();
                
        //exibir a mensagem da conta criada
        System.out.println("Conta Criada com sucesso!");

        //Exibir as informações no terminal
        System.out.println("Olá " + nomeCliente + "!");        
        System.out.println("Obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque!");
    }
}
