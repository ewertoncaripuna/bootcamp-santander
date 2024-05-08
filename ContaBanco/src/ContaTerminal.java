import java.util.Calendar;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//
//        System.out.println("*********Seja bem vindo!*********");
//        System.out.println("Cadastre sua conta.");
//
//        System.out.print("Insira o número da conta: ");
//        int numero = sc.nextInt();
//        sc.nextLine();
//        System.out.print("Insira a agência: ");
//        String agencia = sc.nextLine();
//        System.out.print("Insira o nome do cliente: ");
//        String nome = sc.nextLine();
//        System.out.print("Insira o saldo da conta: ");
//        double saldo = sc.nextDouble();
//
//        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
//                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
//

            for(int x=1;x<=10;x++){
                if(x % 2==0) //% operador que representa módulo de uma divisão
                    System.out.println(x);
            }


        sc.close();
    }
}
