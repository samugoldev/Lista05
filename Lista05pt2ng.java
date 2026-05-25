package chapeuseletor;

public class Lista05pt2 {
    // Atributos privados (Encapsulamento solicitado implicitamente na POO)
    private String nome;
    private int idade;
    private double coragem;
    private double inteligencia;
    private double ambicao;
    private double lealdade;
    private double estrategia;   // Adicionado para atender à fórmula da Sonserina
    private double criatividade; // Adicionado para atender à fórmula da Corvinal
    private String casa;

    // Construtor da Classe
    public Lista05pt2 (String nome, int idade, double coragem, double inteligencia, 
                 double ambicao, double lealdade, double estrategia, double criatividade) {
        this.nome = nome;
        this.idade = idade;
        this.coragem = coragem;
        this.inteligencia = inteligencia;
        this.ambicao = ambicao;
        this.lealdade = lealdade;
        this.estrategia = estrategia;
        this.criatividade = criatividade;
        this.casa = "Não selecionada";
    }

    // Método para calcular a casa com base nas regras fornecidas
    public void calcularCasa() {
        // Fórmulas da Lista 5
        double pontosGrifinoria = (2 * this.coragem) + this.lealdade;
        double pontosSonserina = (2 * this.ambicao) + this.estrategia;
        double pontosCorvinal = (2 * this.inteligencia) + this.criatividade;
        double pontosLufaLufa = ((2 * this.lealdade) + this.coragem) / 3;

        // Algoritmo para definir a MAIOR pontuação
        double maiorPontuacao = pontosGrifinoria;
        this.casa = "Grifinória";

        if (pontosSonserina > maiorPontuacao) {
            maiorPontuacao = pontosSonserina;
            this.casa = "Sonserina";
        }
        if (pontosCorvinal > maiorPontuacao) {
            maiorPontuacao = pontosCorvinal;
            this.casa = "Corvinal";
        }
        if (pontosLufaLufa > maiorPontuacao) {
            maiorPontuacao = pontosLufaLufa;
            this.casa = "Lufa-Lufa";
        }
    }

    // Método para exibir as informações
    public void exibirInformacoes() {
        System.out.println("\n==================================");
        System.out.println("      RESULTADO DA SELEÇÃO        ");
        System.out.println("==================================");
        System.out.println("Nome do Aluno: " + this.nome);
        System.out.println("Idade: " + this.idade + " anos");
        System.out.println("Casa Designada: " + this.casa);
        System.out.println("==================================\n");
    }

    // Métodos Getters e Setters para encapsulamento
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public double getCoragem() { return coragem; }
    public void setCoragem(double coragem) { this.coragem = coragem; }

    public double getInteligencia() { return inteligencia; }
    public void setInteligencia(double inteligencia) { this.inteligencia = inteligencia; }

    public double getAmbicao() { return ambicao; }
    public void setAmbicao(double ambicao) { this.ambicao = ambicao; }

    public double getLealdade() { return lealdade; }
    public void setLealdade(double lealdade) { this.lealdade = lealdade; }

    public double getEstrategia() { return estrategia; }
    public void setEstrategia(double estrategia) { this.estrategia = estrategia; }

    public double getCriatividade() { return criatividade; }
    public void setCriatividade(double criatividade) { this.criatividade = criatividade; }

    public String getCasa() { return casa; }
    public void setCasa(String casa) { this.casa = casa; }
}