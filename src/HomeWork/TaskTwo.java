package HomeWork;

        import java.util.Arrays;
        import java.util.Scanner;

/**
 * Created by Admin on 7/5/2017.
 */
public class TaskTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //КОПИПАСТ С Задания 1 - 1. на вход через консоль принимает размер массива
        System.out.println("Please enter the array size");
        int arraySize = sc.nextInt();

        //КОПИПАСТ С Задания 1 - 2. на вход через консоль принимает массив чисел
        int[] myArray = new int[arraySize];

        for (int i = 0, j = 1; i < myArray.length; i++, j++) {
            System.out.println("Enter array element - " + i);
            int arrayElementValueFromConsole = sc.nextInt();
            //sc.nextInt();
            myArray[i] = arrayElementValueFromConsole;
            System.out.println("Please note you still need to enter " + (myArray.length - j) + " - array element(s).");


        }
        System.out.println("Our array now looks like: " + Arrays.toString(myArray));

/* Создам еще один масив такого же размера
Пройдусь первому масиву и в новосозданный напишу сколько раз повторяется значение
примерно так
Масив с консоли          7     1  1  2  1  3
ТЕМП масив               1раза 3р 3р 1р 3р 1р

 3р - имею ввиду что число 1 повторяется три раза

Да ВСЕ ЭТО КАК-ТО можно сделать многомерным масивом, но пока не проходили то стараюсь не использовать
*/


// считаю повторения и пишу в темп
        int[] tempArray = new int[myArray.length];
        for (int i=0; i < myArray.length; i++){
            tempArray[i] = 0;

            for (int j=0; j < myArray.length; j++){ // пробегусь по масиву и посмотрю повторения

                if (myArray[i] == myArray[j]){
                    tempArray[i]++; //запишу во временный масив +1 если такое число уже встречалось
                }
            }
        }

        // Теперь у меня есть темп масив с числами они же количества значений в масиве с консоли
        // найду максимум с темпа - оно же максимальное колво повторений- Копипаста с задания 1
        int max = tempArray[0]; // в данном случаи будет хранить максимальное колво повторов
        int arrayElementNumber = 0; // будет хранить НОМЕР елемента в масиве с консоли в котором было замечено макс
        for (int i=0; i < tempArray.length; i++){
            if (max < tempArray[i]){
                max = tempArray[i];
                arrayElementNumber = i;
            }
        }
        System.out.println("Число "+ myArray[arrayElementNumber] +" повторяется в масиве больше всего раз, а именно - " + max + " раз(а)");

        //===================================================================================

        //Тоже самое с минимумом
        //8. вывести в консоль минимальное кол-во повторений чисел в массиве

        int[] tempArrayForMin = new int[myArray.length];
        for (int i=0; i < myArray.length; i++){
            tempArrayForMin[i] = 0;

            for (int j=0; j < myArray.length; j++){

                if (myArray[i] == myArray[j]){
                    tempArrayForMin[i]++;
                }
            }
        }

        int min = tempArrayForMin[0];
        int arrayElementNumberWhereIsMin = 0;
        for (int i=0; i < tempArrayForMin.length; i++){
            if (max > tempArrayForMin[i]){
                max = tempArrayForMin[i];
                arrayElementNumberWhereIsMin = i;
            }
        }
        System.out.println("Число "+ myArray[arrayElementNumberWhereIsMin] +" повторяется в масиве Меньше всего раз, а именно - " + min + " раз(а)");

    }
}