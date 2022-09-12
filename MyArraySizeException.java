package Size;


public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException(String msg) {
        super("Ошибка размерности массива.\n" + " " + msg);
    }

}