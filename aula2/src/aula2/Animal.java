package aula2;

public class Animal {
	private String nome, cor, ambiente;
	private float comprimento, velMedia;
	private int numPatas;
	
	public Animal(String nome, String cor, String ambiente, float comprimento, float velMedia, int numPatas) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.ambiente = ambiente;
		this.comprimento = comprimento;
		this.velMedia = velMedia;
		this.numPatas = numPatas;
		
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public float getVelMedia() {
		return velMedia;
	}

	public void setVelMedia(float velMedia) {
		this.velMedia = velMedia;
	}

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}
	
	
public void dados() {
	System.out.println("Nome: "+getNome()+" Cor: "+this.cor+" Ambiente: "+this.ambiente+" Comprimento: "+this.ambiente);
}
	
	
}


































