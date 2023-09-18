package padroesCriacao.factorymethod;

import org.junit.jupiter.api.Test;

class ProfessorTest {

    @Test
    void deveNaoRetornarFalhas(){
        Pessoa usuario = ServiceManager.obterUsuario("Professor");
    }


}