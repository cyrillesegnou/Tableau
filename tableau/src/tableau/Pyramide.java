package tableau;

public class Pyramide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showPyramide(5);
		
	}
///////////////////////////////////////////////////////////////////

	private static void showPyramide(int n) {
//	String s=""	;
//
//			for(int i=0;i<2*n-1; i++) {
//				for(int j=n-1;j>0;j--) {
//					s=s+ " ";
//				}
//				for(int k=0;k<2*n-1;k++) {
//					s=s+"*";
//				}
//				System.out.println(s);
//			
			
	String ligne= new String();
	String s=new String();
	String r=new String();
	
for (int i=0;i<n;i++) {
		for(int j=0;j<n-i-1;j++) {
		s=s+" ";
		
	for(int k=0;k<n-i-1;k=k+2) {
		r=r+"*" ;
		System.out.print(s);
		System.out.println(r);

		}}
		
				
//	ligne=s+r;
//	System.out.println(ligne);	
			}
		
		
		}
	}
	
	/*Console
	 * 
 *
 **
  ***
  ****
   *****
   ******
    *******
    ********
     *********
     **********
      ***********
      ************
       *************
       **************
        ***************
         ****************
          *****************

	 * 
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

////////////////////////////////////////////////////////////////////