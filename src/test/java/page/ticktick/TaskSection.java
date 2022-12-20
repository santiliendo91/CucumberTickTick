package page.ticktick;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class TaskSection {

    public Label inboxLabel = new Label(By.xpath("//h5[contains(text(),'Inbox')]"));

    public Label AddListLabel = new Label(By.xpath("//h1[contains(text(),'Add List')]"));

    public Button addListButton = new Button(By.xpath("//section[1]/div[1]/li/a/button[2]"));

    public TextBox inputListName = new TextBox(By.xpath("//input[@id='edit-project-name']"));

    public Button openColorSelector = new Button(By.xpath("//div/div[2]/div/div/div[2]/div/div/div/div"));

    public Button colorSelect = new Button(By.xpath("//div[16]/div[2]/div/div/div[1]/div[1]"));

    public Label outBound = new Label(By.xpath("//body/div[14]/div/div/div[1]/h1"));

    public Button saveBtn = new Button(By.xpath("//button[contains(text(),'Save')]"));

    public Button moreBtn = new Button(By.cssSelector("#project-ul > div > li > div > button > div.flex-none.flex.items-center.min-w-\\[24px\\].justify-end.relative.z-0 > div > svg > use"));

    public Label editOption = new Label(By.xpath("//a[contains(text(),'Edit')]"));

    public Label deleteOption = new Label(By.xpath("//a[contains(text(),'Delete')]"));

    public Button confirmDelete = new Button(By.xpath("//button[contains(.,'Delete')]"));

    public boolean TaskListDisplayedonList(String taskListName){
        Label createdList = new Label(By.xpath("//div[1]/li/div/button/p[contains(text(),'"+taskListName+"')]"));
        return createdList.isControlDisplayed();
    }




}
