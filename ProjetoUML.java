public class ProjetoUML {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        iphone.ligar( 12345678L);

        iphone.atender();

        iphone.iniciarCorreioVoz();
        
        iphone.exibirPagina();

        iphone.adcionarNovaPagina("google.com");
        iphone.adcionarNovaPagina("facebook.com");


        iphone.fecharPaginas();

        iphone.atualizarPagina(1 );

        iphone.tocar();

        iphone.pausar();

        iphone.selecionarMusica( "nada Impede Musica Diferente de ENUM");

    }

}
