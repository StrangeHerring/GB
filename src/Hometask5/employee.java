package Hometask5;

import java.util.Arrays;

public class employee {
    private String name;
    private String post;
    private String email;
    private String phone_number;
    private int salary;
    private int age;

    public employee (String _name, String _post, String _email, String _phone_number, int _salary, int _age){
        name = _name;
        post = _post;
        email = _email;
        phone_number = _phone_number;
        salary = _salary;
        age = _age;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", post='" + post + '\'' +
                ", email='" + email + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                "\n";
    }

    public static void main(String[] args) {
        employee[] empArray = new employee[5];
        empArray[0] = new employee("Василий", "Повар", "vaspov@gmail.com","89645502360", 40000, 26);
        empArray[1] = new employee("Никита", "Сантехник", "niksan@mail.ru", "88005553535", 30000, 42);
        empArray[2] = new employee("Екатерина", "Флорист", "katflor@yandex.ru", "89313548090", 35000, 34);
        empArray[3] = new employee("Федор", "Юрист", "fedur@rambler.com", "89701223224", 60000, 44);
        empArray[4] = new employee("Анна", "Художник", "anhud@inbox.com", "89214885675", 50000, 27);
        System.out.println(Arrays.toString(empArray));
    }
}
