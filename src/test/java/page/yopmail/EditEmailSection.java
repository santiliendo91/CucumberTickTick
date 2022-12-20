package page.yopmail;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class EditEmailSection {


    public TextBox Contactmail = new TextBox(By.xpath("//input[@id=\"msgto\"]"));

    public TextBox mailSubject = new TextBox(By.id("msgsubject"));

    public TextBox mailBody = new TextBox(By.id("msgbody"));

    public Button sendMailBtn = new Button(By.id("msgsend"));

    public EditEmailSection(){}

}
