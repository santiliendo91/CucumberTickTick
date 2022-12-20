package page.yopmail;

import com.sun.tools.javac.Main;
import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class MainPage {
    public MainPage(){}
    public TextBox inputMailField = new TextBox(By.xpath("//input[contains(@title,'Login')]"));
    public Button sendButton = new Button(By.id("refreshbut"));

}
