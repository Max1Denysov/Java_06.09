interface inStack{
    void push(int item);
    int pop();

}
class DynStack implements inStack{
    private int stck[];
    private int LastN;

    DynStack(int size){
        stck = new int[size];
        LastN = -1;
    }
    public void push(int item){
        if(LastN == stck.length){
            int []temp = new int[stck.length * 2];
            for(int i = 0; i < stck.length; i++){
                temp[i] = stck[i];
                stck = temp;
                stck[++LastN] = item;
            }
        }
        else {
            stck[++LastN] = item;

        }
    }


    public int pop() {
        if(LastN < 0){
            System.out.println("Empty Stack");
            return 0;
        }
        else{
            return stck[LastN--];
        }

    }
}
class FixedStack implements inStack{
    private int []stck;
    private int LastN;
    FixedStack(int size){
        stck = new int[size];
        LastN = -1;
    }
    public void push(int item){
        if(LastN == stck.length){
            System.out.println("Full stack");
        }
        else{
            stck[++LastN] = item;
        }
    }
    public int pop(){
        if(LastN < 0 ){
            System.out.println("Empty Stack");
            return 0;
        }
        else{
            return stck[LastN--];

        }
    }
}
public class intStack {
    public static  void main(String ...args){
        DynStack myDynsteck = new DynStack(100);
        FixedStack myFixsteck = new FixedStack(10);
        for(int i = 0;i < 10;i++){
            myFixsteck.push(i);
        }
        for(int i = 0;i < 100;i++){
            myDynsteck.push(i);
        }
        System.out.println("FIX STACK HAVE: ");
        for(int i = 0;i<10;i++)
            System.out.print(myFixsteck.pop()+ " ");

        System.out.println("\nDYN STACK HAVE: ");
        for(int i = 0;i<100;i++)
            System.out.print(myDynsteck.pop()+ " ");
    }
}
