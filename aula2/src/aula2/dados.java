package aula2;

public class dados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a1 = new Animal(null, null, null, 0, 0, 0);
		a1.setNome("Thor");
		a1.setCor("Preto");
		a1.setAmbiente("Terrestre");
		System.out.println("O nome do animal é: " + a1.getNome()+ " cor: " + a1.getCor()+ " ambiente: " + a1.getAmbiente());
		
	}

}
