import java.util.Scanner;

public class Menu {

    public static String[] newElementMenu(){
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

        return newElement;
    }


    public static String [][] AddElementInMenu(String[][] MenuList, String[] NewElementInMenu){
        String[][] newMenuList = new String[MenuList.length + 1][];

        for(int i=0; i<= newMenuList.length-1; i++) {
            if(i < newMenuList.length-1){
                newMenuList[i] = MenuList[i];
            }
            else{
                newMenuList[i] = NewElementInMenu;
            }
        }

        return newMenuList;
    }

    public static void PrintMenu(String [][] MenuList){
        for(int i=1; i<=MenuList.length; i++)
            System.out.println(i+" "+MenuList[i-1][0]);
    }


}
