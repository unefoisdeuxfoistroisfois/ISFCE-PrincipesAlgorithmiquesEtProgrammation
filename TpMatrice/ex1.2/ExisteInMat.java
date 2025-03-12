public class ExisteInMat{
	public static boolean existeInMat(int[][] m, int valeur){
		int	i;
		int	j;

		i = 0;
		while(i < m.length){
			j = 0;
			while(j < m[i].length){
				if(m[i][j] == valeur){
					return true;
				}
				j++;
			}
			i++;
		}
		return false;
	}
	public static void main(String[] args){
		int[][] mat;
		int	nombre;
		boolean	resultats;

		mat = new int[][] {
			{1,2,3},
			{44,32,132},
			{1233,43,56}
		};
		nombre = 45;

		resultats = existeInMat(mat,nombre);
		
		System.out.println("la valeur existe elle ? : "+resultats);
	}
}
