package tableau;

public class AtelierArraySyntax01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				double [][] array1= {
						{1.1,5.6},
						{2.6,6.9},
						{5.6,9.6,8.7},
						{1.2},
				};
	
	// initialisation du tableau pour qu'il ait
	// la taille de la dimension principale de 
	//array1
	//ATTENTION pas de nombre magique
	
	double[] resultats = new double [array1.length];
	
	//to do: chaque element de resultat doit contenir la somme
	//du table élément de array1
    //cad resultat[0] vaut 1.1 + 5.6
	
	calcul(array1,resultats);
	System.out.println("nombres : "+resultats.length);
	show(resultats);
	
	
	}
/////////////////////////////////////////////////////////////////////////////////////////////

private static void show(double[] resultats) {
			// TODO Auto-generated method stub
			int indice=0;
					System.out.print("indices:");
					while (indice<resultats.length) {
					
						System.out.print(indice+" ");	
					indice++;
					}
					System.out.println();
			int indice2=0;
					System.out.print("elements:");
					while (indice2<resultats.length) {
						System.out.print(resultats[indice2]+" ");	
					indice2++;
					}
					System.out.println();
	}

	private static void calcul(double[][] array1, double[] resultats) {
		// TODO Auto-generated method stub
		
		for (int i=0;i<array1.length;i++) {
			for(int j=0;j<array1[i].length;j++) {
				resultats[i]+=array1[i][j];
			}
			
		}
		
		
/*
 * Console
 * 
 nombres : 4
indices:0 1 2 3 
elements:6.699999999999999 9.5 23.9 1.2 
	
 */
		
		
		
	}
/////////////////////////////////////////////////////////////////////////////////////////
}
