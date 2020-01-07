package tableau;

public class _if {
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab = {1,2,3,4,5}; // liste,attribution direct des elements en une fois 
		System.out.println("nb: "+tab.length);

//pour afficher 1 element sur 2	
	int indice =0;
			while (indice<tab.length) {
				if (indice %2== 0 ) {
				System.out.println(tab[indice]);	
			}// pas oublier de fermer la condition if avant d'incrémenter
			indice++;
	}
			/*resultat console
			 * 
nb: 5
1
3
5
			 */
}
}