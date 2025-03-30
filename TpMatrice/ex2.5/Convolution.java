public class Convultion{
	
	public static int[][] convultion(int[][] m){
		int	a;
		int	b;
		int	i;
		int	j;
		int[][] newMat;
		int	max;

		newMat = new int[m.length / 2][m.length / 2];
	
		i = 0;
		while(i  < m.length / 2){
			j = 0;
			while(j < m[0].length /2){
				
				a = i * 2;
				b = j * 2;

				max = m[a][b];

				if (m[a][b+1] > max){ 
                			max = m[a][b+1];
				}
            			if (m[a+1][b] > max){
                			max = m[a+1][b];
				}
            			if (m[a+1][b+1] > max){
                			max = m[a+1][b+1];
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

		res = convultion(mat);
		
		System.out.println("La matrice avec les valeur max");
		afficheM(res);
	}
}
