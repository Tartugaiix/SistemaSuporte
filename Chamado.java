
public class Chamado {
    private static int totalChamados = 0;

    private int numero;
    private String descricao;
    private Computador computador;
    private Tecnico tecnico;

    public Chamado(int numero, String descricao) {
        this.numero = numero;
        this.descricao = descricao;
        totalChamados++;
    }

    public static int getTotalChamados() {
        return totalChamados;
    }

    public int getNumero() {
        return numero;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public void exibirChamado() {
        System.out.println("Numero: " + numero);
        System.out.println("Descricao: " + descricao);

        if (computador != null) {
            System.out.println("Patrimonio do computador: "
                    + computador.getPatrimonio());
        }

        if (tecnico != null) {
            System.out.println("Tecnico responsavel: "
                    + tecnico.getNome());
        }
    }
}