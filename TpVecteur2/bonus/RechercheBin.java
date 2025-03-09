public class RechercheBin{
	public static boolean rechercheBin(int[] v, int elem){
		int	debut;
		int	fin;
		int	milieu;

		debut = 0;
		fin = v.length -1;
		milieu = (debut + fin) /2;
		while(debut <= fin){
			
			if(v[milieu] == elem)
			{
				return true;
			}
			else if(v[milieu] > elem)
			{
				fin = milieu -1;
			}else if(v[milieu] < elem)
			{
				debut = milieu + 1;
			}
			
			milieu = (debut + fin)/ 2;
		}
		
		return false;
	}
	public static void main(String[] args){
		int[] tab;
		boolean resultat;
		int elem;

		tab = new int[] {2, 6, 10, 12, 22, 34, 44, 74, 93};

		elem = 45;
		
		resultat = rechercheBin(tab, elem);
		
		System.out.println("le nombre est dans le tab ? : "+resultat);
	}
}
