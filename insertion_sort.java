import java.util.Scanner;

class insertion_sort {
    private long []a ;
    private int nElem;
    public insertion_sort(int max){
        a=new long[max];
        nElem=0;
    }
    public void insert(long num){
        a[nElem]=num;
        nElem++;
    }
    public void display(){
        for (int i=0;i<nElem;i++)
            System.out.print(a[i]+" ");
        System.out.println("");
    }
    public void insertionsort(){
        int in , out;
        for (out=1;out<nElem;out++){
            long temp=a[out];
            in =out;
            while (in>0 && a[in-1]>=temp){
                a[in]=a[in-1];
                --in;
            }a[in]=temp;
    }
}

    public static void main(String[] args) {
        int maxsize=10;

        insertion_sort arr;
        arr = new insertion_sort(maxsize);
        Scanner input =new Scanner(System.in);
          arr.insert(10);arr.insert(5);arr.insert(1);

        arr.display();
        arr.insertionsort();
        arr.display();
    }
}
