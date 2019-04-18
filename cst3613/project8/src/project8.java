
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class project8 extends Application {
  @Override
  
  public void start(Stage primaryStage) {
    FlowPane pane = new FlowPane();
    pane.setHgap(2);
    final TextField tfNumber1 = new TextField();
    final TextField tfNumber2 = new TextField();
    final TextField tfResult = new TextField();
    tfNumber1.setPrefColumnCount(3);
    tfNumber2.setPrefColumnCount(3);
    tfResult.setPrefColumnCount(3);
    
    pane.getChildren().addAll(new Label("Number 1: "), tfNumber1,
      new Label("Number 2: "), tfNumber2, new Label("Result: "), tfResult);
    
 
    HBox hBox = new HBox(5);
    Button btAdd = new Button("Add");
    Button btSubtract = new Button("Subtract");
    Button btMultiply = new Button("Multiply");
    Button btDivide = new Button("Divide");
    hBox.setAlignment(Pos.CENTER);
    hBox.getChildren().addAll(btAdd, btSubtract, btMultiply, btDivide);
    
    BorderPane borderPane = new BorderPane();
    borderPane.setCenter(pane);
    borderPane.setBottom(hBox);
    BorderPane.setAlignment(hBox, Pos.TOP_CENTER);

  
    Scene scene = new Scene(borderPane, 400, 90);
    primaryStage.setTitle("Project 8"); 
    primaryStage.setScene(scene); 
    primaryStage.show(); 
    
   
    btAdd.setOnAction(new EventHandler<ActionEvent>() {
        @Override // Override the handle method
        public void handle(ActionEvent e) {
        	 tfResult.setText(Double.parseDouble(tfNumber1.getText()) + 
        	        Double.parseDouble(tfNumber2.getText()) + "");        }
      });

  
    btSubtract.setOnAction(new EventHandler<ActionEvent>() {
    	@Override
    	public void handle(ActionEvent e) {  //create handle method
    		
    		 tfResult.setText(Double.parseDouble(tfNumber1.getText()) -
    		        Double.parseDouble(tfNumber2.getText()) + "");
    	}
    	
    });
    
    btMultiply.setOnAction(new EventHandler<ActionEvent>() {
    	@Override
    	public void handle(ActionEvent e) {
      tfResult.setText(Double.parseDouble(tfNumber1.getText()) *
    		  Double.parseDouble(tfNumber2.getText()) + "");
    }
    });

    btDivide.setOnAction(new EventHandler<ActionEvent>() {
    	public void handle(ActionEvent e) {
      tfResult.setText(Double.parseDouble(tfNumber1.getText()) /
        Double.parseDouble(tfNumber2.getText()) + "");
    }
    });
  }


  public static void main(String[] args) {
    launch(args);
  }
} 

