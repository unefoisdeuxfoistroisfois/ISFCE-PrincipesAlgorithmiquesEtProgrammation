public class CmpBit0Bit1{
	public static int cmpBit0Bit1(int n) {
		
		int nbits1;
		int nbits0;
		
		nbits0 = 0;
		nbits1 = 0;
		while(n != 0) {
			
			if(n % 2 == 1) {
				nbits1++;
			}
			else {
				nbits0++;
			}
			
			n = n / 2;
		}
		
		if (nbits1 > nbits0) {
			return 1;
		}
		else if (nbits0 > nbits1){
			return -1;
		}
		else {
			return 0;
		}
	}
	public static void main(String[] args) {
		int	nombre;
		
		nombre = 9;
		
		System.out.println(cmpBit0Bit1(nombre));
		
	}
}

