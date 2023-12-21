class SelectionSort {
    private long[]a;
    private int nElem;
    public SelectionSort(int max){
        a= new long[max];
        nElem=0;}
    public void display(){
        for (int i=0;i<nElem;i++)
            System.out.print(a[i]+" ");
        System.out.println("");
    }
    public void insert(long value){
        a[nElem]=value;
        nElem++;
    }
    private void swap(int one,int two){
        long temp =a[one];
        a[one]=a[two];
        a[two]=temp;
    }
    public void selectionsort(){
        int out , in , min=0 ;

        for(out=0;out<nElem-1;out++)
            min=out;
            for (in=out+1;in<nElem;in++)
                if(a[in]<a[min])
                    min=in;
        swap(out,min);
    }
    public static void main(String[] args) {
        int maxsize=15;

        SelectionSort arr;

        arr= new SelectionSort(maxsize);


        arr.insert(10);arr.insert(12);arr.insert(15);arr.insert(14);

        arr.display();
        arr.selectionsort();

        arr.display();

    }
}
