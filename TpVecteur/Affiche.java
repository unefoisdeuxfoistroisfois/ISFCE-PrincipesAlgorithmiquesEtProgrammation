public class Affiche
{
	public static void affiche(int[] v)
	{
		int i;

		i = 0;
		while(i < v.length)
		{
			System.out.print(v[i]);
			if(i < v.length -1)
			{
				System.out.print(" ");
			}
			i++;
		}
	}

	public static void main(String[] args)
	{
		int[] tableau;

		tableau = new int[] {1,2,3,42,452,8};

		affiche(tableau);
	}

}
