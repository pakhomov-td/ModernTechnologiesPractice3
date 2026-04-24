package part4.part4_2;

public class Square extends Rectangle {
    public Square(String color, double side) {
        super(color, side, side);
    }

    @Override
    public void draw() {
        // TODO: выведите слово "квадрат" вместо "прямоугольник".
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        System.out.println("Рисую " + color + " квадрат со стороной " + width);
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }
}
