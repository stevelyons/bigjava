import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
  public static void main(String[] args) {
    launch(args);
  }
  
  @Override
  public void start(Stage primaryStage) {
    PieChart pieChart = new PieChart();
    pieChart.setData(getChartData());
    pieChart.setTitle("Title");
    pieChart.setLegendSide(Side.LEFT);
    pieChart.setClockwise(false);
    pieChart.setLabelsVisible(false);
    
    StackPane root = new StackPane();
    root.getChildren().add(pieChart);
    primaryStage.setScene(new Scene(root, 300, 250));
    primaryStage.show();
  }

  private ObservableList<Data> getChartData() {
    ObservableList<Data> answer = FXCollections.observableArrayList();
    answer.addAll(new PieChart.Data("java", 17.56),
            new PieChart.Data("JavaFx",31.37 )
            );
    return answer;
  }
  
  
}
