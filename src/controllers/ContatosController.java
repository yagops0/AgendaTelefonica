package controllers;

import classes.Contato;
import interfaces.CrudContato;

import java.util.ArrayList;
import java.util.List;

public class ContatosController implements CrudContato {
    private List<Contato> contatos = new ArrayList<>();



    @Override
    public boolean existeContato(String tel) {
        for(Contato c : this.contatos){
            if(c.getTelefone().equalsIgnoreCase(tel)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int retornarIndice(Contato c){
        for(Contato co : this.contatos){
            if(existeContato(c.getTelefone())){
                return this.contatos.indexOf(c);
            }
        }
        return -1;
    }

    @Override
    public boolean create(Contato c){
        if(!existeContato(c.getTelefone())){
            this.contatos.add(c);
            return true;
        }

        return false;
    }

    @Override
    public Contato read(String tel) {
        for(Contato c : this.contatos){
            if(existeContato(c.getTelefone()) && c.getTelefone().equals(tel)){
                return c;
            }
        }
        return null;
    }

    @Override
    public boolean update(Contato c) {
        if(existeContato(c.getTelefone())){
            int indice = retornarIndice(c);
            this.contatos.set(indice, c);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Contato c) {
        if(existeContato(c.getTelefone())){
            int indice = retornarIndice(c);
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




