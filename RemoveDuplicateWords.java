import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.StringJoiner;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку с повторяющимися словами: ");
        String input = scanner.nextLine();

        String result = removeDuplicateWords(input);
        System.out.println("Результат: " + result);
    }

    public static String removeDuplicateWords(String input) {
        // Разбиваем строку на массив слов
        String[] words = input.split("\\s+");

        // Используем LinkedHashSet для сохранения уникальности и порядка
        LinkedHashSet<String> uniqueWords = new LinkedHashSet<>();
        for (String word : words) {
            uniqueWords.add(word);
        }

        // Собираем результат обратно в строку
        StringJoiner joiner = new StringJoiner(" ");
        for (String word : uniqueWords) {
            joiner.add(word);
        }

        return joiner.toString();
    }
}