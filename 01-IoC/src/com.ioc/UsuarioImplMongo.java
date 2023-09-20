import interfaces.IUsuario;

public class UsuarioImplMongo implements IUsuario {

    @Override
    public void insertaUsuario() {
        System.out.println("Insertando Usuario con Mongo");
    }

    @Override
    public void eliminaUsuarioById(int id) {
        System.out.println("Eliminando Usuario con Mongo: " + id);
    }

}
