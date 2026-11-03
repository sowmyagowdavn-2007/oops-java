class Addition {
    
    static void add(int a, int b) {
        int c = a + b;
        System.out.println("The addition of " + a + " and " + b + " is: " + c);
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        add(a, b);
    }
}