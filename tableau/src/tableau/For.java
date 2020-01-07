package tableau;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] tab = {1,2,3,4,5}; // liste,attribution direct des elements en une fois 
		System.out.println("nb: "+tab.length);
	
	
		int indice =0;
			while (indice<tab.length) {
				System.out.println(tab[indice]);
				indice=indice+1; // ou indice ++ incrément
			}
			
	System.out.println("================================");		
			for (int indice2=0; indice2<tab.length;indice2++){
				System.out.println(tab[indice2]);
			}

			
	}
	/*resultat console
	 * 
nb: 5
1.0
2.0
3.0
4.0
5.0
================================
1.0
2.0
3.0
4.0
5.0
	 */
}
