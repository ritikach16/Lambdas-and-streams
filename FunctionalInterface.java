@FunctionalInterface
interface Component{
    public String find(String compName);
}

//we can substitute this functional interface from the below LAMBDA EXPRESSION


//Component c = (String s) -> {
//    if(s.length()>2) return s;
//    else return "";
//};
