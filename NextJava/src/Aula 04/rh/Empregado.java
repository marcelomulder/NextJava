package aula04.rh;

public class Empregado {
    private String nome;
    private String cpf;
    private String nis;
    protected Double salario;
 
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNis() {
        return this.nis;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }

    public Double getSalario() {
        return this.salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String toString() {
        String detalhesEmpregado = 
        "Nome: " + getNome() + "\n" +
        "CPF: " + getCpf() + "\n" +
        "NIS: " + getNis() + "\n" +
        "Salário: " + getSalario() + "\n";
    
        return detalhesEmpregado;
    }


    
}   