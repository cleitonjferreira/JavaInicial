import java.util.Random;

/**
 * Classe NumeroRandomicoLoop
 * @author Cleiton Ferreira
 * Classe para gerar números randômicos com quantidade e limite especificado
 */
public class NumeroRandomicoLoop {
	public static void main(String[] args) {
		// instância do objeto da classe Random (java.util.Random)
		Random objRandom = new Random();
		// valor máximo para um número aleatório
		int valorMaximo = 10;
		// quantidade especificada
		int quantidade = 5;
		// impressões
		System.out.println("Números gerados de 0 até valorMaximo (10)");
		// loop para impressão
		for (int i = 0; i < quantidade; i++) {
			System.out.println("Número gerado: "+objRandom.nextInt(valorMaximo));
		}
	}// fim main
}// fim NumeroRandomicoLoop