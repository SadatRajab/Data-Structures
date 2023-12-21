class Deleteitem {
    private long[]a;
    private int nElem;
    public Deleteitem(int max){
        a= new long[max];
        nElem=0;
    }
    public boolean find(int Searchkey){
        int j;
        for(j=0;j<nElem;j++){
            if(a[j]==Searchkey)
                break;
        }
        if(j==nElem)
            return false;
        else
            return true;
    }
    public void insert(long value){
        a[nElem]=value;
        nElem++;
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
    public void display(){
        for (int i=0;i<nElem;i++)
            System.out.print(a[i]+" ");
        System.out.println("");
    }

    public static void main(String[] args) {
        int maxsize=15;

        Deleteitem arr;

        arr= new Deleteitem(maxsize);


        arr.insert(10);arr.insert(12);arr.insert(15);arr.insert(14);

        arr.display();

        int Searchkey=20;
        if(arr.find(Searchkey))
            System.out.println("found"+Searchkey);
        else
            System.out.println("cat found"+Searchkey);

        arr.delete(12);arr.delete(10);
        arr.display();


    }




}

