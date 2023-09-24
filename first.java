public class first {+
    public static void main(String[] arg) {
        System.out.println(format("Mur", 7, "alg"));
    }
    static boolean equals(String s, String t) {
        // проверить, что строки совпадают без учета регистра
        return s.equalsIgnoreCase(t);
    }

    static String replace(String str, String oldStr, String newStr) {
        // в строке str все вхождения oldStr заменить на newStr
        return str.replace(oldStr, newStr);
    }

    static String format(String surname, int mark, String subject) {
        // вернуть строку, используя форматирование: Студент [Фамилия] получил [оценка] по [предмету]
        return "Студент " + surname + " получил " + mark + " по " + subject;
    }

    //static boolean isPalindrome(String str) {
        // проверить, является ли строка палиндромом
    //}
}
