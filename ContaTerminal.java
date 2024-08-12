import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String Agencia;
	int Numero;
	String NomeCliente;
	double Saldo = 0;
	
 	System.out.println("Por favor, digite o número da Agência !");
    Agencia = sc.nextLine();

    System.out.println("Por favor, digite o número da Conta !");
    Numero = sc.nextInt();
    sc.nextLine(); 

    System.out.println("Por favor, digite o seu nome! ");
    NomeCliente = sc.nextLine();

    System.out.println("Digite quanto de saldo deseja adicionar! ");
    Saldo = sc.nextDouble();

	String mensagem = "Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque.";
	System.out.println(mensagem);
	sc.close();
	
	
	}

}