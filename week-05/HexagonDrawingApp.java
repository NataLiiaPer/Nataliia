//import javafx.application.Application;
//import javafx.scene.Scene;

//import javafx.scene.layout.Pane;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Polygon;
//import javafx.stage.Stage;
//
//public class HexagonDrawingApp extends Application {
//
//    private static final double HEXAGON_RADIUS = 100.0;
//    private static final int NUM_SIDES = 6;
//
//    @Override
//    public void start(Stage primaryStage) {
//        Pane pane = new Pane();
//
//        double centerX = 200.0; // X-coordinate of the center of the hexagon
//        double centerY = 200.0; // Y-coordinate of the center of the hexagon
//
//        Polygon hexagon = new Polygon();
//        for (int i = 0; i < NUM_SIDES; i++) {
//            double angle = 2.0 * Math.PI * i / NUM_SIDES;
//            double x = centerX + HEXAGON_RADIUS * Math.cos(angle);
//            double y = centerY + HEXAGON_RADIUS * Math.sin(angle);
//            hexagon.getPoints().addAll(x, y);
//        }
//
//        hexagon.setFill(Color.TRANSPARENT);
//        hexagon.setStroke(Color.BLACK);
//
//        pane.getChildren().add(hexagon);
//
//        Scene scene = new Scene(pane, 400, 400);
//        primaryStage.setScene(scene);
//        primaryStage.setTitle("Regular Hexagon Drawing");
//        primaryStage.show();
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}

//    Что касается вычисления высоты правильного шестиугольника (расстояние между противоположными сторонами),
//    вы можете использовать формулу:
//
//        Высота = 2 * (длина стороны) * sqrt(3) / 2
//
//        Где длина стороны - это расстояние от центра шестиугольника до любой из его вершин.
//        В коде выше HEXAGON_RADIUS представляет половину длины стороны,
//        так что вы можете вычислить высоту с использованием указанной формулы.