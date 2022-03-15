package Method;

public class ConstructorReferencing {
   public static class Movie{
       String m;
       public String name(){
           return m;
       }
        public Movie(int id){}
        public Movie(int id, String name){
            this.m = name;
        }

       public boolean isClassic() {
           return true;
       }

       interface MovieFactory{
            public Movie create(int id);
    }

    MovieFactory m1 = i -> new Movie(i);
        MovieFactory m2  = Movie::new;

        interface MovieFactory2{
            public Movie create(int id, String s);
        }

        MovieFactory2 m3 = Movie::new;
        public static void main(String[] args) {
            ConstructorReferencing client = new ConstructorReferencing();
        }
    }
}
