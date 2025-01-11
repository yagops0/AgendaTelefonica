package interfaces;

import Generics.Box;
import classes.Contato;

import java.util.List;

public interface CrudContato{
    public int retornarIndice(Box c);
    public boolean existeContato(Box<> nome);
    public boolean create(Box<> contato);
    public Box<> read(String nome);
    public boolean update(Box<> contato);
    public boolean delete(Box<> contato);
    public List<> listAll();
}
