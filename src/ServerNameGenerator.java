public class ServerNameGenerator {
    public static int randomNumber() {
        int min = 0;
        int max = 9;
        int range = max - min;
        int randomNumber = 0;
        for (int i = 0; i < 10; i++) {
            randomNumber = (int) (Math.random() * range) + min;
        }
        return randomNumber;

    }

    public static void main(String[] args) {
        String[] adjective = {"panoramic", "tall", "spiritual", "difficult", "giddy",
                "lethal", "unhealthy", "gaudy", "breakable", "faded"};
        String[] noun = {"organization", "presence", "story", "menu", "connection", "agency", "conclusion", "introduction", "speaker", "analysis"};


        System.out.println("Here is your server name: ");
        System.out.println(adjective[randomNumber()] + "-" + noun[randomNumber()]);


    }


}
