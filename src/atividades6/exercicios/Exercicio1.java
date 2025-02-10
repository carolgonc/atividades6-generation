package atividades6.exercicios;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		int opcao;
		
        Queue<String> fila = new LinkedList<String>();
		String nome;
		
		do {
		System.out.println("************************************");
		System.out.println("1 - Adicionar cliente na fila");
		System.out.println("2 - Listar todos os clientes");
		System.out.println("3 - Retirar cliente da fila");
		System.out.println("0 - Sair");
		System.out.println("************************************");
		System.out.println("Entre com a opção desejada: ");
		opcao = leia.nextInt();
		
		 switch (opcao) {
		 
            case 1:
			System.out.println("Digite o nome:");
			nome = leia.next();
			fila.add(nome);
			System.out.println("Cliente Adicionado!");
			break;
			
			case 2:
			System.out.println(fila);
			break;
			
			case 3:
				if (fila.isEmpty()) {
			System.out.println("A fila está vazia!");
				} else {
			
			fila.remove();
			System.out.println(fila + "\nO Cliente foi chamado!");
				}
				break;
			
			case 0:
				System.out.println("Programa finalizado!");
				break;
			
				
				} 
		
	} while (opcao != 0); {
	
}
	
		}
}

