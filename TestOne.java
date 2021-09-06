interface  call{
    void callme(int param);
}

class customer_one implements call{
    public void callme(int param){
        System.out.println("Castomer one Numb: " + param);
    }
}

class castomer_two implements call{
    public void callme(int param){
        System.out.println("Castomer two Numb: " + param * param);
    }
}

public class TestOne{
    public static void main(String...args){


        call myco = new customer_one();
        call mytw = new castomer_two();
        myco.callme(21);
        myco = mytw;
        myco.callme(21);

    }
}