/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ItemViewController {

    @FXML
    private Button addButton;
    @FXML
    private CheckMenuItem allOption;
    @FXML
    private CheckBox completeCheckbox;
    @FXML
    private CheckMenuItem completeOption;
    @FXML
    private DatePicker datePicker;
    @FXML
    private MenuButton fileButton;
    @FXML
    private Button homeButton;
    @FXML
    private CheckMenuItem incompleteOption;
    @FXML
    private TextField itemTextField;
    @FXML
    private MenuItem loadMenuOption;
    @FXML
    private Button renameButton;
    @FXML
    private MenuItem saveMenuOption;
    @FXML
    private MenuButton sortByDropdown;
    @FXML
    private ListView<String> todoItemView;

    @FXML
    void onAddButtonPressed(ActionEvent event) {
        //ButtonHandler.AddButton(todoListView, itemTextField);
    }

    @FXML
    void onItemListClicked(MouseEvent event) {
                /*todoListView.setOnMouseClicked(new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                                if(event.getButton() == MouseButton.PRIMARY && event.getClickCount() == 2)
                                {
                                        String selectedItem = todoListView.getSelectionModel().getSelectedItem();
                                        System.out.println(selectedItem);

                                        stage.Load("ListView.fxml");
                                }
                        }
                });*/
    }

    @FXML
    void onCompleteCheckbox(ActionEvent event) {

    }

    @FXML
    void onAllOptionSelected(ActionEvent event) {

    }

    @FXML
    void onIncompleteOptionSelected(ActionEvent event) {

    }

    @FXML
    void onCompleteOptionSelected(ActionEvent event) {

    }

    @FXML
    void onDatePickerAction(ActionEvent event) {
        //Item item = new Item();
        //item.setDate(datePicker.getValue());
    }

    @FXML
    void onHomeButtonPressed(ActionEvent event) {
        //ButtonHandler.HomeButton();
    }

    @FXML
    void onLoadPressed(ActionEvent event) {
        //ButtonHandler.Load(file);
    }

    @FXML
    void onRenameButtonPressed(ActionEvent event) {
        //ButtonHandler.Rename(todoListView.getSelectionModel().getSelectedItem());
    }

    @FXML
    void onSavePressed(ActionEvent event) {
        //ButtonHandler.Save(todoListView);
    }

}
