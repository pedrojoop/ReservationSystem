public class Room {
    private boolean available;
    private int roomNumbers = 21;

    public int getRoomNumbers() {
        return roomNumbers;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    
}
