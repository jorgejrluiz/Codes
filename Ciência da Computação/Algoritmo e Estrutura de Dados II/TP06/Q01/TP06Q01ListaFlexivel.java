/**
 * TP06Q01 - Lista Flexível
 * @author Jorge Allan de Castro Oliveira
 * @version 1 04/2017
 */

class Municipio {
  private int id;
  private String nome;
  private String uf;
  private int codigoUf;
  private int populacao;
  private int numeroFuncionarios;
  private int numeroComissados;
  private String escolaridade;
  private String estagio;
  private int atualizacaoPlano;
  private String regiao;
  private int atualizacaoCadastro;
  private Boolean consorcio;

  	/**
     * Construtor da classe.
     */
  	public Municipio() {
  		setId(0);
  		setNome("");
  		setUf("");
  		setCodigoUf(0);
  		setPopulacao(0);
  		setNumeroFuncionarios(0);
  		setNumeroComissados(0);
  		setEscolaridade("");	
  		setEstagio("");
  		setAtualizacaoPlano(0);
  		setRegiao("");
  		setAtualizacaoCadastro(0);
  		setConsorcio(false);
  	}

  	/**
   	 * Construtor da classe.
     * @param id Número do município
     * @param nome Nome do município
     * @param uf Estado do município
     * @param codigoUf Código do estado do município
     * @param populacao Número de habitantes do município
     * @param numeroFuncionarios Total de funcionários ativos da administração direta
     * @param numeroComissados Total de funcionários ativos da administração direta - Somente comissionados
     * @param escolaridade Escolaridade do gestor
     * @param estagio Processo de elaboração da agenda
     * @param atualizacaoPlano Ano da última atualização do plano diretor
     * @param regiao Agrupamento onde se encontra o município
     * @param atualizacaoCadastro Ano da última atualização completa do cadastro
     * @param consorcio Se o município faz parte de consórcio público na área de Educação Intermunicipal
     */
  	public Municipio(int id, String nome, String uf, int codigoUf, int populacao, int numeroFuncionarios, int numeroComissados, String escolaridade, String estagio, int atualizacaoPlano, String regiao, int atualizacaoCadastro, boolean consorcio) {
  		setId(id);
  		setNome(nome);
  		setUf(uf);
  		setCodigoUf(codigoUf);
  		setPopulacao(populacao);
  		setNumeroFuncionarios(numeroFuncionarios);
  		setNumeroComissados(numeroComissados);
  		setEscolaridade(escolaridade);	
  		setEstagio(estagio);
  		setAtualizacaoPlano(atualizacaoPlano);
  		setRegiao(regiao);
  		setAtualizacaoCadastro(atualizacaoCadastro);
  		setConsorcio(consorcio);
  	}

  	//Métodos Set

  	/**
     * Define valor à variável id.
     */
  	public void setId(int id) {
  		this.id = id;
  	}

  	/**
     * Define valor à variável nome.
     */
  	public void setNome(String nome){
  		this.nome = nome;
  	}

  	/**
     * Define valor à variável uf.
     */
  	public void setUf(String uf) {
  		this.uf = uf;
  	}

  	/**
     * Define valor à variável codigoUf.
     */
  	public void setCodigoUf(int codigoUf) {
  		this.codigoUf = codigoUf;
  	}

  	/**
     * Define valor à variável populacao.
     */
  	public void setPopulacao(int populacao) {
  		this.populacao = populacao;
  	}

  	/**
     * Define valor à variável numeroFuncionarios.
     */
  	public void setNumeroFuncionarios(int numeroFuncionarios) {
  		this.numeroFuncionarios = numeroFuncionarios;
  	}

  	/**
     * Define valor à variável numeroComissados.
     */
    public void setNumeroComissados(int numeroComissados) {
    	 this.numeroComissados = numeroComissados;
    }

    /**
     * Define valor à variável escolaridade.
     */
    public void setEscolaridade(String escolaridade) {
    	this.escolaridade = escolaridade;
    }

    /**
     * Define valor à variável estagio.
     */
    public void setEstagio(String estagio) {
    	this.estagio = estagio;
    }

    /**
     * Define valor à variável atualizacaoPlano.
     */
    public void setAtualizacaoPlano(int atualizacaoPlano) {
    	this.atualizacaoPlano = atualizacaoPlano;
    }

    /**
     * Define valor à variável regiao.
     */
    public void setRegiao(String regiao) {
    	this.regiao = regiao;
    }

    /**
     * Define valor à variável atualizacaoCadastro.
     */
    public void setAtualizacaoCadastro(int atualizacaoCadastro) {
    	this.atualizacaoCadastro = atualizacaoCadastro;
    }

    /**
     * Define valor à variável consorcio.
     */
    public void setConsorcio(Boolean consorcio) {
    	this.consorcio = consorcio;
    }

    //Métodos Get

    /**
     * Retorna valor da variável id.
     */
  	public int getId() {
  		return this.id;
  	}

  	/**
     * Retorna valor da variável nome.
     */
  	public String getNome() {
  		return this.nome;
  	}

  	/**
     * Retorna valor da variável uf.
     */
  	public String getUf() {
  		return this.uf;
  	}

  	/**
     * Retorna valor da variável codigoUf.
     */
  	public int getCodigoUf() {
  		return this.codigoUf;
  	}

  	/**
     * Retorna valor da variável populacao.
     */
  	public int getPopulacao() {
  		return this.populacao;
  	}

  	/**
     * Retorna valor da variável numeroFuncionarios.
     */
  	public int getNumeroFuncionarios() {
  		return this.numeroFuncionarios;
  	}

  	/**
     * Retorna valor da variável numeroComissados.
     */
  	public int getNumeroComissados() {
  		return this.numeroComissados;
  	}

  	/**
     * Retorna valor da variável escolaridade.
     */
  	public String getEscolaridade() {
  		return this.escolaridade;
  	}

  	/**
     * Retorna valor da variável estagio.
     */
  	public String getEstagio() {
  		return this.estagio;
  	}

  	/**
     * Retorna valor da variável atualizacaoPlano.
     */
  	public int getAtualizacaoPlano() {
  		return this.atualizacaoPlano;
  	}

  	/**
     * Retorna valor da variável regiao.
     */
  	public String getRegiao() {
  		return this.regiao;
  	}

  	/**
     * Retorna valor da variável atualizacaoCadastro.
     */
  	public int getAtualizacaocadastro() {
  		return this.atualizacaoCadastro;
  	}

  	/**
     * Retorna valor da variável consorcio.
     */
  	public Boolean getConsorcio() {
  		return this.consorcio;
  	}

  	/**
     * Copia as variáveis da classe
     */
  	public Municipio clone() {
  		Municipio resp = new Municipio();

  		resp.id = this.id;
  		resp.nome = this.nome;
  		resp.uf = this.uf;
  		resp.codigoUf = this.codigoUf;
  		resp.populacao = this.populacao;
  		resp.numeroFuncionarios = this.numeroFuncionarios;
  		resp.numeroComissados = this.numeroComissados;
  		resp.escolaridade = this.escolaridade;
  		resp.estagio = this.estagio;
  		resp.atualizacaoPlano = this.atualizacaoPlano;
  		resp.regiao = this.regiao;
  		resp.atualizacaoCadastro = this.atualizacaoCadastro;
  		resp.consorcio = this.consorcio;

  		return resp;
  	}

  	/**
   	 * Imprime o contéudo as variáveis
     */
  	public void imprimir() {
           MyIO.println(this.id + " " + 
                        this.nome + " " + 
                        this.uf + " " +
                        this.codigoUf + " " +
                        this.populacao + " " +
                        this.numeroFuncionarios + " " +
                        this.numeroComissados + " " +
                        this.escolaridade + " " +
                        this.estagio + " " +
                        this.atualizacaoPlano + " " +
                        this.regiao + " " +
                        this.atualizacaoCadastro + " " +
                        this.consorcio + 
                        "");
    }

    /**
   	 * Abre o conteúdo dos arquivos e os armazena em um vetor
     */
	  public void ler(String entrada, int cont) {
        //Abrir o arquivo para leitura e definir atributo id, nome, uf, codigoUf, populacao (A1, A200, A201, A202, A204 - Variáveis externas)
  		  Arq.openRead("/tmp/variaveisexternas.txt", "ISO-8859-1");
  		  String i;

      	for(i = Arq.readLine(); cont < Integer.parseInt(entrada); cont++, i = Arq.readLine()); cont = 0;
      	String array[] = i.split("\t");
        
      	this.id = new Integer(array[0]).intValue();
        this.nome = array[4];
        this.uf = array[3];
        this.codigoUf = new Integer(array[2]).intValue();
        this.populacao = new Integer(array[6]).intValue();
      	this.regiao = array[1];

  		//Abrir o arquivo para leitura e definir atributo numeroFuncionarios, numeroComissados (A2, A5 - Recursos humanos)
  		Arq.openRead("/tmp/recursoshumanos.txt", "ISO-8859-1");

      	for(i = Arq.readLine(); cont < Integer.parseInt(entrada); cont++, i = Arq.readLine()); cont = 0;
      	array = i.split("\t");

      	this.numeroFuncionarios = new Integer(array[4]).intValue();
      	this.numeroComissados = new Integer(array[7]).intValue();
   
      //Abrir o arquivo para leitura e definir atributo escolaridade, atualizacaoPlano (A16, A19 - Planejamento urbano)
  		Arq.openRead("/tmp/planejamentourbano.txt", "ISO-8859-1");

      	for(i = Arq.readLine(); cont < Integer.parseInt(entrada); cont++, i = Arq.readLine()); cont = 0;
      	array = i.split("\t");

      	this.escolaridade = array[5];

      	if(array[8].equals("Não foi atualizado") || array[8].equals("-")) {
        	this.atualizacaoPlano = 0;
      	} else {
        	this.atualizacaoPlano = new Integer(array[8]).intValue();
      	}

      //Abrir o arquivo para leitura e definir atributo estagio (A143 - Gestão ambiental)
  		Arq.openRead("/tmp/gestaoambiental.txt", "ISO-8859-1");

      	for(i = Arq.readLine(); cont < Integer.parseInt(entrada); cont++, i = Arq.readLine()); cont = 0;
      	array = i.split("\t");

      	this.estagio = array[7];

      //Abrir o arquivo para leitura e definir atributo atualizacaoCadastro (A63 - Recursos gestão)
  		Arq.openRead("/tmp/recursosparagestao.txt", "ISO-8859-1");

      	for(i = Arq.readLine(); cont < Integer.parseInt(entrada); cont++, i = Arq.readLine()); cont = 0;
      	array = i.split("\t");

      	if(array[6].equals("Não soube informar*") || array[6].equals("-")) {
        	this.atualizacaoCadastro = 0;
      	} else {
        	this.atualizacaoCadastro = new Integer(array[6]).intValue();
      	}
     
      //Abrir o arquivo para leitura e definir atributo consorcio (A152 - Articulação Interinstitucional)
  		Arq.openRead("/tmp/articulacaoointerinstitucional.txt", "ISO-8859-1");

      	for(i = Arq.readLine(); cont < Integer.parseInt(entrada); cont++, i = Arq.readLine());
      	array = i.split("\t");

      	String resultado = array[5];
      	
      	if(resultado.equals("Sim")) {
      		this.consorcio = true; 
      	} else {
        	this.consorcio = false; 
      	}
    }
}

class TP06Q01ListaFlexivel {
  	public static void main(String[] args) throws Exception {
  		  Lista lista = new Lista();
        String comando, array[], linha;
        int posicao;

  		  for(String entrada = MyIO.readLine(); entrada.equals("0") == false; entrada = MyIO.readLine()) {
            Municipio municipio = new Municipio();
  			    municipio.ler(entrada, 0);

            lista.inserirFim(municipio);          
  		  }

        int num = MyIO.readInt();

        for (int i = 0; i < num; i++) {
            String entrada = MyIO.readLine();
            Municipio municipio = new Municipio();
            
            if(entrada.charAt(0) == 'I' && entrada.charAt(1) == 'I') { //Inserir inicio [comando,linha]
                array = entrada.split(" ");

                linha = array[1];
                municipio.ler(linha, 0);

                lista.inserirInicio(municipio);           
                
            } else if(entrada.charAt(0) == 'I' && entrada.charAt(1) == 'F') { //Inserir fim [comando,linha]
                array = entrada.split(" ");

                linha = array[1];
                municipio.ler(linha, 0);

                lista.inserirFim(municipio);          
       
            } else if(entrada.charAt(0) == 'I' && entrada.charAt(1) == '*') { //Inserir em qualquer posição [comando, posição, linha]
                array = entrada.split(" ");

                posicao = new Integer(array[1]).intValue();
                linha = array[2];
                municipio.ler(linha, 0);
                
                lista.inserir(municipio, posicao);        
                
            } else if(entrada.charAt(0) == 'R' && entrada.charAt(1) == '*') { //Remover em qualquer posição [comando, posição, linha]
                array = entrada.split(" ");

                comando = array[0];
                posicao = new Integer(array[1]).intValue();
                
                Municipio deletado = lista.remover(posicao);
                MyIO.println("(R) "+ deletado.getNome());

            } else if(entrada.charAt(0) == 'R' && entrada.charAt(1) == 'I') { //Remover início 
                    Municipio deletado = lista.removerInicio();
                    MyIO.println("(R) "+ deletado.getNome());
  
            } else if(entrada.charAt(0) == 'R' && entrada.charAt(1) == 'F') { //Remover fim
                    Municipio deletado = lista.removerFim();    
                    MyIO.println("(R) "+ deletado.getNome());           
            }       
        } 
        lista.mostrar();
  	}
}

class Celula {
    public Municipio elemento; // Elemento inserido na celula.
    public Celula prox; // Aponta a celula prox.

    /**
	   *Construtor da classe
	   */
	  public Celula() {
		
	  }
 
    /**
     * Construtor da classe.
     * @param elemento Municipio inserido na celula.
     */
    public Celula(Municipio elemento) {
        this.elemento = elemento;
        this.prox = null;
    }
}

class Lista {
    private Celula primeiro;
    private Celula ultimo;

    /**
     * Contrutor da classe
     */
    public Lista() {
        primeiro = new Celula();
        ultimo = primeiro;
    }

    /**
     * Calcula e retorna o tamanho, em numero de elementos, da lista.
     * @return resp int tamanho
     */
    public int tamanho() {
        int tamanho = 0; 
        for(Celula i = primeiro; i != ultimo; i = i.prox, tamanho++);
        return tamanho;
    }

    /**
     * Insere um elemento na primeira posição da lista.
     * @param municipio Municipio elemento a ser inserido.
     * @throws Exception Se a lista estiver cheia.
     */
    public void inserirInicio(Municipio municipio) throws Exception {
        Celula tmp = new Celula(municipio);
        tmp.prox = primeiro.prox;
        primeiro.prox = tmp;

        if(primeiro == ultimo) {
            ultimo = tmp;
        }
        tmp = null;
    }

    /**
    * Insere um elemento na última posição da lista.
    * @param municipio Municipio elemento a ser inserido.
    * @throws Exception Se a lista estiver cheia.
    */
    public void inserirFim(Municipio municipio) throws Exception {
        ultimo.prox = new Celula(municipio);
        ultimo = ultimo.prox;
    }
    
    /**
     * Insere um elemento de uma posição específica da lista e 
     * movimenta os demais elementos para o fim da mesma.
     * @param municipio Municipio elemento a ser inserido.
     * @throws Exception Se a lista estiver cheia.
     */
    public void inserir(Municipio municipio, int posicao) throws Exception {
        int tamanho = tamanho();

        if(posicao < 0 || posicao > tamanho) {
            throw new Exception("Erro ao inserir posição (" + posicao + " / tamanho = " + tamanho + ") inválida!");
        } else if(posicao == 0) {
            inserirInicio(municipio);
        } else if(posicao == tamanho) {
            inserirFim(municipio);
        } else {
            //Caminhar até a posição anterior a inserção
            Celula tmp = new Celula(municipio);
            Celula i = primeiro;
            for (int j = 0; j < posicao; j++, i = i.prox);
              
            tmp.prox = i.prox;
            i.prox = tmp;
            i = tmp = null;
        }
    }
    
    /**
     * Remove um elemento da primeira posicao da lista e movimenta 
     * os demais elementos para o inicio da mesma.
     * @return resp Municipio elemento a ser removido.
     * @throws Exception Se a lista estiver vazia.
     */
    public Municipio removerInicio() throws Exception {
        //Validar remoção
        if(primeiro == ultimo) {
            throw new Exception("Erro ao remover no início");
        }

        Celula tmp = primeiro;
        Municipio resp = tmp.prox.elemento;
        tmp = tmp.prox;
        primeiro.prox = tmp.prox;
        tmp.prox = null; 
        tmp = null;

        return resp;
    }
    
    /**
     * Remove um elemento da última posição da lista.
     * @return resp Municipio elemento a ser removido.
     * @throws Exception Se a lista estiver vazia.
     */
    public Municipio removerFim() throws Exception {
        //Validar remoção
        if (primeiro == ultimo) {
            throw new Exception("Erro ao remover no fim");
        } 
 
        // Caminhar ate a penultima celula:
        Celula i;
        for(i = primeiro; i.prox != ultimo; i = i.prox);
 
        Municipio resp = ultimo.elemento.clone(); 
        ultimo = i; 
        i = ultimo.prox = null;
       
        return resp;
    } 

    /**
     * Remove um elemento de uma posição específica da lista e 
     * movimenta os demais elementos para o inicio da mesma.
     * @param posicao Posicao de remocao.
     * @return resp int Elemento a ser removido.
     * @throws Exception Se a lista estiver vazia ou a posicao for invalida.
     */
    public Municipio remover(int posicao) throws Exception {
        int tamanho = tamanho();
        Municipio resp = primeiro.elemento;
 
        //Validar remoção
        if (primeiro == ultimo) {
            throw new Exception("Erro ao remover!");
 
        } else if(posicao < 0 || posicao >= tamanho){
            throw new Exception("Erro ao remover (posicao " + posicao + " / " + tamanho + " invalida!");
        } else if (posicao == 0){
            removerInicio();
        } else if (posicao == tamanho - 1){
            removerFim();
        } else {
            // Caminhar ate a posicao anterior a insercao
            Celula i = primeiro;
            for(int j = 0; j < posicao; j++, i = i.prox);
         
            Celula tmp = i.prox;
            resp = tmp.elemento;
            i.prox = tmp.prox;
            tmp.prox = null;
            i = tmp = null;
        }
        return resp;
    }

    /**
     * Mostra os elementos da lista separados por espacos.
     */
    public void mostrar() {
        for (Celula i = primeiro.prox; i != null; i = i.prox) {
            i.elemento.imprimir();
        }
    }
}
