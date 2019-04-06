import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class page extends Abstract{
       public void getButtonClick() throws InterruptedException {
           // Nawbardan axtaris sehifesine getmek
           driver.findElement(By.linkText("Axtarış")).click();

           // Selecten elan novunu secmek
           driver.findElement(By.cssSelector("#elan_nov")).click();
           Select selectElanNov=new Select(driver.findElement(By.id("elan_nov")));
           selectElanNov.selectByVisibleText("Satılır");

           // Selecten emlak novunu secmek
           driver.findElement(By.cssSelector("#emlak")).click();
           Select selectEmlakNov=new Select(driver.findElement(By.id("emlak")));
           selectEmlakNov.selectByVisibleText("Bina ev menzil");

           // Selecten seher secmek
           driver.findElement(By.cssSelector("#seher")).click();
           Select selectSeherNov=new Select(driver.findElement(By.id("seher")));
           selectSeherNov.selectByVisibleText("Bakı");
           Thread.sleep(1000);

           // Selecten rayon secmek
           driver.findElement(By.cssSelector("#rayon_v")).click();
           Select selectRayonNov=new Select(driver.findElement(By.id("rayon_v")));
           selectRayonNov.selectByVisibleText("Binəqədi rayonu");
           Thread.sleep(1000);

           // Selecten menteqe secmek
           driver.findElement(By.cssSelector("#menteqe_v")).click();
           Select selectMenteqeNov=new Select(driver.findElement(By.id("menteqe_v")));
           selectMenteqeNov.selectByVisibleText("8-ci mikrorayon");
           Thread.sleep(1000);

           // Selecten metro secmek
           driver.findElement(By.cssSelector("#metro_v")).click();
           Select selectMetroNov=new Select(driver.findElement(By.id("metro_v")));
           selectMetroNov.selectByVisibleText("Gənclik");
           Thread.sleep(1000);

           // Selecten menzil nov secmek
           driver.findElement(By.cssSelector("#menzil_nov > select")).click();
           Select selectMenzilNov=new Select(driver.findElement(By.name("menzil_nov")));
           selectMenzilNov.selectByVisibleText("Yeni tikili");

           // Selecten menzil mertebe sayi from secmek
           driver.findElement(By.cssSelector("#mertebe_sayi > select:nth-child(2)")).click();
           Select selectMertebeFrom=new Select(driver.findElement(By.name("mertebe_sayi")));
           selectMertebeFrom.selectByVisibleText("5");

           // Selecten menzil mertebe sayi to secmek
           driver.findElement(By.cssSelector("#mertebe_sayi > select:nth-child(3)")).click();
           Select selectMertebeSayiTo=new Select(driver.findElement(By.name("mertebe_sayi2")));
           selectMertebeSayiTo.selectByVisibleText("20");

           // Selecten menzil yerlesdiyi mertebe from secmek
           driver.findElement(By.cssSelector("#mertebe > select:nth-child(2)")).click();
           Select selectYerlesdiyiMertebeFrom=new Select(driver.findElement(By.name("mertebe")));
           selectYerlesdiyiMertebeFrom.selectByVisibleText("2");

           // Selecten menzil yerlesdiyi mertebe to secmek
           driver.findElement(By.cssSelector("#mertebe > select:nth-child(3)")).click();
           Select selectYerlesdiyiMertebeTo=new Select(driver.findElement(By.name("mertebe2")));
           selectYerlesdiyiMertebeTo.selectByVisibleText("14");

           // Selecten otaq sayi from secmek
           driver.findElement(By.cssSelector("#otaq > select:nth-child(2)")).click();
           Select selectOtaqSayiFrom=new Select(driver.findElement(By.name("otaq")));
           selectOtaqSayiFrom.selectByVisibleText("2");

           // Selecten otaq sayi to secmek
           driver.findElement(By.cssSelector("#otaq > select:nth-child(3)")).click();
           Select selectOtaqSayiTo=new Select(driver.findElement(By.name("otaq2")));
           selectOtaqSayiTo.selectByVisibleText("4");

           // Qiymet from secmek
           driver.findElement(By.id("qiymet")).sendKeys("40000");

           // Qiymet To secmek
           driver.findElement(By.id("qiymet2")).sendKeys("100000");

           // Selecten EmlakinSened novunu secmek
           driver.findElement(By.cssSelector("#elan_nov")).click();
           Select selectEmlakinSenedNov=new Select(driver.findElement(By.name("sened")));
           selectEmlakinSenedNov.selectByVisibleText("Kupça");

           // Cekboks da secili etmek
           driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td/form/label[16]/label/span")).click();
           Thread.sleep(1000);

           // Button click etmek
           driver.findElement(By.className("button")).click();
    }
}
