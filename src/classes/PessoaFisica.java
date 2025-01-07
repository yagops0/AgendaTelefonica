package classes;

public class PessoaFisica extends Contato{
    private String cpf;
    private String dataNascimento;

    public PessoaFisica(){

    }

    public PessoaFisica(String nome, String telefone, String email, String endereco, String cpf, String dataNascimento) {
        super(nome, telefone, email, endereco);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
