package POO44;

import java.util.ArrayList;
import java.util.Scanner;

public class Collections {

	public static void main(String[] args) {

		int op;
		Scanner leia = new Scanner(System.in);
		
		ArrayList <String> estoque = new ArrayList();
		
		do
		{
			System.out.println("\n-----------------------------------------------------");
			System.out.println("\n(1) Adicionar um produto no estoque");
			System.out.println("\n(2) Remover um produto do estoque");
			System.out.println("\n(3) Atualizar um produto do estoque");
			System.out.println("\n(4) Mostrar todos os produtos do estoque");
			System.out.println("\n(0) Encerrar o programa?");
			System.out.println("\n-----------------------------------------------------");
			System.out.println("\nDigite sua op��o: ");
			op = leia.nextInt();
			
			switch(op)
			{
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o produto para adicionar ao estoque: ");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
				
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto para remover do estoque: ");
				String produtor = leia.nextLine();
				if(estoque.contains(produtor))
				{
					estoque.remove(produtor);
				}
				else
				{
					System.out.println("\nProduto n�o existe!!!");
				}
				System.out.println(estoque);
				break;
				
			case 3: 
				leia.nextLine();
				System.out.println("\nDigite o produto que deseja atualizar: ");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o produto que entrar� no lugar de "+verifica+ " : ");
				String novo = leia.nextLine();
				
				if(estoque.contains(verifica))
				{
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else
				{
					System.out.println("\nProduto n�o existe!!!");
				}
				System.out.println(estoque);
				break;
				
			case 4:
				System.out.println("\nOs produtos que temos no estoque s�o: ");
				System.out.println(estoque);
				break;
				
			default:
					if(op==0)
					{
						System.out.println("\nMuito obrigado por utilizar nosso sistema!");
					}
					else
					{
						System.out.println("\nOp��o inv�lida, por favor digite uma op��o existente.");
					}
			}
			
		}
		while(op!=0);
	}

}
