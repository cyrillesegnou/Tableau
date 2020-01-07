package tableau;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int i=3;
		switch (i){   // switch que pour les entiers
			case 1:
				System.out.println("i vaut 1");
		break;  //permet de sortir du switch, presque toujours un break
		case 2: case 3: case 5: // etiquettes attribué lors de l'évaluation
			System.out.println("i vaut 2, 3 ou 5");
		break;
	default:
		System.out.println("autre valeur");
			break;
		}
		
		}
/////////////////////////////////////////////////////////////////
}
