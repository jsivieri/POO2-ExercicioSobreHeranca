package aula2;

public class TestarAnimais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mamifero Camelo = new Mamifero(null, null, null, 0, 0, 0, null);
		Camelo.setNome("Camelo");
		Camelo.setComprimento(150);
		Camelo.setNumPatas(4);
		Camelo.setCor("Amarelo");
		Camelo.setAmbiente("Terra");
		Camelo.setVelMedia(2);
		
		
		Peixe Tubarao = new Peixe(null, null, null, 0, 0, 0);
		Tubarao.setNome("Tubarão");
		Tubarao.setComprimento(300);
		Tubarao.setNumPatas(0);
		Tubarao.setCor("Cinzento");
		Tubarao.setAmbiente("Mar");
		Tubarao.setVelMedia(1);
		Tubarao.setCaracteristica("Barbatanas de Cauda");
				
		Mamifero Ursocanada = new Mamifero(null, null, null, 0, 0, 0, null);
		Ursocanada.setNome("Urso-do-canadá");
		Ursocanada.setComprimento(180);
		Ursocanada.setNumPatas(4);
		Ursocanada.setCor("Vermelho");
		Ursocanada.setAmbiente("Terra");
		Ursocanada.setVelMedia(0);
		Ursocanada.setAlimento("Mel");
		
			
		
	
			Camelo.dados();
			Tubarao.dadosPeixe();
			Ursocanada.dadosMamifero();
			
			
	
	}
	
	}


