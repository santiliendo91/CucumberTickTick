package page.todoistprojects;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class TaskSection {
    public TaskSection(){}

    public Button addTaskButton = new Button(By.xpath("//button[contains(@data-add-task-navigation-element,'true')]"));

    public TextBox taskName = new TextBox(By.xpath("//div[@role=\"textbox\"]/div/div/div"));

    public TextBox taskDesc = new TextBox(By.xpath("//textarea[contains(@aria-invalid,'false')]"));

    public Button tomorrowButton = new Button(By.xpath("//button[contains(@data-track,'scheduler|date_shortcut_tomorrow')]"));

    public Button sendAddTaskBtn = new Button(By.xpath("//span[contains(text(),'Add task')]"));

    public Button clickTasktoEdit = new Button(By.xpath("//div[contains(@class,\"markdown_content task_content\")]"));

    public Button clickTaskNametoEdit = new Button(By.xpath("//div[contains(@aria-label,'Task name')]"));

    public TextBox EditTaskName = new TextBox(By.xpath("//span[contains(@data-text,'true')]"));

    public Button SendEditTaskBtn =  new Button(By.xpath("//span[contains(text(),'Save')]"));

    public Button closeModal = new Button(By.xpath("//button[contains(@aria-label,'Close modal')]"));

    public Button moreTaskOptions = new Button(By.xpath("//button[contains(@aria-label,\"More actions\")]"));

    public Button deleteTaskButton = new Button(By.xpath("//div[contains(text(),'Delete task')]"));

    public Button confirmTaskDeleteButton = new Button(By.xpath("//span[contains(text(),'Delete')]"));

    public boolean isTaskDisplayedOnList(String taskNameProject){
        Label taskCreated = new Label(By.xpath("//div[contains(text(),'"+taskNameProject+"')]"));
        return taskCreated.isControlDisplayed();
    }

    public Label getTask(String taskNameProject){
        Label taskCreated = new Label(By.xpath("//td[text()='"+taskNameProject+"']"));
        return taskCreated;
    }
}
