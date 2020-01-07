package algo;
 
import java.util.Arrays;
 
public class MainTableauRechercheLineaire {
 
    public static void main(String[] args) {
        int[] tab = {5,8,56,1,0,9,78,20};
        System.out.println(Arrays.toString(tab));
        int item = 89;
    
        int pos = rechercheLineaire(tab, item);    //renvoie l'index dans le tableau de l'element cherché
        if(pos==-1)
            System.out.format("L'item %d n'a pas été trouvé\n",item);
        //ici pas println mais format pour mettre une chaine de caratere
        //chaque %d sera remplacé par ce qui est mis après la virgule
        //premier %d par le premier mot, 2ieme avec le 2ieme etc..
        else
            System.out.format("L'item %d est à la position %d\n",item,pos);
    }
 ////////////////////////////////////////////////////////////////////////////////
     //algo pour chaque element du tableau voir si l'element recherché est bien le ieme. si oui envoyer indice
    //sinon envoyer -1
     
    private static int rechercheLineaire(int[] tab, int item) {	
    int pos=-1;
    	for(int i=0; i<tab.length;i++) {
			if (tab[i]==item) {
				pos=i;
			}
    }
    	return pos;
}
 }