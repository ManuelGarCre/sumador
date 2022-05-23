package sumador;
/** Clase para sumar los valores numericos por
 * los que esta formado un numero.
 * 
 * @author Manuel García Cremades
 */
public class ASumar {
	/** 
	* Suma individualmente los valores que componen un numero. 
	* @param numero valor numerico cualquiera a sumar. 
	* @return cadena del sumatorio y resultado.
	*/ 
	public String sumativo(String numero) {
		int tamanyo = numero.length();
		String resultado = "";
		
		//Si numero es de una soa cifra.
		if(tamanyo == 1) {
			resultado = numero + " = " + numero;
		}
		//Si numero es negativo.
		else if(numero.charAt(0) == '-') {
			resultado = "Negativo, siempre negativo";
		}
		//Si el numero tiene mas de una cifra y no es negativo.
		else {
			for(int i = 0; i < (numero.length() - 1); i++) {
				resultado += numero.charAt(i) + " + ";
			}
			
			resultado += numero.charAt(tamanyo - 1) + " = " + sumaDigitos(numero);
		}
		return resultado;
	}
	
	public int sumaDigitos(String numero) {
		int total = 0;
		
		for(int i = 0; i < numero.length(); i++) {
			total += Character.getNumericValue(numero.charAt(i));
		}
		
		return total;
	}
}
