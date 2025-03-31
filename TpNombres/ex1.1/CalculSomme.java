public class CalculSomme{

	public static int calculSomme(int n){
		int	i;
		int	somme;

		somme = 0;
		i = 0;
		while(i <= n){
			somme = somme + i;
			i++;
		}

		return somme;
	}
	public static void main(String[] args){
		int	nombre;
		int	res;

		nombre = 5;
		res = calculSomme(nombre);

		System.out.println(res);
	}
}
