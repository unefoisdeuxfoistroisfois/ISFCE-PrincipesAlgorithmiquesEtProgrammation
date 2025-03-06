public class NbElemV
{

	public static int nbElemV(int[] v, int elem)
	{
		int	i;
		int	cpt;

		i = 0;
		cpt = 0;
		while(i < v.length)
		{
			if(elem == v[i])
			{
				cpt ++;	
			}
			i++;
		}
		
		return cpt;
	}
	public static void main(String[] args)
	{
		int[] tab;
		int	resul;
		int	recherche;

		recherche = 98;

		tab = new int[] {1,2,333,444,324,22,3,333,6645};

		resul = nbElemV(tab, recherche);

		if(resul == 0)
		{
			System.out.println("il apparait pas dans le tableau");
		}
		else
		{
			System.out.println("il apprait "+resul+ " fois dans le tableau");
		}
	}
}
