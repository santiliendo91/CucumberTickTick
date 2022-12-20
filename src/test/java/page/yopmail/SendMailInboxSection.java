package page.yopmail;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class SendMailInboxSection {
    public Button newMailBtn = new Button(By.id("newmail"));

    public Button refreshBtn = new Button(By.id("refresh"));




    public SendMailInboxSection(){}

    public boolean isMailDisplayedInList(String mailAddress){
        Label receivedMail = new Label(By.xpath("(//button/div/span[contains(text(),'"+mailAddress+"')])[1]"));
        return receivedMail.isControlDisplayed();
    }


    }
