public class swapNumbers {
    public static void main(String[] args) {

//        int result = reverse(123);

        System.out.println(reverse(123));
    }
    public static int reverse(int x) {

        int result = 0;
        int prev = 0;

        while( x != 0){
            int cur = x % 10;
            x /= 10;

            result = result * 10 + cur;

            if((result - cur) / 10 != prev) return 0;

            prev = result;
        }

        return result;

    }
}

