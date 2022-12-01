import java.util.Arrays;

public class Farm1 {

    private String adress;
    private int cows;
    private int horses;
    private int shepp;
    private String ownernikcname;
    private Cow cow[];
    private Horse horse[];
    private Sheep sheep[];

    public Farm1(String adress, int cows, int horses, int shepp, String ownernikcname, Cow[] cow, Horse[] horse, Sheep[] sheep) {
        this.adress = adress;
        this.cows = cows;
        this.horses = horses;
        this.shepp = shepp;
        this.ownernikcname = ownernikcname;
        this.cow = cow;
        this.horse = horse;
        this.sheep = sheep;
    }

    @Override
    public String toString() {
        return "Farm1" +
                "Adress=" + adress +
                " Cows=" +cows +
                " Horse=" + horses +
                " Shepp=" + shepp +
                " Ownernikcname='" + ownernikcname + "\n" +
                " Cow=" + Arrays.toString(cow) +
                " Horse=" + Arrays.toString(horse) +
                " Sheep=" + Arrays.toString(sheep) + "\n" +
                "#################################################";
    }
}
