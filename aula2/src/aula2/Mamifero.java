package aula2;

public class Mamifero extends Animal{
	
	String alimento;

	public Mamifero(String nome, String cor, String ambiente, float comprimento, float velMedia, int numPatas,
			String alimento) {
		super(nome, cor, ambiente, comprimento, velMedia, numPatas);
		this.alimento = alimento;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}


		public void dadosMamifero() {
			System.out.println("Nome: " + getNome()+ " Comprimento: " 
				+ getComprimento()+ " Nº de patas: " + getNumPatas()+ " Cor: " + getCor()
				+ " Ambiente: " + getAmbiente()+ " Vel Media: " + getVelMedia()+ " Alimento " + getAlimento());
		}
	

}
