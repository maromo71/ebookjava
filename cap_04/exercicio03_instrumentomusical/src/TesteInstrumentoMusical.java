public class TesteInstrumentoMusical {
    public static void main(String[] args) {
        InstrumentoMusical piano = new Piano();
        InstrumentoMusical violao = new Violao();

        piano.tocar();
        violao.tocar();
    }
}
