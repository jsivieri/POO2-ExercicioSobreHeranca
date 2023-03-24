package aula2;

public class Peixe extends Animal{
	
	String caracteristica;


	public Peixe(String nome, String cor, String ambiente, float comprimento, float velMedia, int numPatas) {
		super(nome, cor, ambiente, comprimento, velMedia, numPatas);
		// TODO Auto-generated constructor stub
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}


	public void dadosPeixe() {
		System.out.println("Nome: " + getNome()+ " Comprimento: " 
				+ getComprimento()+ " Nº de patas: " + getNumPatas()+ " Cor: " + getCor()
				+ " Ambiente: " + getAmbiente()+ " Vel Media: " + getVelMedia()+ " Caracteristica: " + getCaracteristica());
	}
	
	

}









