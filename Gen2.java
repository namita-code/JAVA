class Gen2 {
    public static void main(String[] args)
    {
        
        Test<Integer,Double> Obj = new Test<Integer,Double>(15,9.657);
        System.out.println(Obj.getObject1());
        System.out.println(Obj.getObject2());
        Obj.showtypet();
        Obj.showtypeu();
        
        Test<String,Integer>Obj2=new Test<String,Integer>("Namita",78);
        System.out.println(Obj2.getObject1());
        System.out.println(Obj2.getObject2());
        Obj2.showtypet();
        Obj2.showtypeu();
        
    }
}

class Test<T,U> {
    T obj1;
    U obj2;
    Test(T obj1,U obj2) 
    { this.obj1 = obj1;
    this.obj2=obj2;} 
    T getObject1() { 
        return this.obj1; }
    U getObject2() { 
        return this.obj2; }
    void showtypet(){
        System.out.println("Type of t is"+" "+obj1.getClass().getName());
    }
     void showtypeu(){
        System.out.println("Type of u is"+" "+obj2.getClass().getName());
    }
}
