public class AjoutValeur {
	public static boolean ajoutValeur(int[][] jeu, int chiffre, int x, int y) {
		int a;
		int b;
		
		a = (x / 3) * 3;
		b= (y / 3) * 3;
		
		int i;
		int j;
		boolean ok;
		
		i = 0;
		while(i < 3) {
			j = 0;
			while(j < 3) {
				ok = jeu[a+i][b + j] != chiffre;
				j++;
			}
			i++;
		}
		
		return true;
	}
	public static void main(String[] args){
		int[][] mat;
		int nombre;
		
		mat = new int[9][9];
		nombre = 3;
		ajoutValeur(mat, nombre, 1,7);
	}
}

