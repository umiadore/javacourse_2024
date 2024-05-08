package classwork22.pen;
/*
Создать класс Реп (ручка).
Сделать свойство количество чернил, установить значение 100.
* Применить инкапсуляцию.
* Описать метод
write (String)'
который принимает строку и выводит ее в кансоль.
* При этом количество чернил должно уменьшаться на количество написанных символов.
* Если в ручке недостаточно чернил, ручка не должна написать в консоль вообще ничего.
* Дополнительное задание: сделать так, чтобы ручка писала фразу пока не закончатся чернила (и обрывала как только закончатся) .
* Продемонстрировать работу объекта класса Pen в методе main() класса Main в свободной форме.
* Главное условие - должны быть вызваны все методы класса (кроме асессоров) .
 */
public class Pen {
    private int inkAmount; //чернила

    public  Pen () {
        this.inkAmount = 100; // то бишь на 100 букв; мы пишем this когда внутри метода есть переменная, у которой такое же названия, чтобы отличить переменную от поля
    }

    public int getInkAmount() {
        return inkAmount;
    }
    public void write (String text) {
        for (int i = 0; i < text.length(); i++) { // проходим по встрей строке
            if (inkAmount == 0) { // если чернила закончились, то программа прекращает писать
                break;
            }
            System.out.print(text.charAt(i)); // пишем букву
            inkAmount --; // уменьшаем количество чернил на 1
        }
        System.out.println();
    }

    public void refill () { // Описать метод refill, который установит количество чернил обратно на
        inkAmount = 100;
    }
    public void checkInk () { // checkInk()*, который напишет в консоль, сколько в ручке осталось чернил.
        System.out.println("Remaining ink: " + inkAmount);
    }
}