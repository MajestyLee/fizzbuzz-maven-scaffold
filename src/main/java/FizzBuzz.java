public class FizzBuzz {
    public String of(int number) {
        StringBuilder res = new StringBuilder();
        //3的倍数替换成“Fizz”
        if (0 == number % 3) {
            res.append("Fizz");
        }
        //5的倍数替换成“Buzz”
        if (0 == number % 5) {
            res.append("Buzz");
        }
        //其他数字保持不变
        if (0 == res.length()) {
            return String.valueOf(number);
        }
        return res.toString();
    }
}
