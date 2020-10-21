/**
 * @author zhouyalin
 * @create 2020/10/21 10:12 上午
 * @Description 字节码分析
 */
class TestByteCode {

    int a = 1;
    long b = 2L;
    double c = 3.0D;
    boolean d = false;

    public TestByteCode(int a, long b) {
        this.a = a;
        this.b = b;
    }

    public static int add(int a, long b, double c, boolean d) {

        if (b > a) {
            d = true;
        }

        for (int i = 0; i <= b; i++) {
            c = c * b;
        }

        return (int) c;

    }

    public static void main(String[] args) {
        System.out.println("add return is : " + add(1, 2L, 3.0D, false));
    }
}
