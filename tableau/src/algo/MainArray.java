package algo;

import java.util.Arrays;
import java.util.Random;

public class MainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random random = new Random();
int[] tab = random.ints(10,-100,1_000).toArray(); //tableau de nombres aleatoires de 10 nombre entre -100 et 1000
System.out.println(Arrays.toString(tab));

	int nbNegatifs= getNegatifs(tab);
	System.out.println(nbNegatifs);
	int nbPairs=getPairs(tab);
	System.out.println(nbPairs);
	int[] nbPremiers= getPremiers(tab);
	System.out.println(nbPremiers);
	}
//////////////////////////////////////////////////////////////////////////////////
	private static int getPairs(int[]tab) {
		// TODO Auto-generated method stub
		System.out.println("nb pairs: ");
		int nbPairs=0;
		for(int d:tab) {
			if (d%2==0) {
				nbPairs+=1;
	}
			
		}return nbPairs;
	}

	private static int getNegatifs(int[]tab) {
		// TODO Auto-generated method stub
		int nbNeg=0;
		System.out.println("nb negatifs: ");
		for(int d:tab) {
			if (d<=0) {
				nbNeg+=1;
			}
		}
		return nbNeg;
		
	}
	
		private static int[] getPremiers(int[]tab) {
		// TODO Auto-generated method stub
			int[] RefPremiers = {2,3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,97};
			
			
			
			System.out.println("nb Premiers: ");
			for(int d:tab) {
				int[] temp	= new int[0];
				for (int r:RefPremiers) {
					if (r==d) {
						
						temp=add(d,temp);	
				}
				}
				return nbPrem;	
			
			}
	}
		private static int[] add(int d, int[] temp) {
			// TODO Auto-generated method stub
			int[] newTab= new int[temp.length +1];
			for (i=0;i<temp.length;i++) {
				newTab[i]=temp[i]; //la on copie les n element de l'ancienne table
			}
			newTab[newTab.length-1]=n; // on ajoute le dernier et nouveau element qui est en derniere postion
			return newTab;
		}

	
	
	
}
/////////////////////////////////////////////////////////////////////////////////////