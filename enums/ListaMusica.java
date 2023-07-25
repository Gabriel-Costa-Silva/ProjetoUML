package enums;

public enum ListaMusica {
    JAZZ("JAZZ"),
    ROCK("ROCK"),
    BLUES("BLUES"),
    SOUL("SOUL");
    private final String musica;


    ListaMusica(String musica){
        this.musica = musica;
    }
    public String getMusica(){
        return musica;
    }


}
