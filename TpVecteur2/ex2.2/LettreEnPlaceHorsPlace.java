public class LettreEnPlaceHorsPLace
{
	public static int[] lettreEnPlaceHorsPlace(char[] v1, char[] v2){
		int	i;
		int	j;
		int	place;
		int	horsPlace;

		i = 0;
		j = 0;
		place = 0;
		horsPlace = 0;
		while(i < v1.length && j <v2.length )
		{
			if(v1[i] == v2[j] || v1[i] == v2[j] + 32 || v1[i] == v2[j] - 32) //32 difference entre min et maj dans la table ascii
			{
				place++;
			}else{// pas fin car je dois faire le plus dur qui est de voir si la lettre a été utilise plusieurs fois je ferais sa plus tard mdr ciao
				horsPlace++;
			}
			i++;
			j++;
		}
		return new int[] {place, horsPlace};
	}
	public static void main(String[] args){
		char[] mot;
		char[] mot2;
		int[] res;

		mot = new char[] {'I','S','F','C','E'};
		mot2 = new char[] {'O','E','F','E','I'};

		res = lettreEnPlaceHorsPlace(mot, mot2);

		System.out.println("en place : "+ res[0]+ " et hors place "+res[1]);
	}
}
