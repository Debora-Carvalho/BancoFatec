/**
 * 
 */
package BancoFatec;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Conta c1 = new Conta(new Cliente("Sirley", "1197854-6320"), 5000.00);
		Conta c2 = new Conta(new Cliente("Anahi", "1195588-6320"), 1000.00);
		ArrayList<Conta> lista = new ArrayList<Conta>();
		lista.add(c1);
		lista.add(c2);
		String menu;
		int op = 0;
		double valor;
		menu = "\n 1.Depositar. \n 2.Sacar. \n 3.Transferir. \n 4.Listar. \n 5.Criar nova conta. \n 0.Sair \n Digite a opção desejada.";

		do {
			System.out.println(menu);
			op = entrada.nextInt();	

			switch (op) {
			case 1: {
				break;
			}
			case 2: {

                break;
			}
			case 3: {
				break;
			}
			case 4: {
				break;
			}
			case 5: {
				break;
			}
			case 0: {
				System.out.print("Saindo do sistema...");
				break;
			}
			default: {
				System.out.print("Opção inválida!\n Retornando ao menu...");
				break;
			}
			}
		} while (op != 0);


	}

}
