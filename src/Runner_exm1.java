import by.itclass.Person;

public class Runner_exm1 {
    public static void main(String[] args) {
        //Аннотации - является некторой мето-информацией
        //Представляют собой кострукции, которые описыват
        //исходный java код
        Person person = new Person(1, "Alex", 25);
        System.out.println(person.syHello());

        //Получение информации об аннотациях
        //в режиме выполнения программы
        Class clPerson = person.getClass();

        //Проверка наличия аннотации над классом
        boolean isAnnPresent = clPerson.isAnnotationPresent(Deprecated.class);
        System.out.println("isAnnPresent=" + isAnnPresent);

        if (isAnnPresent) {
            System.out.println("Annotation Deprecated is present");
        } else {
            System.out.println("Annotation Deprecated is not present");
        }
    }
}
