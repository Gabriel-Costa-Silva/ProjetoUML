import interfaces.AparelhoTelefonico;
import interfaces.ListaMusica;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

import java.util.Scanner;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {



    String musica ;
    long[] numeroPerdido;

    String[] paginasWeb;

    Scanner scanner;
    Iphone(){
        scanner = new Scanner(System.in);
        musica = ListaMusica.JAZZ.getMusica();
        numeroPerdido = new long[]{};

    }


    @Override
    public void ligar(long numeroDiscado) {
        System.out.println(Long.toString(numeroDiscado)+" LIGANDO!!!");
        System.out.println("ATENDER ? ");
        String opcao = scanner.nextLine();
        if(     opcao.equalsIgnoreCase("Y") ||
                opcao.equalsIgnoreCase("YES") ||
                opcao.equalsIgnoreCase("S") ||
                opcao.equalsIgnoreCase("SIM")){
            atender();
        }else{
            System.out.printf("LIGACAO do numero %d NAO ATENDIDA! Encaminhada ao correio de voz! \n ", numeroDiscado);
            numeroPerdido[numeroPerdido.length] = numeroDiscado;
        }
    }

    @Override
    public void atender() {
        System.out.println("LIGACAO ATENDIDA");
    }

    @Override
    public void iniciarCorreioVoz() {
        if(numeroPerdido == null){
            System.out.println("Não há correio de voz!");
        }
        else if(numeroPerdido.length > 0) {

            for (int i = 0; i < numeroPerdido.length; i++) {
                System.out.printf("Numero não atendido %d %n ", numeroPerdido[i]);
            }
            numeroPerdido = null;
        }else{
            System.out.println("Não há correio de voz!");
        }

    }

    @Override
    public void exibirPagina() {
        for(int i = 0; i < paginasWeb.length; i++  ){
            System.out.printf("Pagina mostrada  ", paginasWeb[i]  );
        }
    }

    @Override
    public void adcionarNovaPagina(String paginaWeb) {
        System.out.printf("Adcionando nova página html... %s",paginaWeb);
        paginasWeb[paginasWeb.length] = paginaWeb;
    }

    public void fecharPaginas(){
        paginasWeb = null;
    }


    @Override
    public void atualizarPagina(int numeroPagina ) {
        System.out.printf("Atualizando página %s ", paginasWeb[numeroPagina]);

    }

    @Override
    public void tocar() {
        System.out.printf("Tocando %s", musica);

    }

    @Override
    public void pausar() {
        System.out.printf("Tocando %s", musica);


    }

    @Override
    public void selecionarMusica(String musicaEscolhida) {
        musica = musicaEscolhida;

    }
}
