//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.layout.GridPane;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Rectangle;
//import javafx.stage.Stage;
//
//public class CheckerboardApp extends Application {
//
//    private static final int BOARD_SIZE = 8;
//    private static final int SQUARE_SIZE = 50;
//
//    @Override
//    public void start(Stage primaryStage) {
//        GridPane grid = new GridPane();
//
//        for (int row = 0; row < BOARD_SIZE; row++) {
//            for (int col = 0; col < BOARD_SIZE; col++) {
//                Color color = (row + col) % 2 == 0 ? Color.WHITE : Color.BLACK;
//
//                Rectangle square = new Rectangle(SQUARE_SIZE, SQUARE_SIZE, color);
//                grid.add(square, col, row);
//            }
//        }
//
//        Scene scene = new Scene(grid, BOARD_SIZE * SQUARE_SIZE, BOARD_SIZE * SQUARE_SIZE);
//        primaryStage.setScene(scene);
//        primaryStage.setTitle("Checkerboard in JavaFX");
//        primaryStage.show();
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}

