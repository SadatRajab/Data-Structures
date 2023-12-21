class Queue {
    private int maxsize;
    private long[]queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int s){
        maxsize =s;
        queArray=new long[maxsize];
        front=0;
        nItems=0;
        rear=-1;
    }
    public long remove(){
        long temp=queArray[front++];
        if(front==maxsize)
            front=0;
        nItems--;
        return temp;
    }
    public void insert(long j){
        if(rear==maxsize-1)
            rear=-1;
        queArray[++rear]=j;
        nItems++;
    }
    public long peekFront(){
        return queArray[front];
    }
    public boolean isEmpty(){
        return (nItems==0);
    }
    public boolean isFull(){
        return (nItems==maxsize-1);
    }
    public int size(){
        return nItems;
    }

    public static void main(String[] args) {
        Queue theQueue=new Queue(5);
        theQueue.insert(5);theQueue.insert(15);theQueue.insert(20);theQueue.insert(25);theQueue.insert(30);

        theQueue.remove();theQueue.remove();theQueue.remove();

        theQueue.insert(50);theQueue.insert(60);theQueue.insert(70);theQueue.insert(75);

        while (!theQueue.isEmpty()){
            long n =theQueue.remove();
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
