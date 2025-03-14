public class ProduitMat{

	public static int[][] produitMat(int[][] m1, int[][] m2){
		int	n;
		int	m;
		int	i;
		int	j;
		int	l;
		int	k;

		n = m1.length;
		m = m2[0].length;
		k = m2.length;

		int[][] m3;
		
		m3 = new int[n][m];

		i = 0;
		while(i < n){ // < m1.length
			j = 0;
			while(j < m){ // < m2[0].length(colonne de la premiere ligne qui est 0) on aurait aussi pour mettre m2[1] ou meme [2] si elle on la meme nombre de colonne.
				l = 0;
				while(l < k){ // < m2.length
					m3[i][j] = m3[i][j] + (m1[i][l] * m2[l][j]);
					l++;
				}
				j++;
			}
			i++;
		}
		return m3;
	}

	public static void afficheMat(int[][] m){

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

		int[][] mat;
		int[][] mat2;

		mat = new int[][] {
			{1,2},
			{5,3},
			{-1,4}
		};

		mat2 = new int[][] {
			{5,2},
			{3,4},
		};

		afficheMat(produitMat(mat, mat2));
	}
}
