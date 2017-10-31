public class Binari2 {
    public static void main(String[] args) {
        int n = 12;
        String s = toBinary(n);
        System.out.println(s);
    }

    static String toBinary(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            // ((n & (1 << (7-i))) != 0) <-- reverso operador lógico - matematico y de bit (or,etc)
            if ((n & (1 << i)) != 0) {
                sb.append("1");
            } else {
                sb.append("0");
            }
        }
        return sb.toString();
    }
}