interface Comp{
    public String find(String compName);
    default public String getName(){
        return "Default Name";
    }

    default public void inti(){
        System.out.println("Initiating sequence..");
    }

}