import java.util.Arrays;

public class Candy {
    public String name;
    public String size;
    public String[] descriptors;

    public void talkAboutCandy() {
        System.out.printf("Nice! You got a %s! And its a %s! Yummy! %n", this.name, this.size);
    }

    public Candy(String name) {
        this.name = name;
        this.size = "Unknown";

    }

    public Candy(String name, String size) {
        this.name = name;
        this.size = size;
    }
    public Candy(String name, String size, String[] descriptors){
        this.name = name;
        this.size = size;
        this.descriptors = descriptors;
    }


    public static void main (String[]args){

        Candy unknownCandy = new Candy("Funky Candy");

        System.out.println("unknownCandy.name = " + unknownCandy.name);
        System.out.println("unknownCandy.size = " + unknownCandy.size);


        Candy funSizeSnickers = new Candy("Snickers", "Fun Size", new String[]{"Peanuts", "Chocolate", "Classic Candy"});
        System.out.println(("funSizeSnickers.name = " + funSizeSnickers.name));

        Candy twix = new Candy("Twix", "King Size", new String[]{"Chocolate covered", "Caramel", "Shortbread Cookie"});

        System.out.println(Arrays.toString(twix.descriptors));

        Candy [] myBag = {funSizeSnickers, twix};

        for(Candy singleCandy : myBag) {
            String descriptors = Arrays.toString(singleCandy.descriptors);
                descriptors = descriptors.substring(1, descriptors.length() - 1);


        }


    }

}