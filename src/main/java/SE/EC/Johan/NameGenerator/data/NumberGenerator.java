package SE.EC.Johan.NameGenerator.data;


import java.util.concurrent.ThreadLocalRandom;

public class NumberGenerator  {
    public static int randomBoyNumber() {
        int randomBoyValue = ThreadLocalRandom.current().nextInt(0, NameReader.pojkNamn().size() );
        return randomBoyValue;
    }
    public static int randomGirlNumber() {
        int randomGirlValue = ThreadLocalRandom.current().nextInt(0, NameReader.flickNamn().size() );
        return randomGirlValue;
    }
    public static int randomLastNameNumber() {
        int randomLastNameValue = ThreadLocalRandom.current().nextInt(0, NameReader.efterNamn().size() );
        return randomLastNameValue;
    }

}
