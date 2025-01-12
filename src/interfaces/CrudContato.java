package interfaces;


import classes.Contato;

import java.util.List;

public interface CrudContato{
    public int retornarIndice(Contato c);
    public boolean existeContato(String tel);
    public boolean create(Contato contato);
    public Contato read(String nome);
    public boolean update(Contato contato);
    public boolean delete(Contato contato);
    public List<Contato> listAll();
}
