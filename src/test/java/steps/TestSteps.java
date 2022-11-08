package steps;

import base.Driver;
import io.cucumber.java.en.Given;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class TestSteps {

    private static final Logger LOGGER = LogManager.getLogger(Driver.class);

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    ProductPage productPage = new ProductPage();
    CartPage cartPage = new CartPage();

    @Given("^Kullanici ana sayfayi ziyaret eder$")
    public void kullanici_ana_sayfayi_ziyaret_eder() {
        homePage.navigateToHomePage();
        LOGGER.info("Kullanıcı Hepsiburada.com sitesini Ziyaret Eder.");
    }

    @Given("^Kullanici kelimesini aratir \"([^\"]*)\"$")
    public void kullanici_kelimesini_aratir(String text) {
        homePage.searchForProduct(text);
        LOGGER.info("Kullanıcı: " + text +" kelimesini arama yaptı.");
    }

    @Given("^Kullanici urunleri secer$")
    public void kullanici_urunleri_secer() {
        productPage.chooseProduct();
        LOGGER.info("Kullanıcı seçilen ürünü aradı ve tıkladı.");
    }
    @Given("^Cerezler kabul edilir$")
    public void cerezler_kabul_edilir() {
        homePage.clickAcceptCookies();
        LOGGER.info(" Çerezler kabul edildi..");
    }
    @Given("^Kullanici iki farkli magazadan urun ekler$")
    public void kullanici_iki_farkli_magazadan_urun_ekler() {
        productPage.addProducts();
        LOGGER.info("Seçilen ürün için 2 tane farklı satıcıdan ürün seçilip sepete eklenir.");
    }



    @Given("^Secilen urunun dogru olarak eklendigi sepetim sayfasında dogrulanır$")
    public void secilen_urunun_dogru_olarak_eklendigi_sepetim_sayfasinda_dogrulanir() {
        cartPage.checkForProducts();
        LOGGER.info("Seçilen ürünün doğru olarak eklendiği ‘Sepetim’ sayfasında(Assertion) ile doğrulandı.");
    }


    @Given("^Secilen Urunler silinir ve favorilere eklenir$")
    public void secilen_urunler_silinir() {
        cartPage.deleteProductL();
        LOGGER.info("Seçilen Ürünler Silindi ve Favorilere eklendi.");
    }

    @Given("^Kullanici kimlik bilgileriyle oturum açar$")
    public void kullanici_kimlik_bilgileriyle_oturum_acar() {
        homePage.navigateToLogIn();
        loginPage.login();
        LOGGER.info("Kullanıcı Giriş İşlemi Yapılır(GMAIL ile Giriş).");

    }

    @Given("^Kullanici girisi ana sayfada dogrulanir$")
    public void kullanici_girisi_ana_sayfada_dogrulanir() {
        LOGGER.info("Yönlendirmeden sonra anasayfada(Assertion) ile kullanıcı giriş işleminin yapıldığı doğrulanır.");
        homePage.checkForLogin();
    }
}
