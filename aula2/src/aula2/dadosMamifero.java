package aula2;

public class dadosMamifero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mamifero m1 = new Mamifero(null, null, null, 0, 0, 0, null);
		m1.setNome("Dudu");
		m1.setCor("Branco");
		m1.setAmbiente("Terrestre");
		m1.setAlimento("Ração");
		System.out.println("O nome do animal é: " + m1.getNome()+ " cor: " + m1.getCor()+ " ambiente: " + m1.getAmbiente()+ " Alimento: " + m1.getAlimento());
	
	}

}
