package bankAccountApp;

public interface IBaseRate {
    //returns base rate
    default double getBaseRate() {
        return 2.5;
    }
}
