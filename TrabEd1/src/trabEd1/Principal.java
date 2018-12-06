package trabEd1;

import java.util.Scanner;

public class Principal {

	public static Scanner teclado = new Scanner(System.in);
	public static Scanner op = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista lista = new Lista();
		lista.qtd = 0;
		int opcao = 0;
		
		while(opcao != 3) {
			System.out.println("1- Cadastrar Instrumento: ");
			System.out.println("2- Mostrar instrumentos cadastradados: ");
			System.out.println("3- Sair \n");
			opcao = op.nextInt();
			
			switch(opcao) {
			case 1:
				lista.cadastrar(lista);
				break;
				
			case 2:
				lista.listar(lista);
				break;
				
			
				
			}
		}
			
		
	}
	
	
}
