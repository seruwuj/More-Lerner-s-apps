public class AccessDifferentVariables {
    public static void main(String[] args) {
        TunaDifferentVariables TunaDifferentVariablesObject = new TunaDifferentVariables();
        System.out.println(TunaDifferentVariablesObject.toMillitary());
        System.out.println(TunaDifferentVariablesObject.toString());

        TunaDifferentVariablesObject.setTime(13,27,6);
        System.out.println(TunaDifferentVariablesObject.toMillitary());
        System.out.println(TunaDifferentVariablesObject.toString());
    }
}

