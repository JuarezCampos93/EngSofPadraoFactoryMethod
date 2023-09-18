package padroesCriacao.factorymethod;

import org.junit.jupiter.api.Test;

class AdministradorTest {

    @Test
    void deveNaoRetornarFalhas(){
        Pessoa usuario = ServiceManager.obterUsuario("Administrador");
    }

}