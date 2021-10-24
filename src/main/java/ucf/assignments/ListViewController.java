/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

public class ListViewController {
        @FXML
        private Button addButton;
        @FXML
        private MenuItem deleteItem;
        @FXML
        private MenuButton fileButton;
        @FXML
        private TextField listTextField;
        @FXML
        private MenuItem loadMenuOption;
        @FXML
        private Button renameButton;
        @FXML
        private MenuItem saveAllMenuOption;
        @FXML
        private ListView<String> todoListView;

        @FXML
        void onAddButtonPressed(ActionEvent event) {
                ButtonHandler bh = new ButtonHandler();
                bh.AddButton(todoListView, listTextField);
                listTextField.clear();
        }

        @FXML
        void onListCellClicked(MouseEvent event) {
                /*todoListView.setOnMouseClicked(new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                                if(event.getButton() == MouseButton.PRIMARY && event.getClickCount() == 2)
                                {
                                        String selectedItem = todoListView.getSelectionModel().getSelectedItem();
                                        System.out.println(selectedItem);

                                        stage.Load("ItemView.fxml");
                                }
                        }
                });*/
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

        @FXML
        void onDelete(ActionEvent event) {
                //int index = todoListView.getSelectionModel().getSelectedIndex();
                //todoListView.getSelectionModel().getSelectedIndices().remove(index);
        }
}