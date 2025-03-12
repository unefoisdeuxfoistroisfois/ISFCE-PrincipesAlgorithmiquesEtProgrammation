public class EstSymetrique{

	public static boolean estSymmetrique(int[][] m){
		int	i;
		int	j;

		/*
		Le but est de parcourir uniquement la partie inférieure gauche de la matrice.
		*/
		
		// Vérifier si la matrice est carrée ou vide
		i = 0;
		if(m.length == 0|| m.length != m[i].length){
			System.out.println("la matrice n'est pas carré");
			return false;
		}

		i = 1;
		while(i < m.length){ //lignes
			j = 0;
			while(j < i){ //colonne mais on va jusque a i -1 pour pas parcourir le reste
				if(m[i][j] != m[j][i]){ //Comparaison élément opposés
					return false;
				}
				j++;
			}
			i++;
		}
		return true;
	}

	public static void main(String[] args){
		int[][] mat;
		boolean res;

		mat = new int[][] {
			{9,1,6,},
			{-1,5,1},
			{6,1,3}
		};

		res = estSymmetrique(mat);

		System.out.println("la matrice est elle symetrique : "+ res);
	}
}
