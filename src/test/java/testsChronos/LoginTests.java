package testsChronos;

import core.Driver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.ProdutosPage;

import java.net.MalformedURLException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTests {

    LoginPage loginPage;
    ProdutosPage produtosPage;

    @BeforeEach
    public void inicializaTesteLogin() throws MalformedURLException {
        Driver.inicializaDriver();
        loginPage = new LoginPage();
    }

    @Test
    public void imprimirNoConsole(){

        System.out.println("Primeiro Teste!!");
    }

    @Test
    public void realizarLoginValido() throws java.net.MalformedURLException{

        loginPage.realizarLogin("teste@chronosacademy.com.br", "123456");

        produtosPage = new ProdutosPage();
        assertEquals("Conheça todos os nossos cursos", produtosPage.getTxtTituloProdutos());

    }

    @Test
    public void realizarLoginEmailInvalido() throws MalformedURLException {

        loginPage.realizarLogin("teste", "123456");
        assertEquals("O email não é válido.", loginPage.getTxtEmailError());
    }

    @Test
    public void realizarLoginSenhaInvalida() throws MalformedURLException {

        loginPage.realizarLogin("teste@chronosacademy.com.br", "123");
        assertEquals("A senha deve ter no mínimo 6 caracteres.", loginPage.getTxtPasswordError());
    }
}
