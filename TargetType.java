public class TargetType {
    public interface Email{
        String constructEmail(String name);
    }
   Email email = (String name) -> name + "@zemosolabs.com";

    public String getEmail(String name, Email email){
        return null;
    }

    public static void main(String[] args) {

    }
}
