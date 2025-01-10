package controllers;

import classes.Contato;
import classes.PessoaFisica;
import interfaces.CrudContato;

import java.util.ArrayList;
import java.util.List;

public class PessoaFisicaController implements CrudContato {
    private List<Contato> contatos = new ArrayList<>();



    @Override
    public boolean existeContato(String nome) {
        for(Contato c : this.contatos){
            if(c.getNome().equalsIgnoreCase(nome)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int retornarIndice(Contato pf){
        for(Contato c : this.contatos){
            if(existeContato(pf.getNome())){
                return this.contatos.indexOf(c);
            }
        }
        return -1;
    }

    @Override
    public boolean create(Contato pf){
        if(existeContato(pf.getNome())){
            return false;
        }
        this.contatos.add(pf);
        return true;
    }

    @Override
    public Contato read(String nome) {
        for(Contato c : this.contatos){
            if(c.getNome().equals(nome)){
                return c;
            }
        }

        return null;
    }

    @Override
    public boolean update(Contato pf) {
        if(existeContato(pf.getNome())){
            int indice = retornarIndice(pf);
            this.contatos.set(indice, pf);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Contato pf) {
        if(existeContato(pf.getNome())){
            int indice = retornarIndice(pf);
            this.contatos.remove(indice);
            return true;
        }
        return false;
    }

    @Override
    public List<Contato> listAll() {
        return this.contatos;
    }
}




