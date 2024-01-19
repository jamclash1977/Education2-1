/**
 * FazzBizzを判定するクラス
 * @author shiono.junichir
 *
 */
class FizzBuzz1 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("出力範囲を指定してください");
            System.exit(1);
        }
        int end = 0;
        try {
            end = Integer.parseInt(args[0]);
        } catch(NumberFormatException e) {
            System.out.println("出力範囲は整数で指定してください");
            System.exit(1);
        }
        if (end < 5) {
            System.out.println("出力範囲は5以上の整数で指定してください");
            System.exit(1);
        }
        for (int i = 1; i <= end; ++i) {
            if (i % 15 == 0) {
                System.out.print("FizzBuzz,");
            } else if (i % 5 == 0) {
                System.out.print("Buzz,");
            } else if (i % 3 == 0) {
                System.out.print("Fizz,");
            } else {
                System.out.print(i + ",");
            }
        }
    }
}
