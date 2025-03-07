public class CalculNbBosses
{
	public static int calculNbBosses(int[] v)
	{
		int	i;
		int	cpt;

		i = 1; //a 1 car si on commence a 0 on aura un arrayindex a cause du i - 1.
		cpt = 0;
		while(i < v.length -1)
		{
			if(v[i - 1] < v[i] && v[i] > v[i + 1])
			{
					cpt++;
			}
			i++;
		}
		return cpt;
	}
	public static void main(String[] args)
	{
		int[] tab;
		int	res;

		//tab = new int[] {1,1,2,-1,5};
		tab = new int[]	{1,2,1,2,1,2,0};
		res = calculNbBosses(tab);
		
		System.out.println("le tableau contient "+res+" des bosses");

	}
}
