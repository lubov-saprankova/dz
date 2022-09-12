package Data;


import Size.MyArraySizeException;

public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(String msg) {
        super("Ошибка преобразования элемента массива в целое число.\n" + " " + msg);
    }

}
