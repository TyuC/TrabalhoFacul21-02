import java.util.Random;

public class Ex1 {

	public static void main(String[] args) {
		int v[] = new int[3];
		vetor (v);
		System.out.println(crescenteD(v));
		
	}

	public static int[] vetor (int v []) {
		Random gerador = new Random();
		for (int i = 0; i < v.length; i++) {
			v[i] = gerador.nextInt(11);
            System.out.println(v[i]);
		}
		return v;
	}
	
	public static boolean crescenteD (int v[]) {
		boolean crescenteD = false;
		if (v[0] < v[1] && v[1] < v[2]) {
			crescenteD = true;
		}
		return crescenteD;
	}
}
