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

    public static String [] itemsClothes = {"Baseball Style T-Shirt -Blue",
            "Bright Pink T-Shirt -Light Blue", "Camo Hoodie", "Superman-Style T-Shirt",
            "Tie-Dye T-Shirt (Green Blue and Black)"};

    public static String [] itemsSupplies = {"Combination Padlock",  "Swim Cap", "Kiski Area Gym Suit", "Water bottle"};
    public static String [] itemsSnacks ={"Kit Kat","M&Ms","Peppermint Patties","Twix","Twizzlers"};
    public static String [] itemsMisc = {"KA Baseball Cap", "KA Socks", "KA Drawstring bag" };

    public static String[] descriptionClothes = {"Baseball 3/4 inch cotton shirt", "Fluorescent pink cotton tee ",
            "A nice look for the hunting type", "Short sleeve tee for the cavalier super hero", "A totally rad and psychedelic cotton shirt"};
    public static String[] descriptionSupplies= {"The dial kind of lock", "Blue cap for keeping that hair dry and out of the way", "A fashionable outfit to sweat in", "Are you thirsty? This is exactly what you need."};
    public static String[] descriptionSnacks = {"Chocolate Wafers","Candy Covered Chocolate","Minty fresh","Chocolate covered cookie with caramel","Strawberry flavored"};

    public static String[] descriptionMisc = {"Nice to wear to a ball game on a sunny day", "Keep those feet toasty warm", "This will hold all of your gym clothes"};

    public static double[] priceClothes = {11, 14,  40, 15.50, 13, 17};
    public static double[] priceSupplies = {5, 4, 18, 12.50 };
    public static double[] priceSnacks = {0.75, 0.75, 0.5, 1.0, 1.25};
    public static double[] priceMisc = {12, 6.5, 8.75};

    public static int[] pictClothes = {R.drawable.clothing1, R.drawable.clothing2, R.drawable.clothing3, R.drawable.clothing4, R.drawable.clothing5};
    public static int[] pictSupplies = {R.drawable.supplies01, R.drawable.supplies2, R.drawable.supplies3, R.drawable.supplies4};
    public static int[] pictSnacks = {R.drawable.kk,R.drawable.mm,R.drawable.pp,R.drawable.tw,R.drawable.tz};
    public static int[] pictMisc = {R.drawable.misc1, R.drawable.misc2, R.drawable.misc3};







}
