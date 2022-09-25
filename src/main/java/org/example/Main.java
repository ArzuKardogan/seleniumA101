package org.example;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();  
        driver.get("https://www.a101.com.tr/");
        //
        WebElement cookie= driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"));
        cookie.click();

        WebElement giyim = driver.findElement(By.linkText("Giyim & Aksesuar"));
        giyim.click();

        WebElement kadinIcGiyim = driver.findElement(By.linkText("Kadın İç Giyim"));
        kadinIcGiyim.click();
        TimeUnit.SECONDS.sleep(2); 


        WebElement dizAltiCorap = driver.findElement(By.linkText("Dizaltı Çorap"));
        dizAltiCorap.click();
        TimeUnit.SECONDS.sleep(2);

        WebElement siyahCorap = driver.findElement(By.xpath("/html/body/section/section[4]/div[3]/div[2]/div/div[2]/div[2]/div/ul/li[1]/article/a/div/header/hgroup/h3"));
        siyahCorap.click();

        WebElement sepeteEkle = driver.findElement(By.cssSelector("body > section > section.page-product.js-product-container.js-product-init > div.container > div.content > div > div.row > div.col-sm-3 > div.product-buy-info.js-product-buy-info > button"));
        sepeteEkle.click();

        WebElement sepetiGoruntule = driver.findElement(By.linkText("Sepeti Görüntüle"));
        sepetiGoruntule.click();

        WebElement sepetiOnayla = driver.findElement(By.linkText("Sepeti Onayla"));
        sepetiOnayla.click();

        WebElement uyeOlmadanDevam = driver.findElement(By.linkText("ÜYE OLMADAN DEVAM ET"));
        uyeOlmadanDevam.click();

        WebElement eposta = driver.findElement(By.cssSelector("body > section > div.page-auth > div > div.row.js-block-email > div > div > form > div.field > input"));
        eposta.sendKeys("denemepostasi@gmail.com");

        WebElement devamEt = driver.findElement(By.cssSelector("body > section > div.page-auth > div > div.row.js-block-email > div > div > form > button"));
        devamEt.click();

        WebElement adresOlustur = driver.findElement(By.linkText("Yeni adres oluştur"));
        adresOlustur.click();

        WebElement adresBasligi = driver.findElement(By.cssSelector("#js-orders-modal-container > div > div.modal-content > form > div:nth-child(3) > div > div > label > input[type=text]"));
        adresBasligi.sendKeys("ev adresi");

        WebElement ad = driver.findElement(By.cssSelector("#js-orders-modal-container > div > div.modal-content > form > div:nth-child(4) > div:nth-child(1) > div > label > input[type=text]"));
        ad.sendKeys("adım");

        WebElement soyAd = driver.findElement(By.cssSelector("#js-orders-modal-container > div > div.modal-content > form > div:nth-child(4) > div:nth-child(2) > div > label > input[type=text]"));
        soyAd.sendKeys("soy adım");

        WebElement telNo = driver.findElement(By.cssSelector("#js-orders-modal-container > div > div.modal-content > form > div:nth-child(5) > div > div > label > input"));
        telNo.sendKeys("05058586565");

        Select sehirSecimi = new Select(driver.findElement(By.cssSelector("#js-orders-modal-container > div > div.modal-content > form > div:nth-child(7) > div:nth-child(1) > div > label > div > select")));
        sehirSecimi.selectByVisibleText("ANKARA");
        //driver.close();

        
    }
}