package padroesCriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceManagerTest {

    @Test
    void deveRetornarExcecaoUsuarioNaoEspecificado(){
        try{
            Pessoa usuario = ServiceManager.obterUsuario("Secretario");
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("Usuario nao especificado", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoUsuarioNaoPertecente(){
        try{
            Pessoa usuario = ServiceManager.obterUsuario("Dependente");
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Usuario nao pertencente a funcionabilidade", e.getMessage());
        }
    }
}