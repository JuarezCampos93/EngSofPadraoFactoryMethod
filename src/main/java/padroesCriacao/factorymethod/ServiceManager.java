package padroesCriacao.factorymethod;

public class ServiceManager {


    public static Pessoa obterUsuario(String usuario){
        Class classe = null;
        Object objeto = null;
        try{
            classe = Class.forName("padroesCriacao.factorymethod." + usuario);
            objeto = classe.newInstance();
        }catch (Exception ex){
            System.out.println("Usuario nao especificado");
            throw new IllegalArgumentException("Usuario nao especificado");
        }
        if(!(objeto instanceof Pessoa)){
            System.out.println("Usuario nao pertencente a funcionabilidade");
            throw new IllegalArgumentException("Usuario nao pertencente a funcionabilidade");
        }
        return (Pessoa) objeto;
    }
}
