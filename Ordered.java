class Ordered {
    private long[]a;
    private int nElem;
    public Ordered(int max){
        a= new long[max];
        nElem=0;
}
    public int size(){
      return nElem;
}
    public int find (long searchkey){
        int lowerBound=0;
        int UpperBound=nElem-1;
        int mid;
        while (true){
            mid=(lowerBound+UpperBound)/2;
            if(a[mid]==searchkey)
                return mid;
            else if (lowerBound>UpperBound)
                return nElem;
            else
                if(a[mid]<searchkey)
                    lowerBound=mid+1;
                else
                    UpperBound=mid-1;
        }
    }
    public boolean delete(long value){
        int j;
        for(j=0;j<nElem;j++){
            if(value==a[j])
                break;
        }
        if(j==nElem)
            return false;
        else{
            for(int k=j;k<nElem;k++)
                a[k]=a[k+1];
            nElem--;
            return true;
        }
    }
    public void insert(long value){
        int j;
        for(j=0;j<nElem;j++)
            if(a[j]>value)
                break;
        for (int k=nElem;k>j;k--)
            a[k]=a[k-1];
        a[j]=value;
        nElem++;
    }
    public void display(){
        for (int i=0;i<nElem;i++)
            System.out.print(a[i]+" ");
        System.out.println("");
    }

    public static void main(String[] args) {
        int maxsize=15;

        Ordered arr;

        arr= new Ordered(maxsize);


        arr.insert(10);arr.insert(12);arr.insert(15);arr.insert(14);

        arr.display();

        int Searchkey=20;
        if(arr.find(Searchkey)!=arr.size())
            System.out.println("found"+Searchkey);
        else
            System.out.println("cat found"+Searchkey);

        arr.delete(12);arr.delete(10);
        arr.display();


    }
}
