
public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente Felipe = new ContaCorrente(2222, 3333);
		Felipe.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorImposto calculo = new CalculadorImposto();
		
		calculo.registra(Felipe);
		calculo.registra(seguro);
		
		System.out.println(calculo.getTotalImposto());
		
	}

}
