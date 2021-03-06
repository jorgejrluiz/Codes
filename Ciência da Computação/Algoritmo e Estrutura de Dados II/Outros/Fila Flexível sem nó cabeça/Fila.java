/**
 * Fila dinamica
 * @author Max do Val Machado
 * @version 2 01/2015
 */
public class Fila {
	private Celula primeiro;
	private Celula ultimo;

	/**
	 * Construtor da classe que cria uma fila sem elementos (somente no cabeca).
	 */
	public Fila() {
		primeiro = null;
		ultimo = null;
	}

	/**
	 * Insere elemento na fila (politica FIFO).
	 * @param x int elemento a inserir.
	 */
	public void inserir(int x) {
		if(primeiro == null) {
			primeiro = new Celula(x);
			ultimo = primeiro;
		} else {
			ultimo.prox = new Celula(x);
			ultimo = ultimo.prox;
		}
	}

	/**
	 * Remove elemento da fila (politica FIFO).
	 * @return Elemento removido.
	 * @trhows Exception Se a fila nao tiver elementos.
	 */
	public int remover() throws Exception {
		int resp;

		if(primeiro == null) {
			throw new Exception("Erro ao remover!");
		}
		else if(primeiro == ultimo) {
			resp = ultimo.elemento;
			primeiro = null;
			ultimo = null;
		} else {
			Celula tmp = primeiro;
			primeiro = primeiro.prox;
			resp = tmp.elemento;
      		tmp.prox = null;
      		tmp = null;
		}
		return resp;
	}

	/**
	 * Mostra os elementos separados por espacos.
	 */
	public void mostrar() {
		System.out.print("[ ");
		
		for(Celula i = primeiro; i != null; i = i.prox) {
			System.out.print(i.elemento + " ");
		}
		
		System.out.println("] ");
	}
}
