public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Ф.И.О. сотрудника - " + fullName + ".");

        System.out.println("Задание 2");

        String fullName1 = "ivanov ivan ivanovich";
        System.out.println(fullName1.toUpperCase());

        System.out.println("Задание 3");
        String fullName2 = "Иванов Сёмен Семёнович";
        fullName2 = fullName2.replace("ё", "е");
        System.out.println("Данные Ф.И.О. сотрудника - " + fullName2);
    }
}