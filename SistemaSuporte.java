public class SistemaSuporte {

    public static void main(String[] args) {

        String nomeSistema = "Sistema de Suporte de TI";
        String versao = "1.0";
        String tecnico = "Seu Nome";
        int chamadosAbertos = 3;
        String statusSistema = "Em funcionamento";

        System.out.println("=== SISTEMA DE SUPORTE DE TI ===");
        System.out.println("Nome do sistema: " + nomeSistema);
        System.out.println("Versao: " + versao);
        System.out.println("Tecnico responsavel: " + tecnico);
        System.out.println("Chamados abertos: " + chamadosAbertos);
        System.out.println("Status do sistema: " + statusSistema);

        if (chamadosAbertos > 0) {
            System.out.println("Existem chamados aguardando atendimento");
        } else {
            System.out.println("Nenhum chamado pendente");
        }
    }
}