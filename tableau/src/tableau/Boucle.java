package tableau;

public class Boucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] tab = {1,2,3,4,5}; // liste,attribution direct des elements en une fois 
		System.out.println("nb: "+tab.length);
	
	int indice =0;
			while (indice<tab.length) {
				System.out.println(tab[indice]);
				indice=indice+1; // ou indice ++ incrément
			}
	/* exo fait en 2 version
	 * tab en type int puis en type double
	 * simple changement de la ligne de def de la liste
	 *va modifier tous les element sans avoir à y toucher
	 */
			
	System.out.println("================================ ");
			int indice2 =tab.length-1;
			while (indice2>=0) {
				System.out.println(tab[indice2]);
				indice2=indice2-1; // ou indice -- décrément
			}
	
			
			
			System.out.println("================================ ");
			int indice3 =tab.length-1;
			while (indice3>=0) {
				System.out.println(tab[--indice3]);
			//	indice3--;
			}
	}

}
