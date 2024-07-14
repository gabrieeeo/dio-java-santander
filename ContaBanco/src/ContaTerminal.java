import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia, nomeCliente;
        double saldo;

        // TO DO: Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);
        
        // Exibir as mensagens para o usuário
        // Obter pela classe Scanner os valores digitados no terminal
        System.out.println("Por favor, digite o número da conta: ");
        numero = sc.nextInt();

        System.out.println("Número da sua agência: ");
        agencia = sc.next();

        System.out.println("Nome: ");
        nomeCliente = sc.next();

        System.out.println("Saldo: ");
        saldo = sc.nextDouble();
        
        // Exibir a mensagem final (conta criada)
        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        sc.close();
        
    }
}
