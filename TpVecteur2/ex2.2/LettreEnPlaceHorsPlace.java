public class LettreEnPlaceHorsPLace
{
	public static int[] lettreEnPlaceHorsPlace(char[] v1, char[] v2){
		int	i;
		int	j;
		int	place;
		int	horsPlace;
		boolean	trouve;

		i = 0;
		place = 0;
		horsPlace = 0;

		boolean[] usedV1;
		boolean[] usedV2;

		usedV1 = new boolean[v1.length];
		usedV2 = new boolean[v1.length]; 
		//BONNE PLACE
		while(i < v1.length)
		{
			if(v1[i] == v2[i] || v1[i] == v2[i] + 32 || v1[i] == v2[i] - 32) //32 difference entre min et maj dans la table ascii
			{
				place++;
				usedV1[i] = true;
				usedV2[i] = true;
				
			}
			i++;
		}

		i = 0;
		//MAUVAISE PLACE
		while(i < v1.length){
			if(usedV2[i] != true){
				j = 0;
				trouve = false;
				while(j < v1.length && trouve != true){
					if(usedV1[j] != true && v1[j] == v2[i] || v1[j] == v2[i] + 32 || v1[j] == v2[i] - 32){
						horsPlace++;
						usedV1[j] = true;
						trouve = true;
					}
					j++;
				}
			}
			i++;
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
