class link {
    public int iData;
    public double dData;
    public link next;

    public link(int id , double dd){
        iData=id;
        dData=dd;
    }
    public void displaylink(){
        System.out.println("{"+iData+","+dData+"}");
    }
}
