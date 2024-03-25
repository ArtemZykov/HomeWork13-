public class Person {
    String name;
    String surname;

    public static void changePerson(Person person) {
        //person = new Person(); // task10 объявил новую переменную, по итогу в классе main  выводится начальные значения переменной
        person.name = "Ilya";
        person.surname = "Lagutenko";
    }
    @Override
    public String toString() {
        return "Person{" +
                "Имя: " + name + '\'' +
                "Фамилия: " + surname + '\'' +
                '}';
    }
}
