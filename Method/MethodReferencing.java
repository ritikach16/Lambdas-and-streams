package Method;

@FunctionalInterface
interface IMovie{
    public boolean check(int id);
}

public class MethodReferencing {
    public void testMovieStaticMethodRef(){
        IMovie m1 = (i) -> i<100 ? true : false;
        IMovie m2 = MethodReferencing::isClassic;
    }
    private void testMovieInstanceMethodRef(){
        MethodReferencing ref = new MethodReferencing();
        IMovie m1 = (i) -> i > 10 && i<100 ? true : false;
        IMovie m2 = ref::isTop10;
    }
private void testMovieArbitaryObjectMethod(){
        IMovie m1 = SomeMethodRef::isComedy;
}
    public boolean isTop10(int movieId){
        return true;
    }
    public static boolean isClassic(int movieId){
        return true;
    }

    public static void main(String[] args) {
        MethodReferencing client = new MethodReferencing();
    }
}

class SomeMethodRef{
 public static boolean isComedy(int i){
     return true;
 }
}
