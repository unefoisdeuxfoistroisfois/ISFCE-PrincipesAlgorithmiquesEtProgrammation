public class Affiche{

	public static void afficheM(int[][] m){
		int	i;
		int	j;

		i = 0;
		while(i < m.length){ //lignes
			
			j = 0;
			while(j < m[i].length){ //colonnes
				System.out.print(m[i][j]+ " ");
				j++;
			}
			i++;
			System.out.println();
		}
	}

	public static void main(String[] args){

		int[][] matrice;

		matrice = new int[][] {
			{1,2,3},
			{6,5,4},
			{7,8,9}
		};

		afficheM(matrice);
	}
}
