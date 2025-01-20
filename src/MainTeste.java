import classes.Contato;
import classes.PessoaFisica;
import classes.PessoaJuridica;
import controllers.ContatosController;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTeste {
    public static void main(String[] args){
        List<Contato> contatos = new ArrayList<>();
        Scanner ent = new Scanner(System.in);
        int escolha, escolhaAdd;
        char continuar, continuarAdd;
        String telefone;
        ContatosController cc = new ContatosController();
        System.out.println("TESTES");

        do{

            System.out.println("====================================================");
            System.out.println("MENU ESCOLHA");
            System.out.println("1 - Add");
            System.out.println("2 - read");
            System.out.println("3 - update");
            System.out.println("4 - delete");
            System.out.println("5 - listAll");
            System.out.println("====================================================");

            System.out.println("Digite sua opcao: ");
            escolha = ent.nextInt();
            ent.nextLine();

            switch (escolha){
                case 1:
                    do{
                        PessoaFisica pf = new PessoaFisica();
                        PessoaJuridica pj = new PessoaJuridica();
                        System.out.println("Add");
                        System.out.println("Contato Pessoa Fisica ou Pessoa Juridica");
                        escolhaAdd = ent.nextInt();
                        ent.nextLine();
                        switch (escolhaAdd){
                            case 1:
                                System.out.println("Pessoa fisica");
                                System.out.println("Nome: ");
                                pf.setNome(ent.nextLine());
                                System.out.println("Cpf: ");
                                pf.setCpf(ent.nextLine());
                                System.out.println("Tel: ");
                                pf.setTelefone(ent.nextLine());
                                System.out.println("Email: ");
                                pf.setEmail(ent.nextLine());
                                System.out.println("Endereco: ");
                                pf.setEndereco(ent.nextLine());
                                System.out.println("data nascimento: ");
                                pf.setDataNascimento(ent.nextLine());
                                String retornoPf = cc.create(pf) ? "Adicionado" : "Não adicionado";
                                System.out.println(retornoPf);
                                break;
                            case 2:
                                System.out.println("Pessoa Juridica");
                                System.out.println("Nome: ");
                                pj.setNome(ent.nextLine());
                                System.out.println("Tel: ");
                                pj.setTelefone(ent.nextLine());
                                System.out.println("Email: ");
                                pj.setEmail(ent.nextLine());
                                System.out.println("Endereco: ");
                                pj.setEndereco(ent.nextLine());
                                System.out.println("cnpj: ");
                                pj.setCnpj(ent.nextLine());
                                System.out.println("razao social: ");
                                pj.setRazaoSocial(ent.nextLine());
                                System.out.println("nome fantasia: ");
                                pj.setNomeFantasia(ent.nextLine());
                                String retornoPj = cc.create(pj) ? "Adicionado" : "Não adicionado";
                                System.out.println(retornoPj);
                                break;
                            default:
                                System.out.println("Opcao invalida");

                        }
                        System.out.println("Deseja adicionar mais algum contato?(s / n)");
                        continuarAdd = ent.nextLine().charAt(0);
                    }while (continuarAdd != 'n');
                    ent.nextLine();
                    break;
                case 2:
                    System.out.println("Read");
                    System.out.println("Digite o telefone que deseja pesquisar: ");
                    telefone = ent.nextLine();

                    if(cc.read(telefone) != null){
                        System.out.println("Contato encontrado: " + cc.read(telefone).toString());
                    }
                    else{
                        System.out.println("Contato não encontrado");
                    }
                    break;
                case 3:
                    System.out.println("Update");
                    System.out.println("Escolha que tipo de contato deseja atualizar: ");
                    escolhaAdd = ent.nextInt();
                    ent.nextLine();

                    switch (escolhaAdd){
                        case 1:
                            System.out.println("Atualizar pessoa fisica: ");
                            System.out.println("Digite o telefone do contato que deseja atualizar: ");
                            telefone = ent.nextLine();

                            if(cc.read(telefone) != null){
                                System.out.println("Contato: ");
                                System.out.println("- " + cc.read(telefone).toString());
                                PessoaFisica pf = (PessoaFisica) cc.read(telefone);
                                System.out.println("Pessoa fisica");
                                System.out.println("Nome: ");
                                pf.setNome(ent.nextLine());
                                System.out.println("Cpf: ");
                                pf.setCpf(ent.nextLine());
                                System.out.println("Tel: ");
                                pf.setTelefone(ent.nextLine());
                                System.out.println("Email: ");
                                pf.setEmail(ent.nextLine());
                                System.out.println("Endereco: ");
                                pf.setEndereco(ent.nextLine());
                                System.out.println("data nascimento: ");
                                pf.setDataNascimento(ent.nextLine());
                                String mensagemAt = cc.update(pf) ? "Atualizado" : "Não atualizado";
                                System.out.println(mensagemAt);

                            }
                            else{
                                System.out.println("Erro");
                            }
                            break;
                        case 2:
                            System.out.println("Atualizar pessoa jurídica: ");
                            System.out.println("Digite o telefone do contato que deseja atualizar: ");
                            telefone = ent.nextLine();

                            if(cc.read(telefone) != null){
                                System.out.println("Contato: ");
                                System.out.println("- " + cc.read(telefone).toString());
                                PessoaJuridica pj = (PessoaJuridica) cc.read(telefone);
                                System.out.println("Pessoa fisica");
                                System.out.println("Nome: ");
                                pj.setNome(ent.nextLine());
                                System.out.println("nome fantasia: ");
                                pj.setNomeFantasia(ent.nextLine());
                                System.out.println("Cpf: ");
                                pj.setCnpj(ent.nextLine());
                                System.out.println("Tel: ");
                                pj.setTelefone(ent.nextLine());
                                System.out.println("Email: ");
                                pj.setEmail(ent.nextLine());
                                System.out.println("Endereco: ");
                                pj.setEndereco(ent.nextLine());
                                System.out.println("razao social: ");
                                pj.setRazaoSocial(ent.nextLine());

                                String mensagemAt = cc.update(pj) ? "Atualizado" : "Não atualizado";
                                System.out.println(mensagemAt);

                            }
                            else{
                                System.out.println("Erro");
                            }
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Delete");
                    System.out.println("Remover contato: ");
                    System.out.println("Digite o telefone do contato que deseja excluir: ");
                    telefone = ent.nextLine();
                    String mensagem = cc.delete(cc.read(telefone)) ? "Removido" : "Não removido";
                    System.out.println(mensagem);
                    break;
                case 5:
                    for(Contato c : cc.listAll()){
                        System.out.println(c);
                    }
                    break;
                default:
                    System.out.println("Está opção não está disponivel.");
            }

            System.out.println("Deseja continuar?(s / n)");
            continuar = ent.nextLine().charAt(0);

        }while(continuar != 'n');
    }
}
