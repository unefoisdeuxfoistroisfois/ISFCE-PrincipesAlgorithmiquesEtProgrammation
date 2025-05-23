public class ex1
{
	public static int ft_compress (int[] v)
	{
		int	i;
		int	j;
		int	k;

		i = 0;
		j = 0; 
		while (i < v.length)
		{
			if (v[i] != 0)
			{
				v[j] = v[i];
				j++;
			}
			i++;
		}

		k = j;
		while(k < v.length)
		{
			v[k] = 0;
			k++;
		}
		return v.length - j;
	}

	public static void main (String[] args)
	{
		int[]	vect;
		int	res;

		vect = new int[] {0,6,6,0,0,4,0,8,8,8,0,0,3,2,0};

		res = ft_compress(vect);
		System.out.println(res);
		int	i;
		
		i = 0;
		while (i != vect.length)
		{
			System.out.print(vect[i]);
			i++;
		}
	}
}
