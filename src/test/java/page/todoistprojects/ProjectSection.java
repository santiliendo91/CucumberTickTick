package page.todoistprojects;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;
import page.todoly.MenuProjectSection;

import java.awt.*;

public class ProjectSection {
    public MenuProjectSection menuProjectSection= new MenuProjectSection();
    public Button addNewProjectButton = new Button(By.xpath("//button[@aria-label='Add project']"));
    public TextBox nameProjectTxtBox= new TextBox(By.xpath("//input[contains(@id,\"edit_project_modal_field_name\")]"));
    public Button addButton = new Button(By.xpath("//button[contains(@type,\"submit\")]"));
    public Button moreButton = new Button(By.xpath("//button[contains(@aria-label,\"Project options menu\")]"));
    public Button editButton = new Button(By.xpath("//ul/li/div[contains(text(),'Edit project')]"));
    public Button deleteButton = new Button(By.xpath("//ul/li/div[contains(text(),'Delete project')]"));
    public Button saveButton= new Button(By.xpath("//button[contains(text(),'Save')]"));
    public Button confirmDeleteButton= new Button(By.xpath("//span[contains(text(),'Delete')]"));



    public ProjectSection(){}

    public void clickOnProject(String nameProject){
        Label projectCreated = new Label(By.xpath("//td[text()='"+nameProject+"']"));
        projectCreated.click();
    }

    public boolean isProjectDisplayedInList(String nameProject){
        Label projectCreated = new Label(By.xpath("//a/span[contains(text(),'"+nameProject+"')]"));
        return projectCreated.isControlDisplayed();
    }

    public Label getProject(String nameProject){
        Label projectCreated = new Label(By.xpath("//a/span[contains(text(),'"+nameProject+"')]"));
        return projectCreated;
    }
}
