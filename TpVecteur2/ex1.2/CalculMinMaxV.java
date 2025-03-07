public class CalculMinMaxV
{
	public static int[] calculMinMaxElemV(int[] v)
	{
		int	i;
		int	min;
		int	max;

		i = 1;
		min = v[0];
		max = v[0];
		while(i < v.length)
		{
			if(v[i] < min)
			{
				min = v[i];
			}
			else if(v[i] > max)
			{
				max = v[i];
			}
			i++;
		}
		
		return new int[] {min, max};
	}
	public static void afficheV(int[] v)
	{
		int	i;

		i = 0;
		while(i < v.length)
		{
			System.out.print(v[i] + " ");
			i++;
		}
	}
	public static void main(String[] args)
	{
		int[] tab;
		int[] res;

		tab = new int[] {1,0,3,123,5};

		res = calculMinMaxElemV(tab);

		afficheV(res);
	}
}
