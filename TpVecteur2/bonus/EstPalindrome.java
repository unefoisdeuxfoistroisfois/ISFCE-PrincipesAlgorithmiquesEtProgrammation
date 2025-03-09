public class EstPalindrome{

	public static boolean estPalindrome(char[] v){
		int	i;
		int	j;

		i = 0;
		j = v.length - 1;
		while(i < j){
			if(v[i] == v[j]){ //on peut rajouter + 32 et -32 pour les min et maj mais je les prends pas en compte.
				i++;
				j--;
			}else{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		char[] mot;
		boolean	res;

		mot = new char[] {'R','A','D','A','R'};

		res = estPalindrome(mot);

		System.out.println("palindrome ? : " +res);
	}
}
