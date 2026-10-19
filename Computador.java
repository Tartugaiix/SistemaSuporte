public class Computador {

    String patrimonio;
    String modelo;
    String sistemaOperacional;
    boolean ligado;

    public void ligar() {
        ligado = true;
        System.out.println("Computador ligado!");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Computador desligado!");
    }

    public void exibirInformacoes() {
        System.out.println("Patrimonio: " + patrimonio);
        System.out.println("Modelo: " + modelo);
        System.out.println("Sistema operacional: " + sistemaOperacional);
        System.out.println("Ligado: " + ligado);
    }
}