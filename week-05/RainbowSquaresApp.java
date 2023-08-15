//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.layout.Pane;
//import javafx.scene.paint.Color;
//import javafx.stage.Stage;
//
//public class RainbowSquaresApp extends Application {
//
//    private static final int CANVAS_WIDTH = 800;
//    private static final int CANVAS_HEIGHT = 600;
//    private static final int SQUARE_SIZE = 50;
//
//    @Override
//    public void start(Stage primaryStage) {
//        Pane pane = new Pane();
//
//        for (int y = 0; y < CANVAS_HEIGHT; y += SQUARE_SIZE) {
//            for (int x = 0; x < CANVAS_WIDTH; x += SQUARE_SIZE) {
//                Color color = getColorFromRainbow(x, y);
//                javafx.scene.shape.Rectangle square = new javafx.scene.shape.Rectangle(x, y, SQUARE_SIZE, SQUARE_SIZE);
//                square.setFill(color);
//                pane.getChildren().add(square);
//            }
//        }
//
//        Scene scene = new Scene(pane, CANVAS_WIDTH, CANVAS_HEIGHT);
//        primaryStage.setScene(scene);
//        primaryStage.setTitle("Rainbow Colored Squares");
//        primaryStage.show();
//    }
//
//    private Color getColorFromRainbow(int x, int y) {
//        double hue = (double) (x + y) / (CANVAS_WIDTH + CANVAS_HEIGHT);
//        return Color.hsb(hue * 360.0, 1.0, 1.0);
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}
//
