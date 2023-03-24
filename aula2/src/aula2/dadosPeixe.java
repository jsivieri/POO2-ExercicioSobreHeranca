package aula2;

public class dadosPeixe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Peixe p1 = new Peixe(null, null, null, 0, 0, 0);
		p1.setNome("Nemo");
		p1.setCor("Laranja");
		p1.setAmbiente("Aquatico");
		p1.setCaracteristica("Escama");
		System.out.println("O nome do animal é: " + p1.getNome()+ " cor: " + p1.getCor()+ " ambiente: " + p1.getAmbiente()+ " Caracteristica: " + p1.getCaracteristica());
	
	}

}
