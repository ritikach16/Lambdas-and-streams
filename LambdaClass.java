public class LambdaClass {
    interface Greeting{
        public String greet(String g);
    }

    public void testGreet(String a, Greeting g){
        String res = g.greet(a);
        System.out.println(res);
    }

    public static void main(String[] args) {
        new LambdaClass().testGreet("Ritika", (String s) -> "Hii " + s);

        new LambdaClass().testGreet("Hi" , (String str) -> str.isEmpty() ? "Did you miss something" : "How are you" );
    }
}
