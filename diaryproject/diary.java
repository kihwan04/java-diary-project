package diaryproject;

public class diary {


    public static void main(String[] args) {
        int a = 10, b = 0;
        try {
            int r = a / b;
            System.out.println("결과: " + r);
        } catch (ArithmeticException e) {
            System.out.println("🚨 0으로 나눌 수 없습니다: " + e.getMessage());
        } finally {
            System.out.println("프로그램 종료");
        }
    }

}
