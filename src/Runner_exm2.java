import by.itclass.Person;

import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class Runner_exm2 {

    public static void main(String[] args) {
        //Получение информации и наличии аннотации над полем или методом
        Class clPerson = Person.class;


        //Получение полей, объявленных в классе
        Field[] fields = clPerson.getDeclaredFields();
        //Поиск полей, над которыми устновлена аннотация
        for (Field field : fields) {
            if (field.isAnnotationPresent(Deprecated.class)) {
                System.out.println("Filed:" + field.getName() + " is deprecated");
                //Получение объекта аннотации
                //Для того, чтобы сохранить ссылку на этот объект
                //нужно создать переменную типа аннотации
                Deprecated ann = field.getAnnotation(Deprecated.class);
                //Получение установленных значений аттрибутов аннотации
                String attrValue = ann.since();
                System.out.println("Since of deprecated " + attrValue);
            } else {
                System.out.println("Filed:" + field.getName() + " is not deprecated");
            }
        }

        //Получение методов, объявленных в классе
        Method[] methods = clPerson.getDeclaredMethods();
        //Поиск методов, над которыми установлена аннотация
        for (Method method : methods) {
            if (method.isAnnotationPresent(Deprecated.class)) {
                System.out.println("Method " + method.getName() + " is deprecated");
                Deprecated ann = method.getAnnotation(Deprecated.class);
                String attrValue = ann.since();
                System.out.println("Since of deprecated " + attrValue);
            } else {
                System.out.println("Method " + method.getName() + " is not deprecated");
            }
        }
    }
}
