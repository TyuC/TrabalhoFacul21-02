import java.util.Random;

public class Ex4 {

	public static void main(String[] args) {

		int v[] = new int[10];
		vetor (v);
		vetorPrint(v);
		mDist(v);
		}
	
	public static int[] vetor (int v []) {
		Random gerador = new Random();
		int numero;
		for (int i = 0; i < v.length; i++) {
			numero = gerador.nextInt(100) + 1;
            for(int j=0; j<v.length; j++){
                  if(numero == v[j] && j != i){
                        numero = gerador.nextInt(100) + 1;
                  }else{
                       v[i] = numero;
                  }
            }
		}
		return v;
	}
	
	public static void vetorPrint (int v[]) {
		for(int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
			
		}	
	}
	
	public static int[] mDist (int v []) {
		int menor = 0, maior = 0, auxiliar;
		for(int i = 1; i < v.length; i++){
	        if(v[i] > v[maior]) {
	        	maior = i;
	        }
	        if(v[i] < v[menor]) {
	        	menor = i;
	        }
	    }
		if(maior > menor) {
			auxiliar = maior - menor;
			System.out.println("A maior distância é: " + auxiliar);
		}if(menor > maior) {
			auxiliar = menor - maior;
			System.out.println("A maior distância é: " + auxiliar);	
		}
		return v;
	}
}
