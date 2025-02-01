public class HotelBooking {
    private String guestname;
    private String roomtype;
    private int nights;
    public HotelBooking(){
        this.guestname = "";
        this.roomtype = "";
        this.nights=0;
    }
    public HotelBooking(String guestname,String roomtype,int nights){
        this.guestname = guestname;
        this.nights=nights;
        this.roomtype=roomtype;
    }
    public HotelBooking(HotelBooking B){
        this.guestname=B.guestname;
        this.nights=B.nights;
        this.roomtype=B.roomtype;
    }
    public void displayDetails(){
        System.out.println("Guest Name: "+this.guestname);
        System.out.println(this.nights);
        System.out.println(roomtype);
    }
    public static void main(String[] args) {
        HotelBooking B1 = new HotelBooking("John", "Single", 2);
        HotelBooking B2=new HotelBooking();
        HotelBooking B3=new HotelBooking(B1);
        B1.displayDetails();

    }
}
