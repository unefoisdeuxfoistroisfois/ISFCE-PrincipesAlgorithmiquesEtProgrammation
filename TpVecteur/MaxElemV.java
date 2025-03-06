public class MaxElemV{

	public static int maxElemV(int[] v)
	{
		int	i;
		int	res;
		int	temp;

		i = 0;
		res = 0;
		while(i < v.length)
		{
			if(v[i] > res)
			{
				res = v[i];
			}
			i++;
		}
		return res;
	}

	public static void main(String[] args)
	{
		
		int[] tab;
		int resu;

		tab = new int[] {1,2,87,4,5};

		resu = maxElemV(tab);

		System.out.println(resu);	
	}
}
