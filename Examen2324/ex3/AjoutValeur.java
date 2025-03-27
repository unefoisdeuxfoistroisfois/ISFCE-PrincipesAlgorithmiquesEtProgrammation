public class AjoutValeur {
	public static boolean ajoutValeur(int[][] jeu, int chiffre, int x, int y) {
		int a;
		int b;
		
		a = (x / 3) * 3;//Connaitre le block alors on / comme sa on pourra avoir 0, 1 ou 2 qui est le numero du block de 3
		b= (y / 3) * 3; //Colonne de blocks
		
		int i;
		int j;
		boolean ok;
		
		ok = true;
		//VERFIICATION SI DANS LA LIGNE IL Y'A LE NOMBRE
		i = 0;
		while(i < 9){
			if(jeu[x][i] == chiffre){
				return false;
			}
			i++;
		}

		//VERIFICATION COLONNE
		i = 0;
		while(i < 9){
			if(jeu[i][y] == chiffre){
				return false;
			}
			i++;
		}

		i = 0;
		//VERIFICAITON SI ON PEUT METTRE NOTRE NOMBRE DANS LE BLOCK
		while(i < 3 && ok == true) {
			j = 0;
			while(j < 3 && ok == true) {
				if(jeu[a + i][b + j] == chiffre){
					ok = false;
				}
				j++;
			}
			i++;
		}
		//AJOUT DE NOTRE NOMBRE APRES VERIFICATION SI IL EXISTE DEJA	
		if(ok) {
			jeu[x][y] = chiffre;
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[] args){
		int[][] mat;
		int nombre;
		boolean res;
		
		mat = new int[][]{

			{5, 3, 0, 0, 7, 0, 0, 0, 0},
			{6, 0, 0, 1, 9, 5, 0, 0, 0},
			{0, 9, 8, 0, 0, 0, 0, 6, 0},
			{8, 0, 0, 0, 6, 0, 0, 0, 3},
			{4, 0, 0, 8, 0, 3, 0, 0, 1},
			{7, 0, 0, 0, 2, 0, 0, 0, 6},
			{0, 6, 0, 0, 0, 0, 2, 8, 0},
			{0, 0, 0, 4, 1, 9, 0, 0, 5},
			{0, 0, 0, 0, 8, 0, 0, 7, 9}
		};
		nombre = 3;
		//on va essayer de voir si nombre peut aller a la position x y.
		res = ajoutValeur(mat, nombre, 1,7);
		System.out.println(nombre+" peut il etre place á cette positon "+res);
		int	i;
		int	j;

		i = 0;
		while(i < 9){
			j = 0;
			while(j < 9){
				System.out.print(mat[i][j]+" ");
				j++;
			}
			i++;
			System.out.println(" ");
		}
	}
}

