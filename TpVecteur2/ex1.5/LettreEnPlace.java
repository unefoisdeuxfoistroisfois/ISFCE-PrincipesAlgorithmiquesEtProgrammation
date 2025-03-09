public class LettreEnPlace
{
	public static int lettreEnPlace(char[] v1, char[] v2)
	{
		int	i;
		int	j;
		int	cpt;

		i = 0;
		j = 0;
		cpt = 0;
		while(i < v1.length && j <v2.length )
		{
			if(v1[i] == v2[j] || v1[i] == v2[j] + 32 || v1[i] == v2[j] - 32) //32 difference entre min et maj dans la table ascii
			{
				cpt++;
			}
			i++;
			j++;
		}
		return cpt;
	}

	public static void main(String[] args)
	{
		char[] mot;
		char[] mot2;
		int res;

		mot = new char[] {'I','S','F','C','E'};
		mot2 = new char[] {'O','s','F','E','M'};

		res = lettreEnPlace(mot, mot2);

		System.out.println(res);
	}
}
