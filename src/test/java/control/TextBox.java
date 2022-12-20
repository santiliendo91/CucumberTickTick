package control;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class TextBox extends Control{
    public TextBox(By locator) {
        super(locator);
    }

    public void setText(String value){
        this.find();
        this.control.sendKeys(value);
    }

    public void cleanSetText(String value) {
        this.find();
        this.control.clear();
        this.control.sendKeys(value);
    }
    public void selectText(String value){
        this.find();
        this.control.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        this.control.sendKeys(" ");
    }

    public void sendTab(){
        this.find();
        this.control.sendKeys(Keys.chord(Keys.TAB));
    }

    public void clearText(String value) {
        this.find();
        this.control.clear();
        this.control.sendKeys("");
    }


}
