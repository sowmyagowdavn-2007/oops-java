public class TypeCasting {
    public static void main(String[] args) {
        
        // Widening type casting
        int x = 30;
        float y = x;
        System.out.println("Widening: " + y);


        float a = 30.5f;
        int b = (int) a;
        System.out.println("Narrowing: " + b);
    }
}