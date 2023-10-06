package GLAB;


public class GenericClass_GLAB_1 {
    public static void main(String[] args) {
        // initialize the class with Integer data
    	Generic dObj = new Generic();
        dObj.genericsMethod(25); // passing int
        dObj.genericsMethod("Per Scholas"); // passing String
        dObj.genericsMethod(2563.5); // passing double
        
        GMultipleDatatype<String, Integer> mobj = new  GMultipleDatatype("Teksystem",101);
        
    
}
}

