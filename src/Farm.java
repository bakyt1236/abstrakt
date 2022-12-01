import java.util.Arrays;

public class Farm {

    private String adress;
    private int cow;
    private int horse;
    private int shepp;
    private String ownernikcname;
    private Cow cows[];
    private Horse horses[];
    private Sheep sheeps[];

    public Farm(String adress, int cow, int horse, int shepp, String ownernikcname, Cow[] cows, Horse[] horses, Sheep[] sheeps) {
        this.adress = adress;
        this.cow = cow;
        this.horse = horse;
        this.shepp = shepp;
        this.ownernikcname = ownernikcname;
        this.cows = cows;
        this.horses = horses;
        this.sheeps = sheeps;
    }

    @Override
    public String toString() {
        return "#################################################" + "\n" +
                "Farm" +
                "Adress=" + adress +
                " Cows=" + cow +
                " Horse=" + horse +
                " Shepp=" + shepp +
                " Ownernikcname=" + ownernikcname + "\n" +
                " Cow=" + Arrays.toString(cows) +
                " Hourse=" + Arrays.toString(horses) +
                " Sheep=" + Arrays.toString(sheeps) + "\n" +
                "#################################################";
    }
}



