
public class Principal {
    public static void main(String[] args) {
        TecnicoHardware tecnicoHardware = new TecnicoHardware();
        tecnicoHardware.setNome("Emanuelle");
        tecnicoHardware.setEspecialidade("Hardware");

        TecnicoSoftware tecnicoSoftware = new TecnicoSoftware();
        tecnicoSoftware.setNome("Carlos");
        tecnicoSoftware.setEspecialidade("Software");

        Atendimento atendimento1 = tecnicoHardware;
        Atendimento atendimento2 = tecnicoSoftware;

        System.out.println("=== ATENDIMENTO DE HARDWARE ===");
        System.out.println("Tecnico: " + tecnicoHardware.getNome());
        atendimento1.realizarAtendimento();

        System.out.println("\n=== ATENDIMENTO DE SOFTWARE ===");
        System.out.println("Tecnico: " + tecnicoSoftware.getNome());
        atendimento2.realizarAtendimento();
    }
}