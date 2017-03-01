package task_7;

/**
 * проверить на скольки примерно количестве строк StringBuilder работает быстрее в 2 раза чем конкатенация строк.
 *
 * Совет - использовать большие строки и предварительно сгенерировать
 */
public class Main {

    public static void main(String[] args) {

        //генерируем массив строк - фактически задаем количество строк для обработки
        String arr [] = GenOfStringArray.stringGen(500);

        //фиксипуем старт работы билдера
        long lBegin = System.currentTimeMillis();
        StrBuilder.strBuildr(arr);

        //фиксируем конец работы билдера и старт работы контенации
        long lMid = System.currentTimeMillis();
        StrConcat.strConcat(arr);

        //фиксируем конец работы контенации
        long lEnd = System.currentTimeMillis();

        //Выводим время исполнения Контенатора и Билдера, если время исполнения Билдера 0 или оба исполнения равны
        //ИЛИ вычисляем во сколько раз время работы контенатора больше билдера
        if ((lMid - lBegin) == 0) {
            System.out.println("Контенация выполняется за " + (lEnd - lMid) + " миллисек Билдер за 0");
        }else if ((lEnd - lMid) == 0) {
            System.out.println("Контенация выполняется за 0" + " миллисек Билдер за " + (lMid - lBegin));
        }else if (((lMid - lBegin) / (lEnd - lMid)) == 1) {
            System.out.println("Контенация выполняется за " + (lEnd - lMid) + " миллисек Билдер за " + (lMid - lBegin));
        }else {
            System.out.println("Контенация выполняется дольше Билдера в " + ((lEnd - lMid) / (lMid - lBegin)) + " раз(а)");
        }


    }
}
