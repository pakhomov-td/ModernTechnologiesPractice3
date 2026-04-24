package part1.part1_3;

import java.util.Arrays;

public class ObjectDescriber {

    public static String describe(Object obj) {
        // TODO: используйте switch с pattern matching (Java 17+ preview).
        // Подсказка 1: обработайте null отдельным case.
        // Подсказка 2: для Integer укажите "положительное" или "не положительное".
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        return switch (obj) {
            case null -> "равно null";
            case Integer i when i > 0 -> "integer, положительное число (" + i + ")";
            case Integer i -> "integer, не положительное число (" + i + ")";
            case String s when s.isEmpty() -> "строка пустая";
            case String s -> "строка: " + s;
            case Double d -> "число Double: " + d;
            case int[] arr -> "массив: " + Arrays.toString(arr);
            default -> "неизвестный тип " + obj.toString();
        };
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static void main(String[] args) {
        Object[] samples = {null, 42, -5, "", "Привет", 3.14, new int[]{1, 2, 3}, true};
        for (Object sample : samples) {
            System.out.println(describe(sample));
        }
        // Проверь себя: пустая строка и непустая строка должны различаться.
        // Типичные ошибки: забывают обработать default.
    }
}
