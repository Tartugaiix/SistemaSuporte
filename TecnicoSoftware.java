
public class TecnicoSoftware extends Tecnico implements Atendimento {

    @Override
    public void realizarAtendimento() {
        System.out.println("Tecnico de software verificando programas e sistema operacional.");
    }
}