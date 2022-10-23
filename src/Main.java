import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //String [][] ArrAnimals = new String[][]{
        //        {"Єнот усурійський", "Nyctereutes procyonoides", "Gray", "1834", "Адвентивний вид.Зустрічається на всій території України, за виключенням Криму.У південних степових регіонах притрмується лісів, берегів річок та озер, сільськогосподарських угідь та приміських районів.", "0","Ліс"}
        //};

        Animals [] animals1 = new Animals[0];   // {Animals.CreateAnimals(ArrAnimals[0])};

        boolean quitmenu = false;
        int choosedMenuItem;

        Scanner in = new Scanner(System.in);


        //      String[] newElement = {"NewЧупакабра", "Чупакабра", "Прозора", "1000", "Невідома тварина", "1", "Скрізь"};
       //ArrAnimals = Menu.AddElementInMenu(ArrAnimals, newElement);


        //Menu.PrintMenu(ArrAnimals);


        do{

            System.out.println("0. Щоб вийти");
            Menu.PrintMenu(animals1);
            System.out.println(animals1.length+1 + ". щоб додати новий елемент");
            System.out.println("Або введтіть номер тварини, щоб переглянути її докладніше");

            choosedMenuItem = in.nextInt();

            if(choosedMenuItem==0)
                quitmenu = true;
            else if(choosedMenuItem==animals1.length+1)
                animals1=Menu.AddElementInMenu(animals1,Menu.newElementMenu());
            else {
                animals1[choosedMenuItem-1].Print("all");
                System.out.println("Якщо хочете почути голос тварини, нажміть Enter, або ввдедіть новий колір для тварини");

                Scanner sc2 = new Scanner(System.in);
                String newcolor = sc2.nextLine();
                if (newcolor.length()>0)
                {
                    animals1[choosedMenuItem-1].ChangeColor(newcolor);
                    animals1[choosedMenuItem-1].Print();
                }
                else
                    System.out.println("Тварина дає голос: "+ animals1[choosedMenuItem-1].getVoice());

                Menu.PrintMenu(animals1);
            }
            }
        while (!quitmenu);
        System.out.println("Робота завершена");

    }



}