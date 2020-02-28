package classes;

public class Principal {

	public static void main(String[] args) {
		
		Pais brasil = new Pais("Brasil", "Brasilia", 8511000);
		
		Pais paraguai = new Pais("Paraguai", "Assunção", 406752);
		
		Pais argentina = new Pais("Argentina", "Buenos Aires", 2780000);
		
		//System.out.println(brasil.getNome());
		
		brasil.adicionarFronteira(paraguai);
		brasil.adicionarFronteira(argentina);
		brasil.adicionarFronteira(brasil);
		
		argentina.adicionarFronteira(brasil);
		argentina.adicionarFronteira(paraguai);
		/*
		if(brasil.equals(argentina)) {
			System.out.println("Os países são iguais");
		} else {
			System.out.println("Os países são diferentes");
		}
		*/
		/*
		for(Pais a : brasil.listarFronteira()) {
			System.out.println(a.getNome());
		}
		*/
		/*
		for(Pais a : brasil.verificarFronteira(argentina)) {
			System.out.println(a.getNome());
		}
		*/
		
		System.out.println(brasil);
		
	}

}
