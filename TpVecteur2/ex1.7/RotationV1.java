public class RotationV1
{
	public static void rotationV1(int[] v, boolean droite)
	{
		int	i;
		int	temp;
		if(droite)
		{
			temp = v[v.length - 1];
			i = v.length -1;
			while(i > 0)
			{
				v[i] = v[i -1];
				i--;
			}
		
			v[0] = temp;
		}
		else
		{
			temp = v[0];
			i = 0;
			while(i < v.length -1)
			{
				v[i]= v[i +1];
				i++;
			}
			v[v.length - 1] =  temp;
		}
	}
	
	public static void afficheV(int[] v)
	{
		int	i;

		i = 0;
		while(i < v.length)
		{
			System.out.print(v[i]);
			i++;
		}
	}
	public static void main(String[] args)
	{
		int[] tab;

		tab = new int[] {1,7,2,3};

		//ROTATION DROITE
		//rotationV1(tab,true);
		//afficheV(tab);

		//ROTATION GAUCHE
		rotationV1(tab,false);
		afficheV(tab);
	}
}
