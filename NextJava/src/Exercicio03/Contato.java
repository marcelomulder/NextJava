public class Contato {
    private String nome;
    private String telefoneFixo;
    private String celular;
    
    public String getNome(){
        return nome;
    }

    public String getCelular(){
        return celular;
    }
    
    public String getTelefoneFixo(){
        return telefoneFixo;
    }

    public void setCelular(String celular){
        this.celular = formatarNumero(celular);
    }

    







}
