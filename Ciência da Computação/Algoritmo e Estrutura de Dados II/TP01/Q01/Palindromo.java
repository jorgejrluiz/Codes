/**
 * TP01Q01 Palíndromo
 * @author Jorge Allan de Castro Oliveira
 * @version 1 02/2017
 * Este algoritmo examina se a palavra continua idêntica caso
 * inverta a posição de todas as letras desta mesma palavra
 */

public class Palindromo {
	/**
  	 * Verifica se as letras da primeira metade corresponde com as da segunda metade
  	 */
	public static boolean isPalindromo(String palavra) { //Palavra chega ao método por parâmetro e retorna valor booleano
		boolean palindromo = true;
		
		for(int i = 0; i < (palavra.length() / 2); i++) { //Laço que percorre as letras da palavra até o meio
			if(palavra.charAt(i) != palavra.charAt(palavra.length() - 1 - i)) { //Condicional que retorna falso caso as letras não sejam idênticas
				palindromo = false;
			}
		}
		return palindromo; //Retorna o valor da variável
	}

	public static Boolean encerramento(String parada) {
        Boolean condicao = false;

        if (parada.charAt(0) == 'F' && parada.charAt(1) == 'I' && parada.charAt(2) == 'M') { //Confere se a entrada é o fim do arquivo
            condicao = true;
        } 
        return condicao; //Caso retorne falso continua a leitura do arquivo
    } 

	public static void main(String[] args) throws Exception {
		int num = 0; //Contador de atribuição dos valores lidos para dentro do array
		String[] entrada = new String[1000]; //Tamanho máximo de elementos que podem lidos da entrada padrão
		
		do {
        	entrada[num] = MyIO.readLine(); //Leitura da entrada padrão
      	} while (encerramento(entrada[num++]) == false); num--; //Loop de leitura que encerra ao ler a palavra FIM

		for (int i = 0; i < num ; i++) { //Laço de repetição que percorre todos os elementos do array
			boolean resultado = isPalindromo(entrada[i]); //Manda a palavra contida no array como parâmentro para o método isPalindromo
			if(resultado) { //Verifica o valor da variável booleana
				MyIO.println("SIM"); //Imprime SIM caso seja verdadeira
			} else {
				MyIO.println("NAO"); //Imprime não caso seja falsa
			}
		}
	}
}