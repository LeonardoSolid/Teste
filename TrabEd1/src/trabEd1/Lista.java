package trabEd1;

import java.util.Scanner;

public class Lista {
	
	public static Scanner teclado = new Scanner(System.in);
	public static Scanner op = new Scanner(System.in);
	
	public Elemento primeiro;
	public Elemento ultimo;
	public int qtd;
	
	//Método para listar instrumentos cadastrados
	public  void listar(Lista lista) {
		Elemento aux = lista.primeiro;
		if(aux == null) {
			System.out.println("ESTOQUE VAZIO!Cadastre um item!!!");
		}else {
			while (aux!=null) {
				System.out.println(aux.instrumento);
				aux = aux.proximo;
			}
		}
	}
	
	
	//Método para cadastrar instrumentos
	public  void cadastrar(Lista lista) {
		int a = 0;
		do {
		Elemento novoObj = new Elemento();
		Elemento objAux = new Elemento();
		
		
		//Lista sem nenhum elemento
		if(lista.qtd == 0) {
			System.out.print("Informe o Instrumento que será atualizado no estoque: ");
			novoObj.instrumento = teclado.next();
			
			System.out.print("Deseja continuar a cadastrar? 1 - NAO ; Qualquer numero para 'SIM'");
			a = op.nextInt();
			
			novoObj.proximo=null;
			
			lista.primeiro = novoObj;
			lista.ultimo = novoObj;
			lista.qtd++;
			
			
		}
		//Lista com elementos
		else {
			
			objAux = lista.primeiro;
			
			while(objAux.proximo!=null) {
				objAux = objAux.proximo;
			}
			System.out.print("Informe o Instrumento que será atualizado no estoque: ");
			novoObj.instrumento = teclado.next();
			
			System.out.print("Deseja continuar a cadastrar? 1 - 'NAO' ; Qualquer numero para 'SIM'");
			a = op.nextInt();
			novoObj.proximo=null;
			
			objAux.proximo = novoObj;
			
			lista.ultimo = novoObj;
			lista.qtd++;
		}
		}while(a != 1);
	}

}
