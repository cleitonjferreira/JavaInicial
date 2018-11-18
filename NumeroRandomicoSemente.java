import java.util.Random;

/**
 * Classe NumeroRandomicoSemente
 * @author Cleiton Ferreira
 * Classe para gerar números randômicos passando uma semente
 */
public class NumeroRandomicoSemente {
	public static void main(String[] args) {
		// instância do objeto da classe Random (java.util.Random) utilizando semente
		// !!! a saída será sempre a mesma !!!
		Random objRandom = new Random(19021979);
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