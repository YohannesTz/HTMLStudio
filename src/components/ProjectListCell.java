package components;

import com.sun.tools.javac.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.HBox;
import model.Project;

import java.io.IOException;

/**
 * Created by new on 12-Aug-19.
 */
public class ProjectListCell extends ListCell<Project>{
    @FXML
    private Label project_location_label;
    @FXML
    private ToggleButton favorite_toggle_btn;
    @FXML
    private Label project_name_label;
    @FXML
    private HBox cell_hbox;

    public static boolean showtoggle = true;
    private FXMLLoader fxmlLoader;
    @Override
    protected void updateItem(Project project, boolean empty){
        super.updateItem(project, empty);
        if(empty || project == null){
            setText(null);
            setGraphic(null);
        }else{
            if(fxmlLoader == null){
                fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/projectlistcell.fxml"));
                fxmlLoader.setController(this);

                try{
                    fxmlLoader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            project_name_label.setText(project.getProjectName());
            project_location_label.setText(project.getProjectLocation());
            favorite_toggle_btn.setVisible(showtoggle);
            if(project.isFavorite()){
                favorite_toggle_btn.setSelected(true);
            }else{
                favorite_toggle_btn.setSelected(false);
            }
            setText(null);
            setGraphic(cell_hbox);
        }
    }

    public void showToggle(boolean togglebtnVisiblity){
        togglebtnVisiblity = showtoggle;
    }

}
