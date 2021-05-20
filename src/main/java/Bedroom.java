public class Bedroom extends Room{

    private int roomNumber;
    private RoomType roomType;

    public Bedroom(int roomNumber, RoomType roomType) {
        super(roomType.getValue());
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    // GETTERS
    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }


}
