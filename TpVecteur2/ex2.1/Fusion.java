public class Fusion
{
	public static void fusion(int[] l1,int[] l2)
	{
		int[] l3;
		int	i;
		int	j;
		int	k;
		int	m;
		int	n;
		int	temp;

		l3 = new int[l1.length + l2.length];

		i = 0;
		k = 0;
		while(i < l1.length){
			l3[k] = l1[i];
			k++;
			i++;
		}
		j = 0;
		while(j < l2.length){
			l3[k] =  l2[j];
			k++;
			j++;
		}
		m = 0;
		while(m < l3.length){
			n = m +1;
			while(n < l3.length){
				if(l3[m] > l3[n]){
					temp = l3[m];
					l3[m] = l3[n];
					l3[n] = temp;
				}
				n++;
			}
			m++;
		}
		afficheV(l3);
	}
	
	public static void afficheV(int[] v){
		int	i;

		i = 0;
		System.out.print("[");
		while(i < v.length){
			System.out.print(v[i]);
			if(i != v.length -1){
				System.out.print(",");
			}
			i++;
		}
		System.out.println("]");
	}

	public static void main(String[] args)
	{
		int[] tab;
		int[] tab2;
		
		tab = new int[] {1,2,3,4};
		tab2 = new int[] {5,6,7,8};

		fusion(tab, tab2);
	}
}
