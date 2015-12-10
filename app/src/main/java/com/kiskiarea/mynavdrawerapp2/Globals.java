package com.kiskiarea.mynavdrawerapp2;

import android.app.Activity;
import android.app.Application;
import android.support.v4.app.FragmentActivity;

/**
 * Created by Melissa on 12/6/2015.
 */
public class Globals extends Application
{
    public static int current_category;

    public static String [] itemsClothes = {"Baseball Style T-Shirt -Black", "Baseball Style T-Shirt -Blue",
            "Baseball Style T-Shirt -Light Blue", "Camo Hoodie", "Camo Style T-Shirt",
            "Cavalier Crew Neck Sweatshirt", "Flash Jacket", "Football Crewneck Sweatshirt",
            "Football Crewneck Sweatshirt-Blue", "KA Cavalier Socks",
            "Kiski Area Cavaliers Neon T-shirt", "Kiski Area Sweatpants (Blue)",
            "Kiski Area Sweatpants (Grey)", "Kiski Area T-Shirt (Pink)", "Long-Sleeve shirt (Blue)",
            "Long-Sleeve shirt (Grey)", "Mesh Stadium Replica Jersey", "Performance Fleece Jacket",
            "Superman-Style T-Shirt", "Tie-Dye T-Shirt", "Tie-Dye T-Shirt (Green Blue and Black)",
            "Tie-Dye T-Shirt (Rainbow)"};

    public static String [] itemsSupplies = {"16 GB Flash Drive", "Combination Padlock", "Kiski Area Gym Suit", "Nylon Drawstring bag", "Pencil", "Swim Cap" };
    public static String [] itemsSnacks = {"York Peppermint Patties", "M&Ms", "KitKats"};
    public static String [] itemsMisc = {"Blanket ", "KA Baseball Cap", "KA Water Bottle" };

    public static String[] descriptionClothes = {""};
    public static String[] descriptionSupplies= {""};
    public static String[] descriptionSnacks = {"York Peppermint Patties", "M&Ms", "KitKats"};
    public static String[] descriptionMisc = {""};

    public static double[] priceClothes = {14, 14, 14, 40, 17, 27, 38, 16.5, 16.5, 7, 11, 20, 20, 11, 11, 11, 22.5, 38, 15, 14, 14, 14};
    public static double[] priceSupplies = {8, 5, 18, 10.5, 3.5 };
    public static double[] priceSnacks = {0.75, 0.75, 0.5};
    public static double[] priceMisc = {21, 10.5, 5};

    public static String[] pictClothes;
    public static String[] pictSupplies;
    public static String[] pictSnacks = {"pp", "mm", "kk" };
    public static String[] pictMisc;


    /** Getter for the clothing item array */
    public String[] getItemsClothes(){
        return this.itemsClothes;
    }

    /** Getter for the supplies item array */
    public String[] getItemsSupplies(){
        return itemsSupplies;
    }

    /** Getter for the snacks item array */
    public String[] getItemsSnacks() {
        return itemsSnacks;
    }

    /** Getter for the misc item array */
    public String[] getItemsMisc() {
        return itemsMisc;
    }

    /** Getter for description clothes array */
    public String[] getDescriptionClothes(){
        return descriptionClothes;
    }

    /** Getter for description supplies array */
    public String[] getDescriptionSupplies(){
        return descriptionSupplies;
    }

    /** Getter for description snacks array */
    public String[] getDescriptionSnacks() {
        return descriptionSnacks;
    }

    /** Getter for description misc array */
    public String[] getDescriptionMisc(){
        return descriptionMisc;
    }

    /** Getter for price clothes array */
    public double[] getPriceClothes(){
        return priceClothes;
    }

    /** Getter for price clothes array */
    public double[] getPriceSupplies(){
        return priceSupplies;
    }

    /** Getter for price clothes array */
    public double[] getPriceSnacks(){
        return priceSnacks;
    }

    /** Getter for price clothes array */
    public double[] getPriceMisc(){
        return priceMisc;
    }

    /** Getter for pict clothes array */
    public String[] getPictClothes(){
        return pictClothes;
    }

    /** Getter for pict supplies array */
    public String[] getPictSupplies(){
        return pictSupplies;
    }


    /** Getter for pict snacks array */
    public String[] getPictSnacks(){
        return pictSnacks;
    }

    /** Getter for pict misc array */
    public String[] getPictMisc(){ return pictMisc;}




    public void setItemsSupplies(String[] itemsSupplies) {
        this.itemsSupplies = itemsSupplies;
    }






}
