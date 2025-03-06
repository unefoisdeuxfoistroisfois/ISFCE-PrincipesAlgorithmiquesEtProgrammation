public class Clone
{
	public static int[] clone(int[] v)
	{
		int	i;
		int[] clone;

		clone = new int[v.length];

		i = 0;
		while(i < v.length)
		{
			clone[i] =  v[i];
			i++;
		}
		
		return clone;
	}
	public static void main(String[] args)
	{
		int[] tab;
		int[] res;

		tab = new int[] {992,232,53453,35534};

		res = clone(tab);

		int	i;
		
		i = 0;
		while(i < res.length)
		{
			System.out.print(res[i] + " ");
			i++;
		}

	}
}
