package atividades6.exercicios;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		int opcao;
		
		Stack<String> pilha = new Stack<String>();
		String livro;
		
		do {
		System.out.println("************************************");
		System.out.println("1 - Adicionar livro na pilha");
		System.out.println("2 - Listar todos os livros");
		System.out.println("3 - Retirar livro da pilha");
		System.out.println("0 - Sair");
		System.out.println("************************************");
		System.out.println("Entre com a opção desejada: ");
		
		opcao = leia.nextInt();
		
		 switch (opcao) {
		 
           case 1:
			System.out.println("Digite o livro:");
			livro = leia.next();
			pilha.push(livro);
			System.out.println("Livro Adicionado!");
			break;
			
			case 2:
			System.out.println(pilha);
			break;
			
			case 3:
				if (pilha.isEmpty()) {
			System.out.println("A pilha está vazia!");
				} else {
			
			pilha.pop();
			System.out.println(pilha + "\n O livro foi retirado da pilha!");
				}
				break;
			
			case 0:
				System.out.println("Programa finalizado!");
				break;
		
		

	}

} while (opcao != 0); }
	
}
