package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
      Input input = new Input();

    }

    public String getString(){
        return scanner.nextLine();

    }
    public boolean yesNo(){

    }

    public int getInt(int min, int max){

    }

    public int getInt(){

    }

    public double getDouble(double min, double max){

    }

    public double getDouble(){

    }
}
