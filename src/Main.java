public class Main {
    public static void main(String[] args) {
        // Задание 1
        {
            String firstName = " Ivan";

            String middleName = " Ivanovich";
            String lastName = " Ivanov";
            String fullName = lastName + firstName + middleName;
            System.out.println("ФИО сотрудника -  " + fullName);
        }

        // Задание 2

        {
            String fullName = "Ivanov Ivan Ivanovich";
            String fullNameUpper = fullName.toUpperCase();
            System.out.println("Данные ФИО сотрудника для заполнения отчета -  " + fullNameUpper);
        }
        // Задание 3

        {

            String fullName = "Иванов Семён Семёнович";
            fullName = fullName.replace("ё", "е");
            fullName = fullName.replace("Ё", "Е");
            System.out.println("Данные ФИО сотрудника - " + fullName);
        }
    }
}