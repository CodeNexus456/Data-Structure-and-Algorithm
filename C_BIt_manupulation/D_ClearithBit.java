package C_BIt_manupulation;

public class D_ClearithBit {

    public static int ClearithBit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    public static void main(String[] args) {
        System.out.println(ClearithBit(10, 1));
    }
}