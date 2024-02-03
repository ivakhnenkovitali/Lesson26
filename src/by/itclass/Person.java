package by.itclass;

@Deprecated
public class Person {
    //since называется аттрибутом аннотации
    //аттрибуты используется для указания дополнительной информации
    //к применяемой аннотации
    @Deprecated(since = "12.0")
    private int id;
    private String name;
    @Deprecated(since = "12.7")
    private int age;

    public Person() {
    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    //@Override !Ошибка, метод не являет переопределенным
    @Deprecated(since = "11.5")
    public String syHello() {
        return "Hello my name is " + name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
