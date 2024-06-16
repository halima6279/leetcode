//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 5408433;
        int value = 0;
        String b = String.valueOf(a);
        String [] c = b.split("");
        for (int i = 0; i < c.length; i++ ){
            value = Integer.parseInt(c[i]) > value ? Integer.parseInt(c[i]) : value;
        }
        System.out.println(value);
    }
} // https://www.youtube.com/watch?v=0CJRE2gxygk&t=30s