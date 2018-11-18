import java.util.Random;

/**
 * Classe NumeroRandomicoSemente
 * @author Cleiton Ferreira
 * Classe para gerar n�meros rand�micos passando uma semente
 */
public class NumeroRandomicoSemente {
	public static void main(String[] args) {
		// inst�ncia do objeto da classe Random (java.util.Random) utilizando semente
		// !!! a sa�da ser� sempre a mesma !!!
		Random objRandom = new Random(19021979);
		// valor m�ximo para um n�mero aleat�rio
		int valorMaximo = 10;
		// quantidade especificada
		int quantidade = 5;
		// impress�es
		System.out.println("N�meros gerados de 0 at� valorMaximo (10)");
		// loop para impress�o
		for (int i = 0; i < quantidade; i++) {
			System.out.println("N�mero gerado: "+objRandom.nextInt(valorMaximo));
		}
	}// fim main
}// fim NumeroRandomicoLoop