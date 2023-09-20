package factory;

import interfaces.IUsuario;

public class UsuarioFactory {

    IUsuario usr;

    public UsuarioFactory(IUsuario usuario) {
        this.usr = usuario;
    }

    public void getInsertaUsuario() {
        this.usr.insertaUsuario();
    }

    public void getEliminaUsuarioById(int id) {
        this.usr.eliminaUsuarioById(id);
    }
}
