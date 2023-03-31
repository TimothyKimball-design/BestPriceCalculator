/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package timothykimball2;

/**
 *
 * @author Eon
 */
import java.util.Scanner;
public class PackageWithBestPriceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
            System.out.println("Enter the price of the first package: ");
            double price_pack1 = input.nextDouble();
            System.out.println("Enter the price of the second package: ");
            double price_pack2 = input.nextDouble();
            System.out.println("Enter the price of the first package: ");
            double weight_pack1 = input.nextDouble();
            System.out.println("Enter the price of the second package: ");
            double weight_pack2 = input.nextDouble();
            
            double PricePerUnit_pack1 = (price_pack1/weight_pack1);
            double PricePerUnit_pack2 = (price_pack2/weight_pack2);
           
            if(PricePerUnit_pack1 < PricePerUnit_pack2)
                System.out.println("Package 1 has a better price"); 
                else if (PricePerUnit_pack1 == PricePerUnit_pack2)
                System.out.println("Package 1 and 2 have the same unit price.");
                else
                System.out.println("Package 3 has a better price");
        
               
    }
}
