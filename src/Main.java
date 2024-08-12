public class Main {
    public static void main(String[] args) {
        // Teste do padrão Singleton (Placar)
        Placar placar = Placar.getInstancia();
        placar.pontoParaJogador1();
        placar.pontoParaJogador1();
        placar.pontoParaJogador1();
        placar.pontoParaJogador1();
        placar.pontoParaJogador2();
        System.out.println("Placar:");
        System.out.println("Jogador 1: " + placar.getPlacar().get("Jogador 1") + " \nJogador 2: " + placar.getPlacar().get("Jogador 2"));

        // Definição das Estratégias
        Estrategia estrategiaAtaque = new EstrategiaAtaque();
        Estrategia estrategiaDefesa = new EstrategiaDefesa();
        Estrategia estrategiaEquilibrada = new EstrategiaEquilibrada();

        // Teste do padrão Builder (Jogador)
        Jogador jogador1 = new Jogador.JogadorBuilder()
                .nome("Vinicius")
                .estiloDeJogo("Ataque")
                .nivelDeHabilidade(9)
                .estrategia(estrategiaAtaque)
                .build();

        Jogador jogador2 = new Jogador.JogadorBuilder()
                .nome("Bruno")
                .estiloDeJogo("Defensivo")
                .nivelDeHabilidade(7)
                .estrategia(estrategiaDefesa)
                .build();

        System.out.println("\nInformações dos Jogadores:");
        System.out.println("Jogador 1:");
        System.out.println("Nome: " + jogador1.getNome());
        System.out.println("Estilo de Jogo: " + jogador1.getEstiloDeJogo());
        System.out.println("Nível de Habilidade: " + jogador1.getNivelDeHabilidade());
        System.out.println("Usando raquete de madeira.");
        System.out.println("Estratégia:");
        jogador1.getEstrategia().jogar();

        System.out.println("\nJogador 2:");
        System.out.println("Nome: " + jogador2.getNome());
        System.out.println("Estilo de Jogo: " + jogador2.getEstiloDeJogo());
        System.out.println("Nível de Habilidade: " + jogador2.getNivelDeHabilidade());
        System.out.println("Usando raquete antiga.");
        System.out.println("Estratégia:");
        jogador2.getEstrategia().jogar();
    }
}
