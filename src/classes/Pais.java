package classes;

// Importando a classe ArrayList
import java.util.ArrayList;

public class Pais {
	
	private String nome;
	private String capital;
	private double dimensao;
	private ArrayList<Pais> fronteira;
	
	// Construtor parametrizado
	public Pais(String nome, String capital, double dimensao) {
		this.nome = nome;
		this.capital = capital;
		this.dimensao = dimensao;
		
		fronteira = new ArrayList<Pais>();
	}

	// Métodos de acesso
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public double getDimensao() {
		return dimensao;
	}

	public void setDimensao(double dimensao) {
		this.dimensao = dimensao;
	}
	
	// Método para comparar dois países
	public boolean equals(Pais outro) {
		
		/*if(nome == outro.getNome()) {
			if(capital == outro.getCapital()) {
				return true;
			}
		}		
		
		if(nome == outro.getNome() && capital == outro.getCapital()) {
			return true;
		}*/
		
		if(nome.equals(outro.getNome()) && capital.equals(outro.getCapital())) {
			return true;
		}
		
		return false;
		
	}
	
	// Adicionando um país à lista de fronteira
	public void adicionarFronteira(Pais outro) {
		if(!this.equals(outro)) {
			fronteira.add(outro);
		}		
	}
	
	// Retornando a lista fronteira
	public ArrayList<Pais> listarFronteira() {
		return fronteira;
	}
	
	// Retornando os países comuns as duas fronteiras
	public ArrayList<Pais> verificarFronteira(Pais outro) {
		
		ArrayList<Pais> fronteiraComum = new ArrayList<Pais>();
		
		//for each
		for(Pais a : fronteira) {
			for(Pais b : outro.listarFronteira()) {
				if(a.equals(b)) {
					fronteiraComum.add(a);
				}
			}
		}
		return fronteiraComum;
	}
	
	@Override
	public String toString() {
		return nome + " - " + capital;
	}
}











