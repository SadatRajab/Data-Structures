class linklist {
    private link first;
    public linklist(){
        first=null;
    }
    public boolean isEmpty(){
        return (first==null);
    }
    public void insertFirst(int id ,double dd){
        link newlink=new link(id,dd);
        newlink.next=first;
        first=newlink;
    }
    public link deleteFrist(){
        link temp =first;
        first=first.next;
        return temp;
    }
    public link find(int key){
        link current=first;
        while (current.iData!=key){
            if(current.next==null)
                return null;
            else
                current=current.next;
        }
        return current;
    }
    public link delete(int key){
        link current=first;
        link previous =first;
        while (current.iData!=key){
            if (current.next==null)
                return null;
            else {
                previous=current;
                current=current.next;
            }

        }
        if(current==first)
            first=first.next;
        else
            previous.next=current.next;
        return current;
    }
    public void displaylist(){
        System.out.println("List (first --> last): ");
        link current=first;
        while (current!=null){
            current.displaylink();
            current=current.next;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        linklist thelist=new linklist();
        thelist.insertFirst(10,9.99);thelist.insertFirst(11,10.99);thelist.insertFirst(12,11.99);thelist.insertFirst(13,12.99);
        thelist.displaylist();
        while (!thelist.isEmpty()){
            link alink=thelist.deleteFrist();
            System.out.println("Deleted");
            alink.displaylink();
            System.out.println("");
        }
        thelist.displaylist();

        link f=thelist.find(12);
        if(f!=null)
            System.out.println("found link key "+f.iData);
        else
            System.out.println("cant find ");

        link d =thelist.delete(10);
        if (d!=null)
            System.out.println("delete link "+ d.iData);
        else
            System.out.println("cant delete");
        thelist.displaylist();
    }
}
