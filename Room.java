public class Room {
    int roomno;
    String roomtype;
    float roomarea;
    boolean ACmachine;
    public Room()
    {
        System.out.println("Hello");

    }
    public Room (int p,String r,float s,boolean b){
        this.roomno=p;
        this.roomtype=r;
        this.roomarea=s;
        this.ACmachine=b;

    }
    public void displayData()
    {
        System.out.println(roomno);
        System.out.println(roomtype);
        System.out.println(roomarea);
        System.out.println(ACmachine);
    }
    public static void main(String[] args){
        Room obj1=new Room();
        Room obj2=new Room(1,"single",43,true);
        obj2.displayData();

    }
}
