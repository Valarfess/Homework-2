package academy.belhard;

public class Main {

    public static void main(String[] args) {
        int yearOfBirthday = 1986;
        int monthOfBirthday = 9;
        int dayOfBirthday = 25;
        int sum = yearOfBirthday + monthOfBirthday + dayOfBirthday;
        boolean monthBiggerDay;
        char [] name = {'М','и','х','а','и','л'};
        double myAge = 34.0;
        double partYear = 6.0/12.0;
        double result = myAge + partYear;
        System.out.println("Сумма моего года, месяца и дня рождения: " + sum);
        if (dayOfBirthday < monthOfBirthday){System.out.println("Месяц моего рождения больше даты рождения: True");}
            else {System.out.println("Месяц моего рождения больше даты рождения: False");}
        System.out.print("Массив с моим именем: ");
        for (int i = 0; i < name.length; i++) {System.out.print(name[i]);}
        System.out.println("\n" + "Мне - " + result + " лет");





        // write your code here
    }
}
