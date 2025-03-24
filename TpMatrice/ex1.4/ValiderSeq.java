public class ValiderSeq{

	public static boolean validerSeq(int[] v, boolean[][] m){
	
	if(m == null || v == null){
		if (v == null){
			System.out.println("Le vecteur est null");
		}
		else if(m == null){
			System.out.println("La matrice est null");
		}
		else{
			System.out.println("La matrice et le vecteur sont NULL");
		}
		return false;
	}
	
	if(m.length != m[0].length){ //VERIFICATIN MATRICE CARRÉ
		System.out.println("la matrice n'est pas carré");
		return false;
	}
	int	i;

	i = 0;
	while(i < v.length-1 ){
		if(!(m[v[i]][v[i + 1]])){ //LES INDCICES DEVIENNET DES POSITON DE LA MATRICE 
			return false;
		}
		i++;
	}
		return true ;
	}

	public static void main(String[] args){
		boolean[][] m;

		m = new boolean[][] {
            		{true, false, true, true},
            		{false, true, false, true},
            		{true, false, true, false},
            		{true, true, false, false}
        	};

		int[] v;
		int[] v2;

		v =  new int[] {0,0,2,2,0,3}; //true
		v2 = new int[] {0,2,1,1,3}; // false


		boolean resultats;

		resultats = validerSeq(v,m);

		System.out.println(resultats);
	}
}
