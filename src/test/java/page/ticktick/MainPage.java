package page.ticktick;

import control.Label;
import org.openqa.selenium.By;

public class MainPage {
    public MainPage(){}
    public Label loginLabel = new Label(By.xpath("//ul/li[5]/a[contains(text(),'Sign In')]"));

}
