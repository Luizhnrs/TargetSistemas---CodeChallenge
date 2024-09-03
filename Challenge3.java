/* 3) Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; 
enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } 
imprimir(SOMA); 

Ao final do processamento, qual será o valor da variável SOMA?
*/

public class Challenge3 {
  public static void main(String[] args) {
        int IDX = 12;
        int SUM = 0;
        int K = 1;

        while (K < IDX) {
            K = K + 1;
            SUM = SUM + K;
        }
        System.out.println("The final value of SUM is: " + SUM); // 77 is the value || 77 é o valor
  }
}
