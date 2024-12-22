class WrongAge extends Exception{
    public WrongAge(String message){
        super(message);
    }
}
class Father{
    int age;
    Father(int age) throws WrongAge{
        if(age<=0){
            throw new WrongAge("Age cannot be lesser than or equal to 0");
        }
        this.age=age;
    }
}
class Son extends Father{
    int sonage;
    Son(int fatherage,int sonage)throws WrongAge{
        super(fatherage);
        if(fatherage<=sonage){
            throw new WrongAge("Fathers age cannot be greater than son's age");
        }
        if(sonage<0){
            throw new WrongAge("Age cannot be lesser 0");
        }
        this.sonage=sonage;
    }
}
class Exceptiondemo{
    public static void main(String[] args) {
        try{
           Father a=new Father(-9);
            System.out.println("Succesfully created");
        }
        catch (WrongAge e){
            System.out.println("exception"+e.getMessage());
        }
        try{
            Son b=new Son(10,20);
            System.out.println("son success");
        }
        catch (WrongAge e) {
            throw new RuntimeException(e);
        }
    }
}
