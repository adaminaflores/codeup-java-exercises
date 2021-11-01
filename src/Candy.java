public class Candy {
    public String name;
    public String size;

    public void talkAboutCandy(){
        System.out.printf("Nice! You got a %s! And its a %s! Yummy! %n", this.name, this.size);
    }

    public Candy(String name){
        this.name = name;
        this.size = "Unknown";

    }

    public Candy(String name, String size){
        this.name = name;
        this.size = size;
    }

    public static void main(String[] args) {

        Candy unknownCandy = new Candy("Funky Candy");

        System.out.println("unknownCandy.name = " + unknownCandy.name);
        System.out.println("unknownCandy.size = " + unknownCandy.size);


        Candy funSizeSnickers = new Candy("Snickers", "Fun Size");
        System.out.println(("funSizeSnickers.name = " + funSizeSnickers.name));


    }



}
