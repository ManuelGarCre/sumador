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
		
		if(tamanyo == 1) {
			resultado = numero + " = " + numero;
		}
		else if(numero.charAt(0) == '-') {
			resultado = "Negativo, siempre negativo";
		}
		return resultado;
	}

}
