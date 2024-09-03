/**
 * 
 */
package BancoFatec;

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
		String menu;
		int op = 0;
		double valor;
		menu = "\n 1.Depositar. \n 2.Sacar. \n 3.Transferir. \n 4.Mostrar dados. \n 0.Sair \n Digite a opção desejada.";
		
		do {
			System.out.println(menu);
			op = entrada.nextInt();	
			
			switch (op) {
			case 1: {
				
			}
			case 2: {
				
			}
			case 3: {
				
			}
			case 4: {
				
			}
			case 0: {
				
			}
			default: {
				
			}
			}
		} while (op != 0);
		
		
	}

}
