class a{
    public interface Nested{
        boolean isnotNegative(int x);
    }
}

class b implements a.Nested{
    public boolean isnotNegative(int x){
        return  x < 0 ? false: true;
    }
}
public class Testt {
    public static void main(String ...args){
        a.Nested nif = new b();
        if(nif.isnotNegative(10))
            System.out.println("Numb 10 > 0");
        if(nif.isnotNegative(-12))
            System.out.println("not be printed");
    }
}
