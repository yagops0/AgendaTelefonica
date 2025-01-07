package interfaces;

import classes.Contato;

import java.util.List;

public interface CrudContato {
    public void create(Contato contato);
    public Contato read(String nome);
    public void update(Contato contato);
    public void delete(String nome);
    public List<Contato> listAll();
}
