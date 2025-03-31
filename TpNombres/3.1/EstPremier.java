public class EstPremier{

	public static boolean estPremier(int n){
		int	i;

		if(n <= 1){
			return false;
		}

		i = 2;
		while((i * i) <= n){
			if(n % i == 0){ //Si il est divisible par par autre chose sa veut dire que il est pas premier
				return false;
			}
			else{
				i++;
			}
		}
		return true;
	}

	public static void main(String[] args){
		int	nombre;
		boolean	res;
	
		nombre = 11;
		res = estPremier(nombre);

		System.out.println(nombre+" est il premier ? "+res);
	}
}
