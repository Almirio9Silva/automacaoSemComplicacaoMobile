package testsChronos;

import core.Driver;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.ProdutosPage;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTests {

    LoginPage loginPage;
    ProdutosPage produtosPage;

    @Test
    public void imprimirNoConsole(){

        System.out.println("Primeiro Teste!!");
    }

    @Test
    public void realizarLoginValido() throws java.net.MalformedURLException{

        Driver.inicializaDriver();
        loginPage = new LoginPage();
        loginPage.realizarLogin("teste@chronosacademy.com.br", "123456");

        produtosPage = new ProdutosPage();
        assertEquals("Conheça todos os nossos cursos", produtosPage.getTxtTituloProdutos());

    }
}
