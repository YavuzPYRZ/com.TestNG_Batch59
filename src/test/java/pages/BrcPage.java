package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class BrcPage {
    public BrcPage() {   //bir page class'i olusturuldugunda yapilmasi gereken ilk sey bir constructor olusturmak ve
        //   diger classlardan ulasabilmek icin public yapariz
        PageFactory.initElements(Driver.getDriver(), this);   //ve driver'imizin bu class'ta gecerli oldugunu soylemek
    }  //bundaan sonra da istedigimiz locate'leri @FindBy notasyonu ile yapmaliyiz
    @FindBy(xpath = "(//a[@role='button'])[1]")
    public WebElement ilkLoginButonu;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailTextBox;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordTextBox;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement ikinciLoginButonu;
    @FindBy(id = "dropdown-basic-button")
    public WebElement kullaniciProfilIsmi;
}