class STACK{
    private int []stck;
    private int LastN;

    STACK(int size){
        stck = new int[size];
        LastN = -1;
        System.out.println("Stack Created");
    }

    public void push(int item){
        if(LastN == stck.length){
            System.out.println("Full stack");
        }
        else stck[++LastN] = item;
    }

    public int pop(){
        if(LastN < 0){
            System.out.println("Empty stack");
            return 0;
        }
        else{
            return stck[LastN--];
        }
    }
}


public class steck {
    public static void main(String ...args){
        STACK mysteck = new STACK(15);

        for(int i = 0;i < 15;i++){
            mysteck.push(i);
        }
        System.out.println("STACK HAVE: ");
        for(int i = 0;i<15;i++)
            System.out.print(mysteck.pop()+ " ");
    }
}
