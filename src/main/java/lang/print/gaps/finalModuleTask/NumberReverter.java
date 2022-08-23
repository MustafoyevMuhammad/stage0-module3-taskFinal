package lang.print.gaps.finalModuleTask;

public class NumberReverter {
   public void revert(int number) {
        int a = (number % 10) *100;
        number = number / 10;
        a += (number % 10) * 10;
        number = number / 10;
        a += number;
        System.out.println(a);
    }
}
