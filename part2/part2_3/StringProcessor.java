package part2.part2_3;

public class StringProcessor {
    private static final String VOWELS = "aeiouyаеёиоуыэюя";

    public static int countVowels(String text) {
        // TODO: посчитайте русские и английские гласные.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        int count = 0;
        String LT = text.toLowerCase();
        for (int i = 0; i < LT.length(); i++) {
            if (VOWELS.indexOf(LT.charAt(i)) != -1) {
                count++ ;
            }
        }
        return count;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static boolean isPalindrome(String text) {
        // TODO: палиндром без учета регистра и знаков препинания.
        // Подсказка: сравнение символов с двух концов.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        String clean = text.toLowerCase();
        int lt = 0;
        int rt = clean.length() - 1;
        while (lt < rt) {
            if (clean.charAt(lt) != clean.charAt(rt)) {
                return false;
            }
            lt++;
            rt--;
        }
        return true;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static String reverse(String text) {
        // TODO: реверс без StringBuilder.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        char[] chars = text.toCharArray();
        int lt = 0, rt = chars.length - 1;
        while (lt < rt) {
            char var_ch = chars[lt];
            chars[lt] = chars[rt];
            chars[rt] = var_ch;
            lt++;
            rt--;
        }
        return new String(chars);
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static String findLongestWord(String sentence) {
        // TODO: найдите самое длинное слово.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        String[] words = sentence.split("[\\s,.-]+");
        String bgi_word = "";
        for (String word : words) {
            if (word.length() > bgi_word.length()) {
                bgi_word = word;
            }
        }
        return bgi_word;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static void main(String[] args) {
        String s1 = "Привет, Java-разработчик!";
        String s2 = "топот";
        String s3 = "Madam";
        String s4 = "hello";
        String s5 = "А роза упала на лапу Азора";
        String s6 = "The quick brown fox jumps over the lazy dog";

        System.out.println("Гласные: " + countVowels(s1));
        System.out.println("Палиндром (топот): " + isPalindrome(s2));
        System.out.println("Палиндром (Madam): " + isPalindrome(s3));
        System.out.println("Реверс (hello): " + reverse(s4));
        System.out.println("Палиндром (фраза): " + isPalindrome(s5));
        System.out.println("Самое длинное слово: " + findLongestWord(s6));
    }
}
