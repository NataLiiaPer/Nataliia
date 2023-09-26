package Enum;
import java.util.*;

public class Car {
    private Color color;
    private CarType type;
    public Car (Color color,CarType type){
        this.color = color;
        this.type = type;
    }

    public Color getColor() {
        return color;
    }

    public CarType getType() {
        return type;
    }

    @Override
    public String toString() {
        return type.toString()+" "+color.toString();
    }
}







//    Create a Car class with 2 enum properties
//    enum of car types
//    The types of these cars or vehicles is up to you
//    enum of colors
//    Create 256 Vehicles randomly and put them into a List
//    Count and Print the number of same vehicles for each type
//    Count and Print the number of same vehicles for each color
//    Print the most frequently occurring vehicle