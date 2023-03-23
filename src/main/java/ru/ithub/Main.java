package ru.ithub;
// #2
// Собственно в спеке, что boolean в ранних спеках за тип не считался
// настолько он специфический. Впрочем, параграф 2.3.4, приоткрывает завесу тайны над идея
// ми имплементации boolean на конкретной виртуальное машине.
//
// There are no Java Virtual Machine instructions solely dedicated to operations on boolean values.
// Instead, expressions in the Java programming language that operate on boolean values are compiled to use values
// of the Java Virtual Machine int data type.
//
// Т.е. нам ясно говорят, что в целом boolean внутренне - это типичный 4-байтовый int. Соответственно, переменная типа
// boolean, скорее всего будет занимать 4 байта (в 32 раза больше, чем само значение, которое она презентует).
//
public class Main {
    public static void main(String[] args) {
        // #1
        Integer integer = 1;
        int integer1 = 2;
        inc(integer);
        inc(integer1);

        // #3
        TestObject testObject = new TestObject();
        System.out.println(testObject instanceof Object); // true

        // #4
        String str = "abc";
        String str1 = "abc";
        String str2 = new String("abc");
        System.out.println(str.equals(str1)); // true
        System.out.println(str==str1); // true
        System.out.println(str.equals(str2)); // true
        System.out.println(str==str2);
        // false потому что equals сравнивает char внутри string,
        // а == сравнивает ссылки на obj, а т.к. у нас разные ссылки выдает false
    }

    public static void inc(Integer int1){
        int1++;
        System.out.println(int1);
        // Integer – это объектный тип
        // int – это примитивный тип.
        // Integer – это объектная оболочка int
    }
}