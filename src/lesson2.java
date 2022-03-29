public class lesson2 {
    public static void main(String[] args){
        System.out.println(addTwoNumbers(5, 10));
        plusMinNumbers(-6);
        System.out.println(plusMinNumbers1(-7));
        lineRepeat("Повтор", 5);
        System.out.println(highYear(2020));

    }
    public static boolean addTwoNumbers(int x, int y) {

        return ((x+y) > 10 && (x+y) <= 20);
    }
    public static void plusMinNumbers( int x){
        if (x >= 0){
            System.out.println("Положительное");
        }
        else if (x < 0) {
            System.out.println("Отрицательное");
        }
    }
    public static boolean plusMinNumbers1(int x) {

        return (x >= 0);
    }
    public static void lineRepeat(String name, int x){
        for (int k=0; k < x; k++) {
            System.out.println(name);
        }

    }
    public static boolean highYear(int x) {
       return x % 4 == 0 && x % 100 != 0 || x % 400 == 0;
    }
}
