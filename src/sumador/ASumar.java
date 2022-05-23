package sumador;

public class ASumar {

	public String sumativo(String numero) {
		int tamanyo = numero.length();
		String resultado = "";
		
		if(tamanyo == 1) {
			resultado = numero + " = " + numero;
		}
		return resultado;
	}

}
