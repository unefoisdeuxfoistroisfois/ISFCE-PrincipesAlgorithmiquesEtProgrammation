public class AvgElemV
{
	public static int avgElemV(int[] v)
	{
		int moyenne;
		int resultat;
		int	i;

		i = 0;
		resultat = 0;
		moyenne = 0;
		while(i < v.length)
		{
			moyenne = moyenne + v[i];
			i++;
		}

		resultat = moyenne / i;

		return resultat;
	}

	public static void main(String[] args)
	{
		int[] tab;
		int	resul;

		tab = new int[] {1,2,3,4,5,6,87};

		resul = avgElemV(tab);
		
		System.out.println("la moyenne est de : "+ resul);
	}
}
