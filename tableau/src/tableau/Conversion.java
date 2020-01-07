package tableau;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// ont veut demander de convertir A en 1 mais 1 string pas chiffre
	
	String c=	 lettre2Chiffre1("N");
			System.out.println(c);
	}

	private static String lettre2Chiffre1(String n) {
		// TODO Auto-generated method stub
		String c= new String() ;
		switch(n) {
		case "A": case "J":
			c="1";
			return c;
		case "B": case "K": case "S":
			c="2";
			return c;
		case "C": case"L": case "T":
			c="3";
			return c;
		case "D": case "M": case "U":
			c="4";
			return c;
		case "E": case "N": case "V":
			c="5";
			return c;
		case "F": case "O": case "W":
			c="6";
			return c;
		case "G": case "P": case "X":
			c="7";
			return c;
		case "H": case "Q": case "Y":
			c="8";
			return c;
		case "I": case "R": case "Z":
			c="4";
			return c;
			
		}
		return c;
		
	
		}
	


}
