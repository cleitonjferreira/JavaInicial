import java.util.Random;

/**
 * Classe NumeroRandomico
 * @author Cleiton Ferreira
 * Classe para gerar n�meros rand�micos com um limite especificado
 */
public class NumeroRandomico {
	public static void main(String[] args) {
		// inst�ncia do objeto da classe Random (java.util.Random)
		Random objRandom = new Random();
		// valor m�ximo para um n�mero aleat�rio
		int valorMaximo = 10;
		// impress�es
		System.out.println("N�meros gerados de 0 at� valorMaximo (10)");
		System.out.println("N�mero gerado: "+objRandom.nextInt(valorMaximo));
		System.out.println("N�mero gerado: "+objRandom.nextInt(valorMaximo));
		System.out.println("N�mero gerado: "+objRandom.nextInt(valorMaximo));
	}// fim main
}// fim NumeroRandomico