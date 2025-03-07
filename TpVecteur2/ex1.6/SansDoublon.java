public class SansDoublon
{
	public static boolean sansDoublon(int[] v)
	{
		int	i;
		int	j;

		i = 0;
		while(i < v.length)
		{
			j = i+1;
			while(j < v.length)
			{
				if(v[i] == v[j])
				{
					return false;
				}
				j++;
			}
			i++;
		}

		return true;
	}
	public static void main(String[] args)
	{
		int[] tab;
		boolean res;

		tab = new int[] {1,2,7,3};

		res = sansDoublon(tab);

		System.out.println(res);		
	}
}
