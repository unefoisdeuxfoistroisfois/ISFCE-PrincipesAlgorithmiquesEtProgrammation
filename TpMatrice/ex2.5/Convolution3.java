public class Convolution2{
	
	public static int[][] convolution(int[][] m){
		int	i;
		int	j;
		int[][] newMat;
		int	max;
		int	hautDroite;
		int	basGauche;
		int	basDroite;

		newMat = new int[m.length / 2][m.length / 2];
	
		i = 0;
		while(i  < newMat.length){
			j = 0;
			while(j < newMat[0].length){
				max = m[i * 2][j * 2];
				hautDroite = m[i * 2][j * 2 + 1];
				basGauche = m[i * 2 + 1][j * 2];
				basDroite = m[i * 2 + 1][j * 2 + 1];

				if(hautDroite > max){
					max = hautDroite;
				}
				if(basGauche > max){
					max = basGauche;
				}
				if(basDroite > max){
					max = basDroite;
				}

				newMat[i][j] = max;
				j++;
			}
			i++;
		}
		return newMat;
	}
	public static void afficheM(int[][] m){
		int	i;
		int	j;
	
		i = 0;
		while(i < m.length){
			j = 0;
			while(j < m[0].length){
				System.out.print(m[i][j] + " ");
				j++;
			}
			System.out.println(" ");
			i++;
		}
	}	
	
	public static void main(String[] args){
		int[][] mat;
		int[][] res;

		mat = new int[][] {
			{12,20,30,0},
			{8,12,2,0},
			{34,70,37,4},
			{112,100,25,12}
		};
		
		System.out.println("La matrice orginal");
		afficheM(mat);

		res = convolution(mat);
		
		System.out.println("La matrice avec les valeur max");
		afficheM(res);
	}
}
