/**
* <h1>Abertura de Conta Simplificada</h1>
* Ela cria uma conta em um banco fictício, desafio feito para praticar os fundamentos da linguagem e noções de regras de estrutura de sintaxe.
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  Matheus H. Paulino
* @version 1.0
* @since   20/05/2024
*/
import java.util.Scanner; 
import java.util.Random; 
/**
 * Este classe é utilizado para armazenar os tributos como Nome, Agencia, Numero da conta e o saldo.
 */
public class ContaTerminal {
	
    private String nomeCliente;
    private String agencia; 
    private int numero; 
    private double saldo; 

    

    public String getNomeCliente() { 
        return nomeCliente; 
    }

    public void setNomeCliente(String nomeCliente) { 
        this.nomeCliente = nomeCliente; 
    }

    public String getAgencia() { 
        return agencia; 
    }

    public void setAgencia(String agencia) { 
        this.agencia = agencia;
    }

    public int getNumero() { 
        return numero; 
    }

    public void setNumero(int numero) { 
        this.numero = numero; 
    }

    public double getSaldo() { 
        return saldo; 
    }

    public void setSaldo(double saldo) { 
        this.saldo = saldo;
    }

    public static void main(String[] args) {
    	
        ContaTerminal conta = new ContaTerminal(); // Cria um objeto da classe ContaTerminal
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler dados do terminal
        Random random = new Random(); // Cria um objeto Random para gerar números aleatórios

        System.out.print("Por favor, digite o nome do Cliente: "); // Exibe uma mensagem solicitando o nome do cliente
        conta.setNomeCliente(scanner.nextLine()); // Lê o nome do cliente digitado pelo usuário e o armazena no atributo nomeCliente

        System.out.print("Por favor, digite o saldo inicial: "); // Exibe uma mensagem solicitando o saldo inicial
        conta.setSaldo(scanner.nextDouble()); // Lê o saldo inicial digitado pelo usuário e o armazena no atributo saldo

        // Geração aleatória do número da conta:
        conta.setNumero(random.nextInt(90000000) + 10000000); // Gera um número aleatório de 8 dígitos e o atribui ao atributo numero
        // random.nextInt(90000000) gera um número aleatório entre 0 (inclusive) e 90.000.000 (exclusive)
        // + 10000000 garante que o número tenha 8 dígitos

        // Geração aleatória da agência:
        int agenciaBase = random.nextInt(900) + 100; // Gera um número aleatório entre 100 (inclusive) e 999 (inclusive)
        conta.setAgencia(String.format("%03d-%d", agenciaBase, random.nextInt(10))); // Formata a agência com o formato "XXX-X"
        // String.format("%03d-%d", agenciaBase, random.nextInt(10)) formata a agência com 3 dígitos, preenchendo com zeros à esquerda se necessário, e adiciona um hífen e um dígito aleatório entre 0 e 9.

        System.out.println("Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                + conta.getAgencia() + ", conta " + conta.getNumero() + " e seu saldo " + conta.getSaldo() 
                + " já está disponível para saque."); // Exibe uma mensagem de boas-vindas com os dados da conta
        
        scanner.close(); // Fecha o objeto Scanner
    }
}