import java.util.concurrent.CountDownLatch;

public class Consultation_Room implements Cloneable
{
    private char block;      //A-Z
    private int floorno;     //Floor number(0-5)
    private int roomno;      //201-215(each floor has 15 rooms)


    //No Parameterized Constructor:
    Consultation_Room()
    {
        block = 'A';
        floorno = 2;
        roomno = 205;
    }

    public void default_room()
    {
        System.out.println("\t Default Parameter \t");
        System.out.println("Block: " + block + "\n Floor No: " + floorno + "\n Room No: " + roomno);
    }

    //Parameterized Constructor:
    Consultation_Room(char block, int floorno, int roomno)
    {
        this.block = block;
        this.floorno = floorno;
        this.roomno = roomno;

    }
    public void paramterized_room()
    {
        System.out.println("\t Parameterized \t");
        System.out.println("Block: " + block + "\n Floor No: " + floorno + "\n Room No: " + roomno);
    }

    //Setter method
    public void setConsultR(char block, int floorno, int roomno)
    {
        this.block = block;
        this.floorno = floorno;
        this.roomno = roomno;
    }

    public void setter_room()
    {
        System.out.println("\t Default Parameter \t");
        System.out.println("Block: " + block + "\n Floor No: " + floorno + "\n Room No: " + roomno);
    }

    //Getter Method
    public char getBlock()
    {
        return block;
    }
    public int floorno()
    {
        return floorno;
    }
    public int roomno()
    {
        return roomno;
    }

    public String getRoom()
    {
        return this.block + " " +this.floorno + " " + this.roomno;
    }

    //Copy Constructor
    Consultation_Room(Consultation_Room c_Consultation_Room)
    {
        block = c_Consultation_Room.block;
        floorno = c_Consultation_Room.floorno;
        roomno = c_Consultation_Room.roomno;
    }

    //Converting to String
    public String toString()
    {
        return "Block: "+block + " Floor Number: " + floorno + "Room Number:  " + roomno;
    }
    
    //@Override
    public int CompareTo(Consultation_Room a)
    {
        return this.getRoom().compareTo(a.getRoom());
    }
    //Cloning Object
    @Override
    public Object clone()throws CloneNotSupportedException
    {
        return super.clone();
    }

    
}