import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String [][] ArrAnimals = new String[][]{
                {"Єнот усурійський", "Nyctereutes procyonoides", "Gray", "1834", "Адвентивний вид.Зустрічається на всій території України, за виключенням Криму.У південних степових регіонах притрмується лісів, берегів річок та озер, сільськогосподарських угідь та приміських районів.", "0","Ліс"}
        };

        //Animals [] animals1 = {Animals.CreateAnimals(ArrAnimals[0])};

        boolean quitmenu = false;
        int choosedMenuItem;

        Scanner in = new Scanner(System.in);


        //      String[] newElement = {"NewЧупакабра", "Чупакабра", "Прозора", "1000", "Невідома тварина", "1", "Скрізь"};
       //ArrAnimals = Menu.AddElementInMenu(ArrAnimals, newElement);


        //Menu.PrintMenu(ArrAnimals);


        do{

            System.out.println("0. щоб вийти");
            Menu.PrintMenu(ArrAnimals);
            System.out.println(ArrAnimals.length+1 + ". щоб додати новий елемент");

            choosedMenuItem = in.nextInt();

            if(choosedMenuItem==0)
                quitmenu = true;
            else if(choosedMenuItem==ArrAnimals.length+1)
                ArrAnimals=Menu.AddElementInMenu(ArrAnimals,Menu.newElementMenu());
            else
                Menu.PrintMenu(ArrAnimals);

            }
        while (!quitmenu);
        System.out.println("Робота завершена");

    }



}