/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;

public class MainViewController {
        @FXML
        private Button addButton;

        @FXML
        private MenuButton fileButton;

        @FXML
        private TextField listTextField;

        @FXML
        private MenuItem loadMenuOption;

        @FXML
        private Button renameButton;

        @FXML
        private MenuItem saveMenuOption;

        @FXML
        private ListView<?> todoListView;

        @FXML
        void onAddButtonPressed(ActionEvent event) {

        }

        @FXML
        void onListCellClicked(MouseEvent event) {

        }

        @FXML
        void onLoadPressed(ActionEvent event) {

        }

        @FXML
        void onRenameButtonPressed(ActionEvent event) {

        }

        @FXML
        void onSavePressed(ActionEvent event) {

        }

        @FXML
        void openDeleteMenu(ContextMenuEvent event) {

        }
}