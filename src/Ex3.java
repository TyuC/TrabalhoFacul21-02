import java.util.Random;

public class Ex3 {

	public static void main(String[] args) {
		
		int v[] = new int[3];
		vetor (v);
		maiorMenor (v);
		vetorPrint(v);
		}
	
	public static int[] vetor (int v []) {
		Random gerador = new Random();
		for (int i = 0; i < v.length; i++) {
			v[i] = gerador.nextInt(11);
            System.out.println(v[i]);
		}
		return v;
	}
	public static void vetorPrint (int v[]) {
		for(int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
			
		}	
	}
	
	public static int[] maiorMenor (int v[]) {
		int maior = 0, menor = 0, auxiliar;
	    for(int i = 1; i < v.length; i++){
	        if(v[i] > v[maior]) {
	        	maior = i;
	        }
	        if(v[i] < v[menor]) {
	        	menor = i;
	        }
	    }
	    auxiliar = v[maior];
	    v[maior] = v[menor];
	    v[menor] = auxiliar;
		return v;
	}

}
