public class Convolution2{
	
	public static int[][] convolution(int[][] m){
		int	i;
		int	j;
		int[][] newMat;
		int	max;
		int	x;
		int	y;

		newMat = new int[m.length / 2][m.length / 2];
	
		i = 0;
		while(i  < m.length / 2){
			j = 0;
			while(j < m[0].length /2){
				max = m[i * 2][j * 2];

				x = 0;
				while(x < 2){
					y = 0;
					while(y < 2){
						if(m[i * 2 + x][j * 2 + y] > max){
							max = m[i * 2 + x][j * 2 + y];
						}
						y++;
					}
					x++;
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
