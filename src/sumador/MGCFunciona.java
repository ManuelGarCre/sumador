package sumador;

public class MGCFunciona {

	public static void main(String[] args) {
		if(args.length > 0) {
			ASumar suma = new ASumar();
			String resultado = "";
			
			for(int i = 0; i < args.length; i++) {
				resultado += args[i];
			}
			System.out.println(suma.sumativo(resultado));
		}
		else {
			System.out.println("Introduce un número por parametro, por favor.");
		}
		
	}

}
