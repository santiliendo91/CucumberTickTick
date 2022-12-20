package testSuite.ticktick;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import session.Session;
import util.GetProperties;

import java.util.Date;

public class CrudTickTick extends TestBase{

    @BeforeEach @Before
    public void openBrowser(){
        // todo create property file
        Session.getInstance().getBrowser().get(GetProperties.getInstance().getHost());
    }

    @AfterEach @After
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }
    String taskListName = "TestList"+new Date().getTime();
    String taskListNameUp = "TestListUpdated"+new Date().getTime();

    @Given("Accedo al home page de  TickTick y me logueo al mismo")
    public void loginTicktick(){
        mainPage.loginLabel.click();
        // login
        loginSection.emailTxtBox.setText(user);
        loginSection.passwordTxtBox.setText(password);
        loginSection.loginButton.click();
    }
    @And("Creo y guardo lista")
    public void createList(){
        taskSection.addListButton.click();
        taskSection.inputListName.setText(taskListName);
        taskSection.saveBtn.click();
    }

    @Then("reviso que se creó correctamente la lista")
    public void checkCreatedList(){
        Assertions.assertTrue(taskSection.TaskListDisplayedonList(taskListName),"Error");
    }

    @And("Edito y guardo una lista existente")
    public void EditList(){
        taskSection.moreBtn.click();
        taskSection.editOption.click();
        taskSection.inputListName.clearText("");
        taskSection.inputListName.setText(taskListNameUp);
        taskSection.saveBtn.click();
    }
    @Then("reviso que se editó correctamente la lista")
    public void checkEditedList(){
        Assertions.assertTrue(taskSection.TaskListDisplayedonList(taskListNameUp),"Error");
    }


    @And("Elimino la lista editada")
    public void DeleteList(){
        taskSection.moreBtn.click();
        taskSection.deleteOption.click();
        taskSection.confirmDelete.click();
    }

    @Then("reviso que se eliminó correctamente la lista")
    public void checkDeletedList(){
        Assertions.assertFalse(taskSection.TaskListDisplayedonList(taskListNameUp), "Error");
    }

   @Test
    public void CrudTickTickApp() {
       String taskListName = "TestList"+new Date().getTime();
       String taskListNameUp = "TestListUpdated"+new Date().getTime();
       //navegar a tick tick
       mainPage.loginLabel.click();
       // login
       loginSection.emailTxtBox.setText(user);
       loginSection.passwordTxtBox.setText(password);
       loginSection.loginButton.click();
        //task page
        //addlist
        taskSection.addListButton.click();
        taskSection.inputListName.setText(taskListName);
        taskSection.saveBtn.click();
        Assertions.assertTrue(taskSection.TaskListDisplayedonList(taskListName),"Error");
        //editList
        taskSection.moreBtn.click();
        taskSection.editOption.click();
        taskSection.inputListName.clearText("");
        taskSection.inputListName.setText(taskListNameUp);
        taskSection.saveBtn.click();
        Assertions.assertTrue(taskSection.TaskListDisplayedonList(taskListNameUp),"Error");
        //deleteList
        taskSection.moreBtn.click();
        taskSection.deleteOption.click();
        taskSection.confirmDelete.click();
        Assertions.assertFalse(taskSection.TaskListDisplayedonList(taskListNameUp), "Error");

    }
}
