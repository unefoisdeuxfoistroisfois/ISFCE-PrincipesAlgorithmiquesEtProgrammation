public class Fibo{

	public static int fibo(int n){
		int	i;
		int	a;
		int	b;
		int	fibo;

		i = 2;
		a = 0;
		b = 1;
		fibo = 0;

		if(n == 0){
			return 0;
		}else if(n == 1){
			return 1;
		}

		while(i <= n){
			fibo = a + b;
			a = b;
			b = fibo;
			i++;
		}
		return fibo;
	
	}
	public static void main(String[] args){
		int	nombre;
		int	res;

		nombre = 6;

		res = fibo(nombre);

		System.out.println(res);
	}
}
