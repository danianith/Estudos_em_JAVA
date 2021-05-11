
public class TipoLogico {
	public static void main(String[] args) {
		Boolean variavelVerdadeira = true;
		System.out.println("Variável Verdadeira: " + variavelVerdadeira);
		
		Boolean variavelFalsa = false;
		System.out.println("Variável Falsa: " + variavelFalsa);
		
		System.out.println("---------------------------------------");
		
		Integer idade = 19;
		
		Boolean podeTirarCarteira = idade >= 18;
		
		if (podeTirarCarteira) {
			System.out.println("Sim! A pessoa pode tirar carteira.");
		} else {
			System.out.println("Não! A pessoa não pode tirar carteira");
		}
		
		// System.out.println("Pode Tirar Carteira? " + podeTirarCarteira);
	}

}
