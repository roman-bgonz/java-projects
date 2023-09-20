import factory.UsuarioFactory;

public class App {
    public static void main(String[] args) {
        UsuarioFactory obj = new UsuarioFactory(new UsuarioImplMongo());
        obj.getInsertaUsuario();
        obj.getEliminaUsuarioById(1);
    }
}
