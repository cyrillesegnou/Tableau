package tableau;

public class fonction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// afficher tableau
		//doubler la valeur des elements du tableau
		//afficher tableau avec les modif
	
	
		double[] tab = {1,2,4.7,4,2.3}; // liste,attribution direct des elements en une fois 
	show(tab);
	doublerValeurElements(tab);
	System.out.println("====================================================");
	show(tab);
	System.out.println("====================================================");
	for(double d:tab) {
		System.out.println(d); // d variable intermediaire pour faire itération
		// demande a d de prendre 1 a 1 les valeurs de tab
		// equivalent for each
	}
	System.out.println("====================================================");	
	double total=sum(tab);
	System.out.println("somme= "+total);
	double moy= moyenne(tab);
	System.out.println("moyenne = "+ moy);
	System.out.println("====================================================");
	double min = minimum(tab);
	System.out.println("minimum= "+ min);
	double max = maximum(tab);
	System.out.println("maximum= "+ max);
	System.out.println("====================================================");
	
	}
///////////////////////////////////////////////////////////////////////////////////////////////
	private static double maximum(double[] tab) {
		// TODO Auto-generated method stub
	
			double d=tab[0];	
					for (int i=0; i<tab.length-1;i++) {
						if (tab[i+1]>d) {
						d=tab[i+1];
					}
				}
		return d;
	}

	private static double minimum(double[] tab) {
		// TODO Auto-generated method stub
		double d=tab[0];	
		for (int i=0; i<tab.length-1;i++) {
			if (tab[i+1]<d) {
			d=tab[i+1];
		}
	}
return d;
	}

	private static double moyenne(double[] tab) {
		// TODO Auto-generated method stub
		
		return sum(tab)/tab.length;
	}

	private static double sum(double[] tab) {
		// TODO Auto-generated method stub
		double i =0;
				for(double d:tab) {
					i=i+d;  // ou i+=d
				}
		return i;
	}

	private static void doublerValeurElements(double[] tab) {
		// TODO Auto-generated method stub
		int indice=0;
		while (indice<tab.length) {
			tab[indice]	= tab[indice]*2;
		indice++;
		
		// for(double a :tab){
		//  	 System.out.println(a*2);
		}
	}

	private static void show(double[] tab) {
		// TODO Auto-generated method stub
		int indice=0;
				System.out.print("indices:");
				while (indice<tab.length) {
					System.out.print(indice+" ");	
				indice++;
				}
				System.out.println();
		int indice2=0;
				System.out.print("elements:");
				while (indice2<tab.length) {
					System.out.print(tab[indice2]+" ");	
				indice2++;
				}
				System.out.println();
/*
 * 
 for(double b:tab){
 		System.out.println(b);
 */
				
				
	}
/*resultat console
 * 
indices:0 1 2 3 4 
elements:1.0 2.0 4.7 4.0 2.3 
====================================================
indices:0 1 2 3 4 
elements:2.0 4.0 9.4 8.0 4.6 
====================================================
2.0
4.0
9.4
8.0
4.6
====================================================
somme= 28.0
moyenne = 5.6
====================================================
minimum= 2.0
maximum= 9.4
====================================================
 */
}
