public class Animal {

    private String nickname;
    private String gender;
    private double weight;
    private double age;

    public Animal(String nickname, String gender, double weight, double age) {
        this.nickname = nickname;
        this.gender = gender;
        this.weight = weight;
        this.age = age;
    }


    public String toString() {
        return
                "Nickname=" + nickname +'\''+
                        " Gender=" + gender +'\''+
                        " Weight=" + weight +'\''+
                        " Age=" + age + "\n";
    }
}


