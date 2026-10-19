
public class Chamado {
    private String descricao;
    private Computador computador;
    private Tecnico tecnico;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Computador getComputador() {
        return computador;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public void exibirChamado() {
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