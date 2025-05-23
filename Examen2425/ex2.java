public class ex2
{
	public static boolean findCode(int n, int code)
	{
		int	i;
		int	masque;
		int	extrait;

		i = 0;
		masque = 31;
		while (i != 32)
		{
			extrait = (n & masque);
			if (extrait == code)
			{
				return true;
			}
			n = n >>> 1;
			i++;
		}
		return false;
	}

	public static void main(String[] args)
	{
		boolean	res;

		int n = 0b011011011111;
        	int code = 0b11011;
		res = findCode(n, code);

		System.out.println(res);
	}
}
