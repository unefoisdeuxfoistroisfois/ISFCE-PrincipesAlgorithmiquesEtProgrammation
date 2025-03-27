public class SommeVD {
	public static int[] sommeVD(int[] v1, int[] v2, int d) {
		int somme;
		int[] v3;
		
		somme = 0;
		v3 = new int[v1.length + v2.length -d -1];
		
		int i;
		int j;
		int	k;
		
		i = 0;
		while(i < v1.length) {
			v3[i] = v1[i];
			i++;
		}
		
		j = d;
		k = 0;
		while(k < v2.length) {
			v3[j]= v3[j] + v2[k];
			j++;
			k++;
		}
		return v3;
	}
	public static void main(String[] args) {
		int[] tab;
		int[] tab2;
		int decal;
		int[] res;
		
		tab = new int[] {1,8,5,6,8};
		tab2 = new int[] {4,2,6,7};
		decal = 2;
		
		
		res = sommeVD(tab,tab2,decal);
		
		int	i;
		
		i = 0;
		while(i < res.length) {
			System.out.print(res[i]+" ");
			i++;
		}
		System.out.println(res);
	}
}

