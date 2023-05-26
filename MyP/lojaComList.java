package MyP;


	
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import UtilityProjects.ListProd;
import util.SysCheck; 

	public class lojaComList {

		public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			SysCheck dados = new SysCheck();
			List<ListProd> data = new ArrayList<>();
			char response = 0;
			Double Balance = 0.0;
			
			System.out.println("====== Bem vindo ao Caixa ======");
			System.out.println();
			
			System.out.print("Deseja nos passar seu CPF?: ");
			char resCPF = sc.next().charAt(0);
			while ( resCPF != 's' && resCPF != 'n') {
				System.out.print("Resposta invalida, digite novamente: ");
				resCPF = sc.next().charAt(0);
			}
			if (resCPF == 's' ) {
				System.out.print("Digite seu CPF por favor: ");
				sc.nextLine();
				String CPF = sc.nextLine();
				while (CPF.length() < 10) {
					System.out.print("CPF INVÁLIDO,Digite novamennte: ");
					CPF = sc.nextLine();
					}
				dados.setCPF(CPF);
				}

			System.out.print("Deseja nos informar seu email?[s/n]:");
			char resEmail = sc.next().charAt(0);
			while ( resEmail != 's' && resEmail != 'n') {
				System.out.print("Resposta invalida, digite novamente: ");
				resEmail = sc.next().charAt(0);
		 }
			if (resEmail == 's') {
				System.out.print("Digite seu email por favor: ");
				sc.nextLine();
				String email = sc.nextLine();
				dados.setEmail(email);
	 	    }
			
			
			System.out.println();
			System.out.println(dados.Valid());
			System.out.println();
			
			System.out.println();
			System.out.println("====================================");
			System.out.println("       Cadastro de produtos: ");
			System.out.println("====================================");
			
			System.out.print("Deseja Dicionar um produto?[s/n]: ");
			response = sc.next().charAt(0);
			System.out.println();
			
			while(response != 's' && response != 'n') {
				System.out.print("Opção inválida: ");
				response = sc.next().charAt(0);
			}
			if (response == 'n') {
				System.out.println();
				System.out.println("Operação finalizada por não haver nenhum produto para balanço.");
				System.out.print("Obrigado volte sempre.");
			}
			if (response == 's') {
				while(response == 's') {
					System.out.print("Digite o Nome do produto: ");
					sc.nextLine();
					String product = sc.nextLine();
					System.out.print("Digite o valor do produto: R$");				
					Double price = sc.nextDouble();
					ListProd inf = new ListProd(product, price);
					Balance += price;
					data.add(inf);
					System.out.println("");
					System.out.print("Deseja Dicionar outro produto?[s/n]: ");
					response = sc.next().charAt(0);
					System.out.println();
					}
					System.out.println("=====================================");
					System.out.println("Produto                      Preço");
					System.out.println("-------------------------------------");
					for (ListProd x : data){
						System.out.println(x.toString());
					}
				
				System.out.println("===============================");
				System.out.print("O total de sua compra foi de R$ " + String.format("%.2f", Balance));
				System.out.println("=====================================");
				}
			sc.close();
			} 
	}

