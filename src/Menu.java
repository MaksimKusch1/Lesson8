import java.util.Scanner;


public class Menu {

    public static Animals newElementMenu(){
        Scanner inNewElementText = new Scanner(System.in);
        System.out.println("Щоб додати новий елемент необхідно ввести його назву і колір");
        String[] newElement = new String[7];
        System.out.println("Введіть назву:");
        newElement[0] = inNewElementText.nextLine();
        System.out.println("Введіть назву латиною:");
        newElement[1] = inNewElementText.nextLine();
        System.out.println("Введіть колір:");
        newElement[2] = inNewElementText.nextLine();
        System.out.println("Введіть рік відкриття:");
        newElement[3] = inNewElementText.nextLine();
        System.out.println("Введіть опис:");
        newElement[4] = inNewElementText.nextLine();
        System.out.println("Введіть тип:");
        newElement[5] = inNewElementText.nextLine();
        System.out.println("Введіть де мешкає:");
        newElement[6] = inNewElementText.nextLine();



        try {
            return Animals.CreateAnimals(newElement);
        }
        catch (Exception E){
            System.out.println("Не зміг створити елемент через невіно задану інформацію по тварину");
        }
        finally {
            String logstring = "Введіть назву: " + newElement[0] + "; Введіть назву латиною:" + newElement[1]+"; Введіть колір:"+newElement[2]+"; Введіть рік відкриття:"+newElement[3]+"; Введіть опис:"+newElement[4]+"; Введіть тип:"+newElement[5]+"; Введіть де мешкає:"+newElement[6]+";";
            LoggingClass.writeUsingFileWriter(logstring);
            return null;
        }

    }


    public static Animals[] AddElementInMenu(Animals[] MenuList, Animals <Animals> NewElementInMenu){
        Animals[] newMenuList = new Animals[MenuList.length + 1];

        for(int i=0; i<= newMenuList.length-1; i++) {
            if(i < newMenuList.length-1){
                newMenuList[i] =  MenuList[i];
            }
            else{
                newMenuList[i] = NewElementInMenu;
            }
        }

        return newMenuList;
    }

    public static void PrintMenu(Animals[] MenuList){
        for(int i=1; i<=MenuList.length; i++)
            System.out.println(i+". "+MenuList[i-1].getName());
    }

}
