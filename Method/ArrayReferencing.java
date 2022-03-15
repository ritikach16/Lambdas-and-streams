package Method;

public class ArrayReferencing {
    interface StringArray{
        String[] create(int size);
    }
    private void testArrayConstructorRef(){
        StringArray arr1 = (size) -> new String[size];
        StringArray arr2 = String[]::new;
        String[] testing = arr1.create(2);
        System.out.println(testing[0]);
    }

    public static void main(String[] args) {
        ArrayReferencing ar1 = new ArrayReferencing();
        ar1.testArrayConstructorRef();
    }
}
