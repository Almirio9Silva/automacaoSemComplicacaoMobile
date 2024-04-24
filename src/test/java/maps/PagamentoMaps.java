package maps;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class PagamentoMaps {

    @AndroidFindBy(accessibility = "imagemCartao_credito")
    public WebElement btnCartaoCredito;

    @AndroidFindBy(accessibility = "inputCredicard")
    public WebElement inpCreditCard;
    @AndroidFindBy(accessibility = "inputdata")
    public WebElement inpData;

    @AndroidFindBy(accessibility = "inputCVV")
    public WebElement inpCVV;

    @AndroidFindBy(accessibility = "inputNomeTitular")
    public WebElement inpNomeTitular;

    @AndroidFindBy(accessibility = "inputCPFTitular")
    public WebElement inpCpfTitular;

    @AndroidFindBy(accessibility = "confirmar_pagamento_botao")
    public WebElement btnConfirmarPagamento;

}
