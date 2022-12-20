package page.todoistprojects;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginSection {
    public TextBox emailTxtBox = new TextBox(By.xpath("//input[contains(@placeholder, \"Enter your email\")]"));
    public TextBox passwordTxtBox = new TextBox(By.xpath("//input[contains(@placeholder, \"Enter your password...\")]"));
    public Button loginButton= new Button(By.xpath("//button[contains(@type,\"submit\")]"));


    public void login(String user, String pwd){
        emailTxtBox.setText(user);
        passwordTxtBox.setText(pwd);
        loginButton.click();
    }
}
