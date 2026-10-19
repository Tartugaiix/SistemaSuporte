
public class TecnicoHardware extends Tecnico implements Atendimento {

    @Override
    public void realizarAtendimento() {
        System.out.println("Tecnico de hardware verificando as pecas do computador.");
    }
}