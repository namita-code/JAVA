class Gen1 {
    public static void main(String[] args)
    {
        
        Test<Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getObject());
        iObj.showtype();

        
        Test<String> sObj
            = new Test<String>("GeeksForGeeks");
        System.out.println(sObj.getObject());
        sObj.showtype();
        
        Test<Double> dobj=new Test<Double>(34.234);
        System.out.println(dobj.getObject());
        dobj.showtype();
    }
}

class Test<T> {
    T obj;
    Test(T obj) 
    { this.obj = obj; } 
    T getObject() { 
        return this.obj; }
    void showtype(){
        System.out.println("Type of t is"+" "+obj.getClass().getName());
    }
}
