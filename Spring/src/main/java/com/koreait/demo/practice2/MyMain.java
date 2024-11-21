package com.koreait.demo.practice2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        // 1. Person
        Person person = context.getBean(Person.class);
        person.setName("김하다");
        System.out.println("person=======>"+person);

        // 2. School
        School school = context.getBean(School.class); // School 클래스내에 Person 객체 변수 있음
        System.out.println("school=======>"+school);

        /**************************************************************************/
        try {
            // 객체빈은 싱글턴 패턴으로
            // 무조건 사람은 하나만 만들어짐!
            Person person0 = context.getBean(Person.class);
            person.setName("홍길동");
            System.out.println(person0);

            Person person1 = context.getBean(Person.class);
            System.out.println(person1);

        }catch (Exception e){
            System.out.println("person을 못찾음");
        }
//
//        try {
//            Cat cat = context.getBean(Cat.class);
//            System.out.println(cat);
//        }catch (Exception e){
//            System.out.println("cat을 못찾음");
//        }
        /*******************************************************/
//        System.out.println(MyObject.instance);

        // 빈을 사용하지 않고,
        // 코드 자체가 싱글톤인 것
        // 3. myObject
        MyObject myObject = MyObject.getInstance();
        System.out.println(myObject);

        MyObject myObject1 = MyObject.getInstance();
        System.out.println(myObject1);


        /***********************************************/




    }
}
