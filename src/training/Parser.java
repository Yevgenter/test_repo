package training;

public class Parser {

    public static void addToInt(int x, int y){
        x = x+y;
    }

    public static void main(String[] args) {
        int a = 15;
        int y = 10;
        Parser.addToInt(a, y);
        System.out.println(a);
    }

}
