package com.lesson2;
public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        //human.name = "Sergej";
        System.out.println(human.getName());
        human.setName("Sergej");
        System.out.println(human.getName());
        human.setAge(121);
        System.out.println(human.getAge());

        ExampleStaticClass exampleStaticClass = new ExampleStaticClass();
        exampleStaticClass.staticField = 4;
        exampleStaticClass.nonStaticField = 4;
        ExampleStaticClass exampleStaticClass2 = new ExampleStaticClass();
        exampleStaticClass2.staticField = 5;
        exampleStaticClass2.nonStaticField = 5;
        ExampleStaticClass.staticField = 6;
        System.out.println(exampleStaticClass.nonStaticField+", " + exampleStaticClass2.nonStaticField);
        System.out.println(exampleStaticClass.staticField+", " + exampleStaticClass2.staticField);

        exampleStaticClass.hello();
        ExampleStaticClass.hello2();

        Field field = new Field();
        field.eraseField();
        field.showField();

        field = new Field(4,4);
        field.eraseField();
        field.showField();

    }
}
