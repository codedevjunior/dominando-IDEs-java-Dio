package br.com.dio;

import br.com.dio.model.Animal;

public class ProgramaJava {

	public static void main(String[] args) {

		
		Animal animal = new Animal("Cachorro", "Preto", 28);
		
		System.out.println(animal.getNome());
		System.out.println(animal.getIdade());
		System.out.println(animal.getCor());
		
	}

}
