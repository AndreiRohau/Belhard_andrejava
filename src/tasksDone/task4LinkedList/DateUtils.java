package tasksDone.task4LinkedList;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.Logger;

public class DateUtils {
    private static Logger log = Logger.getLogger(DateUtils.class.getName());

    public static void dateUtils() {

        //Вводим число
        log.info("Enter a number ");
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong(); // вводим необходимые переменные
        long tempNum;
        long amount = 0;
        LinkedList<Long> stack1000 = new LinkedList<Long> ();
        LinkedList<String> numList = new LinkedList<String> ();
        long tempArr [] = new long [3];


        while (number > 0) {    //разбиваем число на трехзначные числа и загоняем их в список
            stack1000.push(number % 1000); //пример этарации числа 123456789 = шаг1 789; шаг2 456; шаг3 123
//            System.out.println(" in " + number % 1000);
            number /= 1000;
            amount++;
        }

        amount = 0; // to add thousands and millions and etc.
        while (!stack1000.isEmpty()) {
            tempNum = stack1000.getLast();
            stack1000.removeLast();
//            System.out.println("test " + tempNum);
            long temp1 = tempNum;
            int temp2;

            if ((amount == 1) && (temp1 != 0)) {
                numList.push("thousand ");
            }
            if ((amount == 2) && (temp1 != 0)) {
                numList.push("million ");
            }
            if ((amount == 3) && (temp1 != 0)) {
                numList.push("billion ");
            }
            if ((amount == 4) && (temp1 != 0)) {
                numList.push("trillion ");
            }
            if ((amount == 5) && (temp1 != 0)) {
                numList.push("quadrillion ");
            }
            amount++;

            //dividing 111 integer into separate numbers 1-1-1 and putting into arrange list (massive)
            for (int i = 0; i < tempArr.length; i++) {
                tempArr[i] = temp1 % 10;
                temp1 /= 10;
//                System.out.println("tempArr[" + i + "] is " + tempArr[i]);
            }

            //checkout for numbers 11-19
            for (int i = 0; i < tempArr.length; i++) {

                if ((10 < (tempArr[0] + (tempArr[1] * 10))) && (((tempArr[0] + (tempArr[1] * 10)) < 20))) {
//                    System.out.println("if 11-19 went on");
                    temp2 = (int) (tempArr[0] + tempArr[1] * 10);
//                    System.out.println("temp2 is" + temp2);
                    switch (temp2) {
                        case 11: {
                            numList.push("eleven ");
                            break;
                        }
                        case 12: {
                            numList.push("twelve ");
                            break;
                        }
                        case 13: {
                            numList.push("thirteen ");
                            break;
                        }
                        case 14: {
                            numList.push("fourteen ");
                            break;
                        }
                        case 15: {
                            numList.push("fifteen ");
                            break;
                        }
                        case 16: {
                            numList.push("sixteen ");
                            break;
                        }
                        case 17: {
                            numList.push("seventeen ");
                            break;
                        }
                        case 18: {
                            numList.push("eighteen ");
                            break;
                        }
                        case 19: {
                            numList.push("nineteen ");
                            break;
                        }

                    }

                    i++;
                    i++;
                }

                //if there is no 11-19, than check 010
                if (i == 1){
                    tempArr[1] *= 10;
                }

                //if  there is no 11-19, then check 100
                if ((i == 2) && (tempArr[i] != 0)) {
                    numList.push("hundred ");
                }

                //common part for choosing simple numbers like 0-9 and 10, 20, 30 ... 80, 90
                switch ((int)tempArr[i]) {
                    case 1: {
                        numList.push("one ");
                        break;
                    }
                    case 2: {
                        numList.push("two ");
                        break;
                    }
                    case 3: {
                        numList.push("three ");
                        break;
                    }
                    case 4: {
                        numList.push("four ");
                        break;
                    }
                    case 5: {
                        numList.push("five ");
                        break;
                    }
                    case 6: {
                        numList.push("six ");
                        break;
                    }
                    case 7: {
                        numList.push("seven ");
                        break;
                    }
                    case 8: {
                        numList.push("eight ");
                        break;
                    }
                    case 9: {
                        numList.push("nine ");
                        break;
                    }
                    case 10: {
                        numList.push("ten ");
                        break;
                    }
                    case 0: {
                        numList.push(""); // do nothing or delete word hundred from the list!!!
                        break;
                    }
                    case 20: {
                        numList.push("twenty ");
                        break;
                    }
                    case 30: {
                        numList.push("thirty ");
                        break;
                    }
                    case 40: {
                        numList.push("forty ");
                        break;
                    }
                    case 50: {
                        numList.push("fifty ");
                        break;
                    }
                    case 60: {
                        numList.push("sixty ");
                        break;
                    }
                    case 70: {
                        numList.push("seventy ");
                        break;
                    }
                    case 80: {
                        numList.push("eighty ");
                        break;
                    }
                    case 90: {
                        numList.push("ninety ");
                        break;
                    }

                }
            }
        }



        while (!numList.isEmpty()) {
            System.out.print(" " + numList.pop() + " ");
        }

//        //checkouts
//        while (10>0) {
//            while (!stack1000.isEmpty()) {
//                System.out.print(" out " + stack1000.pop());
//                System.out.println();
//            }
//            System.out.println("amount of numbers in list " + amount);
//            break;
//        }

    }

}
