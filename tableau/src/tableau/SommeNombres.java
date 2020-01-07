package tableau;

public class SommeNombres {

	public static void main(String[] args) {
	long resultat = sommePremiersNombres1(10); // complexité algorithmique de N 
			System.out.println("Resultat: "+resultat);
	
	long resultat2 = sommePremiersNombres2(10);
	System.out.println("Resultat: "+resultat2);
	long resultat3 = sommePremiersNombres3(10);
	System.out.println("Resultat: "+resultat3);
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////
private static long sommePremiersNombres1(int i) {
		int r=0;
		for (int j=1; j<=i;j++) {
			r+=j;
			System.out.println(r);
		}
		return r;
	}

private static long sommePremiersNombres2(int i) {
	// TODO Auto-generated method stub
	return i*(i+1)/2;
}
private static long sommePremiersNombres3(int i) {
	// TODO Auto-generated method stub
	if (i==1) {
		return 1;
		
	}else {
	return i+ sommePremiersNombres3(i-1);
}}
	/*
	 * Resultat console
	 * 
	 1
3
6
10
15
21
28
36
45
55
Resultat: 55
Resultat: 55
Resultat: 55
	 */
}
