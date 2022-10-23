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

        return Animals.CreateAnimals(newElement);
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
