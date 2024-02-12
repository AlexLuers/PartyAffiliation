/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package partyaffiliation;

/**
 *
 * @author Administrator
 */
public class PartyAffiliation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
        String menuChoice = "";
        //displaying the menu
        String menu = "D = Democratic/tR = Republican/tI = Independant/nChoose you move: ";
        System.out.print(menu);
        menuChoice = in.nextLine();
        //all the outputs
        if(menuChoice.equalsIgnoreCase("B"))
        {
            System.out.println("You are a Democratic Donkey!");
        }
        else if(menuChoice.equalsIgnoreCase("R"))
        {
            System.out.println("You are a Republican Elephant!");
        }
        else if(menuChoice.equalsIgnoreCase("I"))
        {
            System.out.println("You are an Independant Person!");
        }

    }
    
}
