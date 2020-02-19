import java.util.Random;

public class Ex2 {

	public static void main(String[] args) {
		
		int v[] = new int[3];
		vetor (v);
		invVet(v);
		System.out.println("Vetor invertido: ");
		for(int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}
	}
	
	public static int[] vetor (int v []) {
		Random gerador = new Random();
		for (int i = 0; i < v.length; i++) {
			v[i] = gerador.nextInt(11);
            System.out.println(v[i]);
		}
		return v;
	}
	public static int[] invVet (int v[]) {
        int trocaTroca;		
		for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < i; j++) {
            	trocaTroca = v[i];
                v[i] = v[j];
                v[j] = trocaTroca;
            }
        }
		return v;
	}
}
