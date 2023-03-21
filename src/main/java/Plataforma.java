public class Plataforma {

    String nome;
    Serie[] series = new Serie[50];

    public void mostraInfo(){
        System.out.println("Nome da biblioteca: " +nome);
        System.out.println("------------------");
        for (int i = 0; i < series.length; i++) {
            if(series[i]!=null){
                series[i].mostraInfo();
    }

    public void addSerie(Serie se: series){

        for (i = 0; i < series.length; i++) {
            if (series[i] == null) {
                series[i] = series;
                System.out.println("serie adicionada");
                break;
            }
        }
    }

    String serieMaisLongaFinalizada(){

    }

    void mediaPorcentagem(){

    }
}

