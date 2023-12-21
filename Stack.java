class Stack {
    private int maxsize;
    private long[] stackArray;
    private int top;
    public Stack(int s){
        maxsize=s;
        stackArray=new long[maxsize];
        top=-1;
    }
    public void push(long j){
        stackArray[++top]=j;
    }
    public long pop(){
        return stackArray[top--];
    }
    public long peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return (top==-1);
    }
    public boolean isFull(){
        return (top==maxsize-1);
    }

    public static void main(String[] args) {
        Stack thestack=new Stack(10);
        thestack.push(60);
        thestack.push(30);
        thestack.push(50);
        thestack.push(10);

        while (!thestack.isEmpty()){
            long value=thestack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
