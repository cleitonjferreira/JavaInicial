import java.util.Random;

/**
 * Classe NumeroRandomico
 * @author Cleiton Ferreira
 * Classe para gerar números randômicos com um limite especificado
 */
public class NumeroRandomico {
	public static void main(String[] args) {
		// instância do objeto da classe Random (java.util.Random)
		Random objRandom = new Random();
		// valor máximo para um número aleatório
		int valorMaximo = 10;
		// impressões
		System.out.println("Números gerados de 0 até valorMaximo (10)");
		System.out.println("Número gerado: "+objRandom.nextInt(valorMaximo));
		System.out.println("Número gerado: "+objRandom.nextInt(valorMaximo));
		System.out.println("Número gerado: "+objRandom.nextInt(valorMaximo));
	}// fim main
}// fim NumeroRandomico