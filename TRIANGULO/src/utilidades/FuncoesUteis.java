package utilidades; // Criação do Pacote Utilidades

// Criação da Classe Funções Úteis
public class FuncoesUteis {
	
		// Método de Soma, quie somando os dois números trará o Resultado
		public static int soma(int n1, int n2){
			return n1+n2; // Retorna o Resultado
		}
		
		// Método que exibirá o Resultado da soma
		public static void printArquivoSoma(int numfinal) {
			System.out.println("O Resultado da Soma é: "+numfinal);
		}
		
		// Método que fará a pirâmide e exibirá a mesma
		public static void printArquivoTriangulo(int altura){
			// As linhas serão preenchidas enquanto não chegarem na altura especificada
		for (int i = 1; i <= altura; i++) {
			
			// Imprime o "x" para cada linha
            for (int j = 1; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println(); // Move para a próxima linha após imprimir cada linha do triângulo
        }
	}
}
	





