class Calculator{

    static int add(int a, int b){
        return a+b;
    }

    static int sub(int a, int b){
        return a-b;
    }

    // static int mul(int a, int b){
    //     return a*b;
    // }

    public static void main(String[] args) {
        
        System.out.println("Addition: "+add(10,20));
        System.out.println("Subraction: "+ sub(10,30));
        // System.out.println("multiplication: +"+mul(10, 30));
    }
}