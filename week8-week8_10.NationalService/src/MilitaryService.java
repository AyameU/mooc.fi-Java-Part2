public class MilitaryService implements NationalService {
    private int daysOfService;

    public MilitaryService(int daysOfService) {
        this.daysOfService = daysOfService;
    }

    public int getDaysLeft() {
        return this.daysOfService;
    }

    public void work() {
        if(this.daysOfService == 0) {
            daysOfService = 0;
        }
        else {
            this.daysOfService--;
        }
    }
}
