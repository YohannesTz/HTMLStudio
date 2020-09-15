package controller;

import components.ProjectListCell;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import model.Project;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class Welcome implements Initializable {

    @FXML
    public ListView<Project> project_list;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<Project> projectList = FXCollections.observableArrayList();
        projectList.add(new Project("NewProject", "C:\\somewhere\\some\\where", false));
        projectList.add(new Project("NewProject2", "C:\\somewhere\\some\\where", true));
        projectList.add(new Project("NewProject3", "C:\\somewhere\\some\\where", true));
        projectList.add(new Project("NewProject4", "C:\\somewhere\\some\\where", false));
        project_list.setItems(projectList);
        project_list.setCellFactory(projectListView -> new ProjectListCell());
    }
}
