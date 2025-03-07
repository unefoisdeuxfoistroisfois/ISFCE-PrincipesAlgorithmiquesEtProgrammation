public class CalculMinV
{
	public static int calculMinV(int[] v)
	{
		int	i;
		int	min;

		i = 1;
		min = v[0]; //premiere postion du tab pour le comparer avec i
		while(i < v.length) //parcour jusquá la fin du tab -1
		{
			if(v[i] < min)
			{
				min = v[i];
			}
			i++;
		}
		return min;
	}

	public static void main(String[] args)
	{
		int[] tab;
		int res;

		tab = new int[] {554,4,54435,345,5};

		res = calculMinV(tab);

		System.out.println("Le plus petit nombre du tableau est : "+res);
	}
}
