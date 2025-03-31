public class creeCarreMagique{

	public static int[][] creeCarreMagique(int taille){
		int[][] mat;
		int	i;
		int	j;
		int	valeur;

		i = 0;
		j = taille / 2; //MILIEU
		valeur = 1;
		mat = new int[taille][taille];

		while(valeur <= taille * taille){

			mat[i][j] = valeur;
			valeur++;

			int	posI = i;
			int 	posJ = j;

			i--;
			j++;

			//Si on depassse sa veut dire que on voullait aller a la length - 1 donc on assignie 
			if (i < 0) {
                		i = taille - 1;
            		}

            		// Si on dépasse à droite sa veut dire que on voulait aller au 0 donc on assigne
            		if (j >= taille) {
                		j = 0;
            		}
			//Si la place est occuper on on revient au pos initial mais + 1 pour i.
			if(mat[i][j] != 0){
				i = posI + 1;
				j = posJ;
			}
		}
		return mat;
	}

	public static void afficheM(int[][] m) {
        	int i = 0;
        	while (i < m.length) {
            		int j = 0;
            		while (j < m[i].length) {
                		System.out.printf("%3d ", m[i][j]);
                		j++;
            		}
            		System.out.println();
            		i++;
        	}
    	}

	public static void main(String[] args){
		int	nombre;
		int[][] res;

		nombre = 3;
		res = creeCarreMagique(nombre);

		afficheM(res);

		
	}
}
