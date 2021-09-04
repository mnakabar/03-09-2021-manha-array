package com.company;

import java.net.FileNameMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
		Veiculos[] carro = new Veiculos[5];
		carro[0] = new Veiculos("KA", "Ford", 8000.0);
		carro[1] = new Veiculos("Fusca", "WV", 3000.0);
		carro[2] = new Veiculos("Kombi", "WV", 14000.0);
		carro[3] = new Veiculos("Monza", "Chevrolet", 4000.0);
		carro[4] = new Veiculos("Scort", "Ford", 2000.0);

		for (int i = 0; i < carro.length; i++) {
			System.out.println(carro[i].marca + " " + carro[i].modelo + "  " + carro[i].valor);

		}

		System.out.println("\n");
		Veiculos[] carros1 = new Veiculos[2];
		carros1[0] = new Veiculos("Onix","GCM",67.8);
		carros1[1] = new Veiculos("Uno","FIat",10.0);

		for (int i = 0;i < carros1.length;i++){

			System.out.println(carros1[i].modelo + " " + carros1[i].marca + " " + carros1[i].valor);
		}

		System.out.println("\n");
		Veiculos[] veiculos5 = new Veiculos[2];
		veiculos5[0] = new Veiculos("Carroca","Da terra",500.);
		veiculos5[1] = new Veiculos("Trator","GCM",80000.);

		for (int i = 0;i < veiculos5.length;i++){

			System.out.println(veiculos5[i].modelo + " " + veiculos5[i].marca + " " + veiculos5[i].valor);
		}

		System.out.println("\n");
		Imovel [] apartamento = new  Imovel[4];
		apartamento[0] = new Imovel("Comercial",80.0,"Lapa","076543-098");
		apartamento[1] = new Imovel("Residencial",60.0,"São Paulo","09876-098");
		apartamento[2] = new Imovel("Residencial",35.5,"Santana","09654-094");
		apartamento[3] = new Imovel("Compartilhado",45.0,"Jaçana","98743-012");

		for (int i = 0; i < apartamento.length; i++){

			System.out.println(apartamento[i].tipo + "  " + apartamento[i].tamanho + " " + apartamento[i].bairro + " " + apartamento[i].cep);

		}

		System.out.println("\n");
		Imovel[] apartamento1 = new Imovel[2];
		apartamento1[0] = new Imovel("Locação", 35.6,"Osasco","89765-098");
		apartamento1[1] = new Imovel("Comercial",60.0,"Barueri","78965-076");

		for (int i = 0;i < apartamento1.length;i++ ){

			System.out.println(apartamento1[i].tipo + " " + apartamento1[i].tamanho + " " + apartamento1[i].bairro + " " + apartamento1[i].cep);
		}


		System.out.println("\n");
		Roupa[] roupas = new Roupa[2];
		roupas[0] = new Roupa("Vestido","Branco","Levis",40);
		roupas[1] = new Roupa("saia","Preta","Nike",43);

		for (int i = 0;i < roupas.length;i++){

			System.out.println(roupas[i].modelo + " " + roupas[i].cor + " " + roupas[i].marca + " " + roupas[i].tamanho);
		}

		System.out.println("\n");
		Funcionario[] funcionarios = new Funcionario[3];
		funcionarios[0] = new Funcionario("João","Pedreiro",89765,9800.0);
		funcionarios[1] = new Funcionario("Maria","Gerente",98321,9000.0);
		funcionarios[2] = new Funcionario("Paula","Cozinheira",87654,800.0);

		for (int i = 0;i < funcionarios.length; i++){

			System.out.println(funcionarios[i].nome + " " + funcionarios[i].cargo + " " + funcionarios[i].registro + " " + funcionarios[i].salario);

		}


		System.out.println("\n");
		List<Funcionario> cargos = new ArrayList<>();
		cargos.add(new Funcionario("Maria","Gerente",87654,10000.0));
		cargos.add(new Funcionario("João","Supervisor",67543,40000.0));
		cargos.add(new Funcionario("Roberta","Professora",98651,3000.0));

		 for (int i= 0; i < cargos.size();i++){

			 System.out.println(cargos.get(i).nome + " ," + cargos.get(i).cargo + " ,"+ cargos.get(i).salario + ", " + cargos.get(i).registro);
		 }

		System.out.println("\n");
		List<Veiculos> veiculos4 = new ArrayList<>();
		veiculos4.add(new Veiculos("Polo","VW",89000.0));
		veiculos4.add(new Veiculos("Fit","Fiat",8900.5));
		veiculos4.add(new Veiculos("Variant","VW",6900.3));
		veiculos4.add(new Veiculos("Sandero","Reanault",505000.8));

		for (int i = 0; i< veiculos4.size();i++){
			System.out.println(veiculos4.get(i).modelo + ", " + veiculos4.get(i).marca + "'" + veiculos4.get(i).valor);
		}


	}
}
