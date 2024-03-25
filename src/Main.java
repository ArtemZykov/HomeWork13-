import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }
    public static void task5(){
        int valua = 33;
        changeValua(valua);
        System.out.println(valua); // выдаст значение 22 так как мы объявили метод замены значения в строке 15 и
        // присвоили ему новое значчение в строке 19 на 22
    }
    private static void changeValua(int valua) {
        valua = 22;
        System.out.println("valua = " + valua); // тут если я правильно понял, то мы передали ссылку на переменную а не знаечение поэтому выводит значение 33
    }


    public static void task6() {
        System.out.println("task6");
        Integer value = 33; // данной стройкой присвоили значение 33
        changeValueIntegre (value); // тут вызвали метод замены значения по итогу получили значение 22
        System.out.println (value);
    }
    private static void changeValueIntegre(Integer value) {
        value = 22;
        System.out.println("value = " + value); // аналогично с task5 значение будет = 22
    }


    public static void task7() {
        System.out.println("task7");
        Integer[] value = new Integer[]{3, 4};
        changeValue(value);
        System.out.println(Arrays.toString(value));
    }
    private static void changeValue(Integer[] value) {
        value= new Integer[]{1, 2};
        System.out.println(Arrays.toString(value));

    }

    public static void task8() {
        System.out.println("task8");
        Integer[] value = new Integer[]{3, 4};
        value[0] = 99;
        System.out.println(Arrays.toString(value));
        // так как в массиве порядковый номер числел в массиве начинается с "0", мы заменили число "3" которое стоит на
        // "позиции" "0" на число 99. В итоге получили массив [99, 4]
    }

    public static void task9() {
        System.out.println("task9 и task10");
        Person person = new Person();
        person.name = "Lyapis";
        person.surname = "Trubetskoy";
        Person.changePerson(person);
        System.out.println(person);
    }

    public static void task10() {
        System.out.println("task10");
    }





}






