package designpatterns.structurepatterns;

public class SkiResortFacade {
    private SkiRent skiRent = new SkiRent();
    private SkiResortTicketSystem skiResortTicketSystem = new SkiResortTicketSystem();
    private HotelBookSystem hotelBookSystem = new HotelBookSystem();

    public int haveGoodRest(int height, int weight, int feetSize, int skierLevel, int roomQuality) {
        int skiPrice = skiRent.rentSki(weight,skierLevel);
        int skiBootsPrice = skiRent.rentBoots(feetSize,skierLevel);
        int polePrice = skiRent.rentPole(height);
        int oneDayTicketPrice = skiResortTicketSystem.buyOneDayTicket();
        int hotelPrice = hotelBookSystem.bookRoom(roomQuality);
        return skiPrice + skiBootsPrice + polePrice + oneDayTicketPrice + hotelPrice;
    }

    public int haveRestWithOwnSki(int roomQuality){
        int oneDayTicketPrice = skiResortTicketSystem.buyOneDayTicket();
        int hotelPrice = hotelBookSystem.bookRoom(roomQuality);
        return oneDayTicketPrice + hotelPrice;
    }
}
