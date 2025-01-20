package classes;

public class PessoaJuridica extends Contato{
    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;

    public PessoaJuridica(){

    }

    public PessoaJuridica(String nome, String telefone, String email, String endereco, String cnpj, String razaoSocial, String nomeFantasia) {
        super(nome, telefone, email, endereco);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    @Override
    public String toString(){
        return " / Nome: " + this.getNome() +
                " / Nome fantasia: " + this.nomeFantasia +
                " / Cnpj: " + this.cnpj +
                " / Tel: "  + this.getTelefone() +
                " / Email: " + this.getEmail() +
                " / Endereco: " + this.getEndereco() +
                " / Razao Social: " + this.razaoSocial;

    }
}
