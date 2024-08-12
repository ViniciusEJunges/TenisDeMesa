public class RaqueteAntigaAdapter implements Raquete {
    private RaqueteAntiga raqueteAntiga;

    public RaqueteAntigaAdapter(RaqueteAntiga raqueteAntiga) {
        this.raqueteAntiga = raqueteAntiga;
    }

    @Override
    public void usar() {
        raqueteAntiga.jogar();
    }
}
