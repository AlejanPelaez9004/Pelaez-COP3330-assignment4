/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package ucf.assignments;

import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.File;
import java.util.List;

public class ButtonHandler implements FileInterface {
    @Override
    public void Save(List<String> list) {

    }

    @Override
    public List<String> Load(File file) {
        return null;
    }

    public void AddButton(ListView<String> todoListView, TextField listTextField)
    {
        String name = listTextField.getCharacters().toString();
        todoListView.getItems().add(name);
    }

    public String Rename(String currentName)
    {
        return null;
    }

    public void HomeButton()
    {

    }
}
