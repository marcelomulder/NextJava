public class Sanduicheira {
    int voltagem;
    boolean eNova;
    boolean estaLigadaSanduicheira = false;
    int fazQuantosSanduichesAoMesmoTempo;

    public Sanduicheira(int volt, boolean nova, int quantos){
        voltagem = volt;
        eNova = nova;        
        fazQuantosSanduichesAoMesmoTempo = quantos;
    }

    public void ligarSanduicheira() {
        estaLigadaSanduicheira = true;
    }

    public void desligarSanduicheira() {
        estaLigadaSanduicheira = false;
    }

    public void fazerSanduiche(){
        //falta fazer

    }

    public static void main(String[] args) {
        Sanduicheira sanduicheiraArno = new Sanduicheira(220, true, 2);
        System.out.println(sanduicheiraArno.estaLigadaSanduicheira);

        sanduicheiraArno.ligarSanduicheira();
        System.out.println(sanduicheiraArno.estaLigadaSanduicheira);

        
    }
}
