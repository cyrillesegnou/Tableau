package tableau;

public class tableauconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		
		int c=	 lettre2Chiffre1("N");
		System.out.println(c);
	}

	private static int lettre2Chiffre1(String n) {
		// TODO Auto-generated method stub
		String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		
		for (int position=1;position<=alphabet.length; position++ ) {
			if (alphabet[position]==n) {
				return position;
			}
//			else {
//				position++;
//			}
		
//		for(String d:alphabet) {
//			position+=1;
//			if (d==n) {
//				return position;	
//			}
//		}
//		
		
	}

}
}