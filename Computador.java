
public class Computador {
    private String patrimonio;
    private String modelo;
    private String sistemaOperacional;
    private boolean ligado;

    public String getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(String patrimonio) {
        this.patrimonio = patrimonio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

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