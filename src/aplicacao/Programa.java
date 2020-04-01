package aplicacao;

import java.util.Scanner;

import entidades.Imovel;
import entidades.Novo;
import entidades.Usado;

import java.util.Date;
public class Programa {

	public static void main(String[] args) {
		Scanner ler =new Scanner (System.in);
	
		System.out.println("Informe seu nome");
		String nome=ler.nextLine();
		System.out.println("Imforme seu indereço");
		String endereco=ler.nextLine();
		System.out.println("Iforme a area do imovel");
		Double area=ler.nextDouble();
		System.out.println("Informe o valor do imovel ");
		Double valor=ler.nextDouble();
		System.out.println("informe a data que o imovel estará disponivel");
		String data=ler.nextLine();
		
		
		Imovel im= new Imovel(nome,endereco,area,valor);
		//Novo novo=new Novo(data);
		//System.out.println(im);
}
}