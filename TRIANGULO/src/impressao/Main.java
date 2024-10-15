package impressao; // Criação do Pacote Impressão
import utilidades.FuncoesUteis; // Importação da Classe Funções Úteis no Pacote Utilidades

	public class Main {
		public static void main (String args[]) {
			
			// Trecho em que será exibido o Resultado da Soma
			System.out.println("- SOMA - ");
				// Insere os dois valores da Soma
				int resultadoSoma = FuncoesUteis.soma(2,2);	
				// Exibe o Resultado da Soma
				FuncoesUteis.printArquivoSoma(resultadoSoma);
			
			// Trecho em que será exibido o Triângulo
			System.out.println("\n- TRIÂNGULO - ");
				System.out.println("Triângulo:");
				// Exibe o Triângulo com o valor especificado de 5 linhas/5 "x"
		        FuncoesUteis.printArquivoTriangulo(5);
		}
	}
	
