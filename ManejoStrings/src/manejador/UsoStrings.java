package manejador;

public class UsoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String cadenaTexto = "Itzel Guadalupe Sanchez Munguia";

//si quiero cambiar el sanchez por otro apellido
if(cadenaTexto.contains("Munguia")) {
	System.out.println("si contiene");
	
	//para cambiar el munguia por arriaga se usa el replace
	cadenaTexto = cadenaTexto.replace("Munguia", "Arriaga");
	System.out.println(cadenaTexto);
	
	
}
//para obtener el tamaño se usa length, tambien cuenta los espacios en blanco
	int size = cadenaTexto.length();
	int posicion=0;
	char[] arregloCaracteres = cadenaTexto.toCharArray();
	
	
	
	for (int i=0;i<size;i++) {
		char caracterActual = arregloCaracteres[i];
		if(caracterActual == 'A') {
			posicion = i;
		}
		
		
	}
	
	System.out.println(posicion);
	System.out.println(size);
	
	//el uso de subtring es para cortar de una cadena de caracteres dadas las posiciones lo que deseamos cortar
	cadenaTexto = cadenaTexto.substring(0,posicion);
	System.out.println(cadenaTexto);
	
	//para imprimir en minuscula se usa un loweCase
	cadenaTexto = cadenaTexto.toLowerCase();
	System.out.println(cadenaTexto);
	
	//para imprimir en mayusculas se usa un uperCase
		cadenaTexto = cadenaTexto.toUpperCase();
		System.out.println(cadenaTexto);
			
	}

}
