public class CalculeSomme{

	public static int calculeSomme(int[][] m, int posLigne, int posColonne, int dirX, int dirY){
		int somme;
		int	i;

		somme = 0;
		i = 0;
		while(i < m.length){ //debut a la position
			somme = somme + m[posLigne][posColonne];
			posLigne = posLigne + dirX; //X pour les lignes
			posColonne = posColonne + dirY; //Y pour les colonnes
			i++;
		}
		return somme;
	}
	public static boolean sommeIdentique(int[][] m){
		int	somme1;
		int	lignes;
		int	colonnes;
		int	i;

		somme1 = calculeSomme(m,0,0,0,1);

		//LIGNES
		lignes = 0;
		while(lignes < m.length){ //boucle pour parcour toute les lignes 
			if(calculeSomme(m,lignes,0,0,1) != somme1){
				return false;
			}
			lignes++;
		}
		
		//COLOLNNES
		colonnes = 0;
		while(colonnes < m[0].length){
			if(calculeSomme(m,0,colonnes,1,0)!= somme1){
				return false;
			}
			colonnes++;
		}

		if(calculeSomme(m,0,0,1,1) != somme1){ // pas de boucle, il y'a que une seul diag (haut gauche -> bas droite)
			return false;
		}

		if(calculeSomme(m,0,m.length -1,1,-1) != somme1){// haut droite -> bas gauche 
			return false;
		}

		return true;

	}
	//AJOUT DE LA FONCITON ESTMAGIQUE A NOTRE CODE PRECEDENT
	public static boolean estMagique(int[][] m){
		if(m.length != m[0].length || m == null){
			return false;
		}
		
		int	i;
		int	j;

		i = 0;
		while(i < m.length){
			j = 0;
			while(j < m[0].length){	
				if(m[i][j] <= 0){
					return false;
				}
				j++;
			}
			i++;
		}

		System.out.println("La matrice est un carré magique, ok pour la suite.");
		return sommeIdentique(m);
	}
	public static void main(String[] args){
		int[][] mat;
		boolean	res;

		mat = new int[][] {
			{2,7,6},
			{9,5,1},
			{4,3,8}
		};

		res = estMagique(mat);
		System.out.println(res);
	}
}
