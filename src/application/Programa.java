package application;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportados;
import entities.ProdutoUsado;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner teclado =  new Scanner(System.in);
		List<Produto> lista = new ArrayList<>();
		
		System.out.print("Quantos Produtos deseja cadastrar? ");
		int quantidade = teclado.nextInt();
		
		
		for(int i=0; i< quantidade; i++) {
			
			 
				
			System.out.println("PRODUTO #"+i+1);
			System.out.print("Comum, Usado ou Importado (c/u/i)?");
			 char m = teclado.next().charAt(0);
			
			
			
			if (m =='c') {
				
				System.out.print("Nome: ");
				teclado.nextLine();
				String nome = teclado.nextLine();
				System.out.print("Preço: ");
				double preco = teclado.nextDouble();
				lista.add(new Produto(nome, preco)) ;
				
			} else if (m =='i') {
				
				System.out.print("Nome: ");
				teclado.nextLine();
				String nome = teclado.nextLine();
				System.out.print("Preço: ");
				double preco = teclado.nextDouble();
				System.out.print("Taxa Alfândegaria: ");
				double taxaAlfandega = teclado.nextDouble();
				
				lista.add(new ProdutoImportados(nome, preco, taxaAlfandega));

				
				
			} else if (m=='u') {
				
				System.out.print("Nome: ");
				teclado.nextLine();
				String nome = teclado.nextLine();
				System.out.print("Preço: ");
				double preco = teclado.nextDouble();
				System.out.print("Data de Fabricação: ");
				teclado.nextLine();
				String data = teclado.nextLine();
				DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
				Date dt = df.parse(data);
				
				lista.add(new ProdutoUsado(nome, preco, dt));
				
				
				
				
			}
			

			
			
			
		}

		
		
		for(Produto produto : lista) {
			
			produto.etiquetar();
		}
		
		
		
		
		
		
		
		teclado.close();

	}

}
