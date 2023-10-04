package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
	for(int[] rad : matrise)
	
	for(int x : rad)
		System.out.println(x + " ");
		
		
		
	}
		
	

	// b)
	public static String tilStreng(int[][] matrise) {
		
		String a = "";
		for (int i = 0; i < matrise.length; i++) {
		    a += ((a.length() > 0) ? "\n" : "");
		    for (int j = 0; j < matrise[0].length; j++)
		        a += matrise[i][j] + ((j < matrise[0].length - 1) ? " " : "");
		}
		return a;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int [][] nyMatrise = new int[matrise.length][tall];
		for(int i = 0; i < matrise.length; i ++){
			
		 {
				for (int x = 0; x<matrise.length; x++) {	
				
				}}
		}
		return nyMatrise;
			
			
			
		}
		
	
	

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden erLik ikke implementert");
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
