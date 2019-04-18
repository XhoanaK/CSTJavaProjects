package project9;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class courseRegistration extends Application {
	@Override

	public void start(Stage stage) {
		Label label = new Label("course registration");
		// Label for name
		Text nameLabel = new Text("Courses: ");

		Text myCoursesLabel = new Text("My Courses");

		ObservableList<String> items = FXCollections.observableArrayList("Java101", "English2", "CST1201", "CST3519");
		ListView<String> lv = new ListView<>(items);
		lv.setPrefSize(200, 90);
		
		
		Button removeButton = new Button("- Remove");
		removeButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				final int selectedIdx = lv.getSelectionModel().getSelectedIndex();
				if (selectedIdx != -1) {
					String itemToRemove = lv.getSelectionModel().getSelectedItem();

					final int newSelectedIdx = (selectedIdx == lv.getItems().size() - 1) ? selectedIdx - 1
							: selectedIdx;

					lv.getItems().remove(selectedIdx);

					lv.getSelectionModel().select(newSelectedIdx);
				}
			}
		});

		ComboBox<String> cbo = new ComboBox<>();
		cbo.getItems().addAll("CST 3613", "CST 3513", "CST 1201");
		cbo.setValue(cbo.getItems().get(0));

		Button addButton = new Button("+ ADD");

		addButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				// find selected item
				final int selectedIdx = cbo.getSelectionModel().getSelectedIndex();
				// add to new list

				if (selectedIdx != -1) {
					// find value for course to be added
					String itemToAdd = cbo.getValue();
					// add to other list
					items.add(itemToAdd);
				}
			}
		});

		Text selectYearLabel = new Text("Select your year: ");
		VBox paneForRadioButtons = new VBox(20);
		paneForRadioButtons.setPadding(new Insets(5, 5, 5, 5));
		paneForRadioButtons.setStyle("-fx-border-color: green");
		paneForRadioButtons.setStyle("-fx-border-width: 2px; -fx-border-color: green");
		ToggleGroup groupYear = new ToggleGroup();
		RadioButton rbFresh = new RadioButton("First");
		rbFresh.setToggleGroup(groupYear);
		RadioButton rbSoph = new RadioButton("Second");
		rbSoph.setToggleGroup(groupYear);
		RadioButton rbJunior = new RadioButton("Third");
		rbJunior.setToggleGroup(groupYear);
		RadioButton rbSenior = new RadioButton("Fourth");
		rbSenior.setToggleGroup(groupYear);

		paneForRadioButtons.getChildren().addAll(rbFresh, rbSoph, rbJunior, rbSenior);

		// Creating a Grid Pane
		GridPane gridPane = new GridPane();

		// Setting size for the pane
		gridPane.setMinSize(500, 500);

		// Setting the padding
		gridPane.setPadding(new Insets(10, 10, 10, 10));

		// Setting the vertical and horizontal gaps between the columns
		gridPane.setVgap(5);
		gridPane.setHgap(5);

		// Setting the Grid alignment
		gridPane.setAlignment(Pos.CENTER);

		// Arranging all the nodes in the grid
		gridPane.add(nameLabel, 0, 0);
		gridPane.add(cbo, 1, 0);
		gridPane.add(addButton, 1, 1);

		gridPane.add(selectYearLabel, 0, 2);
		gridPane.add(paneForRadioButtons, 1, 3);

		gridPane.add(myCoursesLabel, 0, 5);
		gridPane.add(lv, 1, 5);

		gridPane.add(removeButton, 2, 8);



		selectYearLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
		myCoursesLabel.setStyle("-fx-font: normal bold 15px 'serif' ");

		// Setting the back ground color
		gridPane.setStyle("-fx-background-color: BEIGE;");

		// Creating a scene object
		Scene scene = new Scene(gridPane);

		// Setting title to the Stage
		stage.setTitle("Registration Form");

		// Adding scene to the stage
		stage.setScene(scene);

		// Displaying the contents of the stage
		stage.show();
	}

	public static void main(String args[]) {
		launch(args);
	}
}
