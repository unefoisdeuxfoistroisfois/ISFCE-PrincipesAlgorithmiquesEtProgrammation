public class RechercheMin{

	public static int rechercheMin(int[][] m){
		int	i;
		int	j;
		int	min = m[0][0];

		i = 0;
		while(i < m.length){
			j = 0;
			while(j < m[i].length){
				if(m[i][j] < min){
					min = m[i][j];
				}
				j++;
			}
			i++;
		}
		return min;
	}
	public static void main(String[] args){
		int[][] mat;
		int res;

		mat = new int[][] {
			{23,42,11},
			{3,86,32},
			{1,643,33}
		};

		res = rechercheMin(mat);

		System.out.println(res);
	}
}
