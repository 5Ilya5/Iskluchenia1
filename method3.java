// обработка исключения и продолжение выполнения программы
class ExcDemo {
    public static void main(String args[])  {
        int numer[] = { 4, 8, 16, 32, 64, 128 };
        int denom[] = { 2, 0, 4, 4, 0, 8 };

        for(int i=0; i<numer.length; i++)   {
            try {
                System.out.println(numer[i] + " / " +
                                   denom[i] + " = " +
                                   numer[i]/denom[i]);
            }
            catch (ArithmeticException exc) {
                // перехватить исключение
                System.out.println("Can not divide by 0!");
            }
        }
    }
}