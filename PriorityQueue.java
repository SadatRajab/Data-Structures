class PriorityQueue {
    private int maxsize;
    private long[]queArray;
    private int nItems;
    public PriorityQueue(int s){
        maxsize=s;
        queArray=new long[maxsize];
        nItems=0;
    }
    public void insert(long items){
        int j =0;
        if(nItems==0)
            queArray[nItems++]=items;
        else {
            for (j=nItems-1;j>=0;j--)
                if (items>queArray[j])
                    queArray[j+1]=queArray[j];
            else
                break;
        }
        queArray[j+1]=items;
        nItems++;
    }
    public long remove(){
        return queArray[--nItems];
    }
    public long peekmin(){
        return queArray[nItems-1];
    }
    public boolean isEmpty(){return (nItems==0);}
    public boolean isFull(){return (nItems==maxsize-1);}

    public static void main(String[] args) {
        PriorityQueue thePQ= new PriorityQueue(5);
        thePQ.insert(10);thePQ.insert(15);thePQ.insert(20);thePQ.insert(25);
    while (!thePQ.isEmpty()){
        long item=thePQ.remove();
        System.out.print(item+" ");
    }
        System.out.println("");
    }
}
