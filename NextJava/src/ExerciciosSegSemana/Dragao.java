public class Dragao {
    String nome;
    String apelido;
    String aQuemPertence;
    String ondeNasceu;

    public Dragao(String nome, String apelido, String aQuemPertence, String ondeNasceu) {
        this.nome = nome;
        this.apelido = apelido;
        this.aQuemPertence = aQuemPertence;
        this.ondeNasceu = ondeNasceu; 
    }
    
    public static void main(String[] args) {
        Dragao balerion = new Dragao("Balerion", "Terror Negro", "Aegon Conquistador", "Valíria");

        System.out.println(balerion.aQuemPertence);
        
    }
    
}
