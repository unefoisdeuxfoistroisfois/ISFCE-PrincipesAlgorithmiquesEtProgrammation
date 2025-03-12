public class Creematrice{

	public static int[][] creeMatrice(int n, int m){
		int[][] mat;
		int	cpt;
		int	i;
		int	j;

		mat = new int[n][m];

		cpt = 0;
		i = 0;
		while(i < mat.length){
			j = 0;
			while(j < mat[i].length){
				mat[i][j] = cpt;
				cpt++;
				j++;
			}
			i++;
		}
		return mat;
	}
	public static void afficheM(int[][] m){
		int	i;
		int	j;

		i = 0;
		while(i < m.length){
			j = 0;
			while(j < m[i].length){
				System.out.print(m[i][j] + " ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
	public static void main(String[] args){
		int	lignes;
		int	colonnes;
		int[][] res;

		lignes = 5;
		colonnes = 3;

		res = creeMatrice(lignes, colonnes);

		afficheM(res);
	}
}
