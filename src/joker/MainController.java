
package joker;

        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import javafx.scene.control.TextArea;

        import java.awt.event.ActionEvent;

public class MainController {
    int number=0;
    @FXML
    private Label label4;

    @FXML
    private Label label5;

    @FXML
    private Label label6;

    @FXML
    private Label label7;

    @FXML
    private Label label8;

    @FXML
    private Label label9;

    @FXML
    private Button beginButton;

    @FXML
    private Button ButtonKeep;

    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    private Label label3;

    @FXML
    public void onButtonBegin(javafx.event.ActionEvent event){
        fun.deal();
        label1.setText(String.valueOf(fun.append.get(number)));
        number++;
        label2.setText(String.valueOf(fun.append.get(number)));
        number++;
        label3.setText(String.valueOf(fun.append.get(number)));
        number++;
        label4.setText(String.valueOf(fun.append.get(number)));
        number++;
        label5.setText(String.valueOf(fun.append.get(number)));
        number++;
        label6.setText(String.valueOf(fun.append.get(number)));
        number++;
        label7.setText(String.valueOf(fun.append.get(number)));
        number++;
        label8.setText(String.valueOf(fun.append.get(number)));
        number++;
        label9.setText(String.valueOf(fun.append.get(number)));
        number++;
    }

}

