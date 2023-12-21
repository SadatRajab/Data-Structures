 class BubbleSort {
     private long[]a;
     private int nElem;
     public BubbleSort(int max){
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
    public void bubblesort(){
         int out , in;
         for (out=nElem-1;out>1;out--){
             for(in=0;in<out;in++)
                 if(a[in]>a[in+1])
                     swap(in,in+1);
         }
    }

     public static void main(String[] args) {
         int maxsize=15;

         BubbleSort arr;

         arr= new BubbleSort(maxsize);


         arr.insert(10);arr.insert(12);arr.insert(15);arr.insert(14);

         arr.display();
         arr.bubblesort();

         arr.display();

     }
 }
