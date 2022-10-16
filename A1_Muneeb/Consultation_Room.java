public class Consultation_Room 
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

        System.out.println("Block Name: " + block);
        System.out.println("Floor Number: " + floorno);
        System.out.println("Room Number: " + roomno);
    }

    //Parameterized Constructor:
    Consultation_Room(char block, int floorno, int roomno)
    {
        this.block = block;
        this.floorno = floorno;
        this.roomno = roomno;

    }

    //Copy Constructor
    Consultation_Room(Consultation_Room c_Consultation_Room)
    {
        block = c_Consultation_Room.block;
        floorno = c_Consultation_Room.floorno;
        roomno = c_Consultation_Room.roomno;
    }

    //

    //Converting to String
    public String toString()
    {
        return block +" "+ floorno + " " + roomno;
    }

}
