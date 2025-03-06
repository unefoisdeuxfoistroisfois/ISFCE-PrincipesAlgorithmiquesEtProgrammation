public class SommeV
{
	public static int sommeV(int[] v)
	{
		int res;
		int i;

		res = 0;
		i = 0;
		while(i < v.length)
		{
			res = res + v[i];
			i++;
		}
	
		return res;
	}
	
	public static void main(String[] args)
	{
		int[] tab;
		int resul;

		tab = new int[] {2,2,2,78};

		resul = sommeV(tab);

		System.out.println(resul);
	}
}	
