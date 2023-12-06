package lv.javaguru.java1.student_jelena_vavere.lesson_8_project_school_dairy_part_1_lessoncode.homework;


import java.util.ArrayList;
import  java.util.List;
class IntegerListDemo {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(10);
        integerList.add(15);

        integerList.add(0, 1); //добавляем в начало
      //  integerList.add(1, 2); // можно поменять индекс и элемент

    int indexToRemove  = 2;

        int removedElement = integerList.remove(indexToRemove);
        System.out.println("Удалить элемент из списка по индексу = " + indexToRemove + " Это будет число = " + removedElement);

    //удаляем элемент из списка без указания индекса
    boolean removed = integerList.remove(Integer.valueOf(1));
    System.out.println("Удалить элемент " + removed);

    //узнаем пустой список или нет
        boolean isEmpty = integerList.isEmpty(); //метод isEmpty() проверяет список есть ли в нем элементы или нет и возвращает
        //true - если список пуст и false если нет. Поэтому возвращается булевское значение
        System.out.println(" Список пустой? " + isEmpty);

        //проходим список и выводим кажый элемент
        if (integerList.isEmpty()) {
            System.out.println(" Список пуст ");
        } else {
            System.out.println(" Элементы в списке ");
            for (Integer element : integerList){    //: используется для конструкции for-each
                System.out.println(element);        // for (тип элемента : коллекция) код выполняется для каждого элемента в коллекции
            }
        }
    }
}
