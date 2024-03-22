package pages;

import core.Driver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ProdutosPage {

    public ProdutosPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()), this);
    }

    @AndroidFindBy(accessibility =  "conhecaTodosOsNossoCursos")
    public WebElement txtTituloProdutos;

    public String getTxtTituloProdutos(){
        return txtTituloProdutos.getText();
    }
}
