public class Jogador {
    private String nome;
    private String estiloDeJogo;
    private int nivelDeHabilidade;
    private Estrategia estrategia;

    private Jogador(JogadorBuilder builder) {
        this.nome = builder.nome;
        this.estiloDeJogo = builder.estiloDeJogo;
        this.nivelDeHabilidade = builder.nivelDeHabilidade;
        this.estrategia = builder.estrategia;
    }

    public static class JogadorBuilder {
        private String nome;
        private String estiloDeJogo;
        private int nivelDeHabilidade;
        private Estrategia estrategia;

        public JogadorBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public JogadorBuilder estiloDeJogo(String estiloDeJogo) {
            this.estiloDeJogo = estiloDeJogo;
            return this;
        }

        public JogadorBuilder nivelDeHabilidade(int nivelDeHabilidade) {
            this.nivelDeHabilidade = nivelDeHabilidade;
            return this;
        }

        public JogadorBuilder estrategia(Estrategia estrategia) {
            this.estrategia = estrategia;
            return this;
        }

        public Jogador build() {
            return new Jogador(this);
        }
    }

    public String getNome() {
        return nome;
    }

    public String getEstiloDeJogo() {
        return estiloDeJogo;
    }

    public int getNivelDeHabilidade() {
        return nivelDeHabilidade;
    }

    public Estrategia getEstrategia() {
        return estrategia;
    }
}
