package page.todoistprojects;

import control.Label;
import org.openqa.selenium.By;

public class MainPage {
    public Label loginLabel = new Label(By.xpath("//ul/li/a[text()='Log in']"));
    public Label signUpFreeLabel = new Label(By.xpath("//div/ul/li/a[contains(text(),'Start for free')]"));
}
