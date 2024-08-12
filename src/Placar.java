import java.util.HashMap;
import java.util.Map;

public class Placar {
    private static Placar instancia;
    private Map<String, Integer> placar;

    private Placar() {
        placar = new HashMap<>();
        placar.put("Jogador 1", 0);
        placar.put("Jogador 2", 0);
    }

    public static Placar getInstancia() {
        if (instancia == null) {
            instancia = new Placar();
        }
        return instancia;
    }

    public void pontoParaJogador1() {
        placar.put("Jogador 1", placar.get("Jogador 1") + 1);
    }

    public void pontoParaJogador2() {
        placar.put("Jogador 2", placar.get("Jogador 2") + 1);
    }

    public Map<String, Integer> getPlacar() {
        return placar;
    }
}
