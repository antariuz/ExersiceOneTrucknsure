public class ExerciseOne {
    public static boolean solve(int k) {
        String kNumber = String.valueOf(Math.abs(k));
        String reverseNumber = new StringBuilder(kNumber).reverse().toString();
        return kNumber.equals(reverseNumber);
    }
    public static void main(String[] args) {
        System.out.println(ExerciseOne.solve(1001001));
    }
}
