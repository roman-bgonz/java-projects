import interfaces.IUsuario;

public class UsuarioImplOracle implements IUsuario {

    @Override
    public void insertaUsuario() {
        System.out.println("Insertando Usuario en Oracle");
    }

    @Override
    public void eliminaUsuarioById(int id) {
        System.out.println("Eliminando Usuario en Oracle: " + id);
    }

}
