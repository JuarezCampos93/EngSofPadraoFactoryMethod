package padroesCriacao.factorymethod;

import org.junit.jupiter.api.Test;

class AlunoTest {

    @Test
    void deveNaoRetornarFalhas(){
        Pessoa usuario = ServiceManager.obterUsuario("Aluno");
    }

}