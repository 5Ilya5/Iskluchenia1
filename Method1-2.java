/* Исключение может быть сгенерировано одним методом,
   а перехвачено другим. */

class ExcTest {
    // необходимо сгенерировать исключение
    static void genException()  {
        int nums[] = new int[4];

        System.out.println("Before exception is generated.");

        // генерация исключения в связи с
        // обращением за границы массива.
        nums[7] = 10;
        System.out.println("this won't be displayed");
    }
}

class ExcDemo2 {
    public static void main(String args[])  {
        try {
            ExcTest.genException() ;
        }
        //перехват исключения
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement.");
    }
}