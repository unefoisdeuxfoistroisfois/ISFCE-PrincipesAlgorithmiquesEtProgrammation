public class MinMaxElemV
{
	public static int minMaxElemV(int[] v, boolean max)
	{
		int	i;
		int	res;

		res = 1;
		if(max)
		{
			i = 0;
			while(i < v.length)
			{
				if(v[i] > res)
				{
					res = v[i];
				}
				i++;
			}
		}
		else
		{
			i = 0;
			while(i < v.length)
			{
				if(v[i] < res)
				{
					res = v[i];
				}
				i++;
			}
		
		}

		return res;
	}

	public static void main(String[] args)
	{
		int[] tab;
		int res;

		tab = new int[] {1,0,3,123,5};

		res = minMaxElemV(tab, true );

		System.out.println(res);
	}
}
