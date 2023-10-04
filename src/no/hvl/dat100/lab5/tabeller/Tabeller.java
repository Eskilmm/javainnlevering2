package no.hvl.dat100.lab5.tabeller;

import java.util.Arrays;
import java.util.ArrayList;

public class Tabeller {
	//public static void main(String[] args) {
		
		//int[] intTabell = {1,2,16,15,17};
	//	int[] sortertTabell= {2,5,6,7,8};
		
		/* d) int tall = 7;
		
		System.out.println("Liste: "+ intTabell);
		
		finnesTall(intTabell, tall);
		*/
		
		// a)  skrivUt(intTabell);
		// b) tilStreng(intTabell);
		//For// c) System.out.println(summer(intTabell));
		//While // c) System.out.println(summer(intTabell));
		
		// e) System.out.println(posisjonTall(intTabell, 2));
		// reverser(intTabell);
		
		//System.out.println(erSortert(intTabell));
		//System.out.println(erSortert(sortertTabell));
		
	
	


	// a)
	public static void skrivUt(int[] tabell) {
		
		
		for (int i =0; i<tabell.length; i++) {
			System.out.println(tabell[i]);
			
		}
		
	}

	// b)
	public static String tilStreng(int[] tabell) {
		
		for(int i = 0; i<tabell.length; i++) {
			
			System.out.println(Arrays.toString(tabell));
		}
		return null;
		
		
	}

	// c)
		public static int summer(int[] tabell) {

		
	 
	
		
		/*ArrayList<Integer> tall = new ArrayList<Integer>();
		tall.add(1);
		tall.add(3);
		tall.add(5);
		tall.add(7);
		tall.add(9);
		
		int sum = 0;
		int i = 0;
		
		while(i<tall.size()) {
			sum += tall.get(i);
			i++;
	
					
		}
		return sum;
		*/
		
			 
		int sum= 0;
		int j;

		for(int i= 0; i<tabell.length; i ++) {
			sum += tabell[i];
			
			
		}
		return sum;
}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		
		boolean finnes = false;
		
		for(int e: tabell) {
			if(e == tall) {
				finnes= true;
			break;
			}
		}
		System.out.println("Finnes " + tall + " i listen: " + finnes );
		return finnes;
		
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		if(tabell== null) {
			return -1;
		}
		int lengd= tabell.length;
		int i = 0;
		
		while (i < lengd) {
			
			if(tabell[i] == tall) {
				return i;
			}
			else {
				i = i +1;
			}
		}
				return -1;

	}
	

	// f)
	public static int[] reverser(int[] tabell) {

		for(int i = tabell.length -1; i>= 1; i --) {
			
			System.out.println(tabell[i]);
			
			
				
			}
		return tabell;
			
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		int a = 1;
		boolean sortert = true;
		
		while (sortert && a < tabell.length - 1) {
			if (tabell[a] > tabell[a + 1]) {
				sortert = false;
			}
			a++;
		
		
		}

			return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		
		int nyTabell = tabell1.length + tabell2.length;
		int[] nyTab = new int[nyTabell];
		for(int i = 0; i<tabell1.length; i ++) {
			nyTab[i] = tabell1[i];
			
		}
		for(int j = 0; j < tabell2.length; j++) {
			nyTab[tabell1.length+j] = tabell2[j];
			
			
		}
			return nyTab;
		
	}
	
}
//}
