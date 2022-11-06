public class Consultation_Room implements Comparable <Consultation_Room> ,Cloneable
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

    //Parameterized Constructor:
    Consultation_Room(char block, int floorno, int roomno)
    {
        this.block = block;
        this.floorno = floorno;
        this.roomno = roomno;

    }

    //Setter method
    public void setConsultR(char block, int floorno, int roomno)
    {
        this.block = block;
        this.floorno = floorno;
        this.roomno = roomno;
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
        System.out.println("____________________________________________");
        return "\nBlock: " + block + "\nFloor Number: " + floorno + "\nRoom Number:  " + roomno;
    }
    
    
    //Cloning Object
    @Override
    public Object clone()throws CloneNotSupportedException
    {
        return super.clone();
    }
   

    @Override
    public int compareTo(Consultation_Room o) {
        return this.getRoom().compareTo(o.getRoom());
    }
}