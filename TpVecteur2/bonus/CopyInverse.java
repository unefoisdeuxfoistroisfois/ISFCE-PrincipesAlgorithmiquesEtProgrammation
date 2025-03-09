public class CopyInverse{
	
	public static char[] copyInverse(char[] v){
		char[] clone;
		int	i;
		int	j;
		
		clone = new char[v.length];
		i = 0;
		j = v.length -1;
		while(i < v.length){
			clone[j] = v[i];
			j--;
			i++;
		}

		return clone;
	}
	public static void afficheV(char[] v){
		int	i;

		i = 0;
		while(i < v.length){
			System.out.print(v[i]);
			i++;
		}
	}
	public static void main(String[] args){
		char[] mot;
		char[] res;

		mot = new char[] {'B','r','a','d','l','e','y'};

		res = copyInverse(mot);
		afficheV(res);
	}

