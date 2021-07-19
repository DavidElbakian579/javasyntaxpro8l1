/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasyntaxpro8l1;

/**
 *
 * @author David-pc
 * Примитивные типы в Java
 */
public class Main {
    
    public static char char1 = 101;
    public static char char2 = 'H';
    public static char char3 = 114;
    public static char char4 = '\u006F';
    public static char char5 = 108;
    public static char char6 = 'h';
    public static char char7 = 0x0063;
    public static char char8 = ' ';
    public static char char9 = 'l';
    public static char char10 = 0x61;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 
        Все возможные типы
        В классе должны быть созданы переменные всех примитивных типов в Java.
        */
        byte b;
        short sh;
        int i;
        long l;
        float f;
        double d;
        boolean bool;
        char ch;
        
        /* 
        Максимальное целое
        */
        int maxInt = Integer.MAX_VALUE;
        short maxShort = Short.MAX_VALUE;
        long maxLong = Long.MAX_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        
        /* 
        Минимальное целое
        */
        byte minByte = Byte.MIN_VALUE;
        short minShort = Short.MIN_VALUE;
        int minInt = Integer.MIN_VALUE;
        long minLong = Long.MIN_VALUE;
        
        /* 
        Экспонентная запись числа
        Перед тобой 5 общеизвестных величин.
        Перепиши их в более читаемый формат — экспоненциальный. Мантиса должна представлять собой дробное число от 1.0 до 10.
        После изменения формата чисел реальное значение, хранимое в переменной, не должно измениться.
        Пример:
        109.1678 — обычная форма;
        1.091678E+2 — экспонентная форма записи.
        */
        double earthDiameter = 1.2742E+4;
        double lightSpeed = 2.99792458E+8;
        double uraniumAtomicMass = 2.380289E+2;
        double averageBeeWeight = 8.5E-2;
        double javaDeveloperSalary = 1.0000E+4;
        
        /* 
        Бесконечность не предел
        В методе main вызови метод div() 2 раза. 
        Первый раз — с такими аргументами, чтобы вывод в консоли был "Infinity", 
        а второй — "-Infinity".
        */
        div(0.0, 100.0);
        div(0.0, -100.0);
        
        /* 
        Странное деление
        В методе main вызови метод div() с таким аргументам, чтобы вывод в консоли был "NaN".
        */
        div(0.0, 0.0);
        
        /* 
        5 оттенков char
        В методе main() измени порядок вызова методов System.out.print() 
        таким образом, чтобы вывод на консоль был: "Hello char".
        Значение переменных не изменяй.
        */
        System.out.print(char2);
        System.out.print(char1);
        System.out.print(char5);
        System.out.print(char9);
        System.out.print(char4);
        System.out.print(char8);
        System.out.print(char7);
        System.out.print(char6);
        System.out.print(char10);
        System.out.print(char3);        
        System.out.println();
        
    }    
    public static void div(double a, double b){
        System.out.println(b/a);
    }
}
