import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WalkToTheWitch1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WalkToTheWitch1 extends World
{

    /**
     * Constructor for objects of class WalkToTheWitch1.
     * 
     */
    public WalkToTheWitch1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(747, 431, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Michel michel = new Michel();
        addObject(michel,290,400);
        Michel michel2 = new Michel();
        addObject(michel2,330,390);
        Michel michel3 = new Michel();
        addObject(michel3,243,260);
        Michel michel4 = new Michel();
        addObject(michel4,667,360);
        Michel michel5 = new Michel();
        addObject(michel5,709,245);
        Michel michel6 = new Michel();
        addObject(michel6,714,64);
        Michel michel9 = new Michel();
        addObject(michel9,532,81);
        Michel michel11 = new Michel();
        addObject(michel11,634,397);
        Michel michel12 = new Michel();
        addObject(michel12,677,292);
        Michel michel13 = new Michel();
        addObject(michel13,489,279);
        Michel michel14 = new Michel();
        addObject(michel14,590,277);
        Michel michel15 = new Michel();
        addObject(michel15,299,190);
        Michel michel16 = new Michel();
        addObject(michel16,402,190);
        Michel michel17 = new Michel();
        addObject(michel17,124,104);
        Michel michel18 = new Michel();
        addObject(michel18,49,146);
        MainCharacter mainCharacter = new MainCharacter();
        addObject(mainCharacter,71,380);
        Michel michel19 = new Michel();
        addObject(michel19,12,227);
        Michel michel20 = new Michel();
        addObject(michel20,24,391);
        Michel michel21 = new Michel();
        addObject(michel21,7,375);
        Michel michel22 = new Michel();
        addObject(michel22,301,380);
        Michel michel23 = new Michel();
        addObject(michel23,346,392);
        Michel michel24 = new Michel();
        addObject(michel24,684,268);
        Michel michel25 = new Michel();
        addObject(michel25,709,371);
        Michel michel26 = new Michel();
        addObject(michel26,203,184);
        Michel michel27 = new Michel();
        addObject(michel27,603,286);
        Michel michel28 = new Michel();
        addObject(michel28,214,270);
        Michel michel29 = new Michel();
        addObject(michel29,121,196);
        Michel michel30 = new Michel();
        addObject(michel30,54,199);
        Michel michel31 = new Michel();
        addObject(michel31,312,163);
        Michel michel32 = new Michel();
        addObject(michel32,501,46);
        Michel michel33 = new Michel();
        addObject(michel33,444,38);
        Michel michel34 = new Michel();
        addObject(michel34,380,142);
        Michel michel35 = new Michel();
        addObject(michel35,375,67);
        Michel michel36 = new Michel();
        addObject(michel36,345,164);
        Michel michel37 = new Michel();
        addObject(michel37,479,57);
        Michel michel38 = new Michel();
        addObject(michel38,669,144);
        Michel michel39 = new Michel();
        addObject(michel39,634,143);
        Michel michel40 = new Michel();
        addObject(michel40,549,276);
        Michel michel41 = new Michel();
        addObject(michel41,546,237);
        Michel michel42 = new Michel();
        addObject(michel42,443,322);
        Michel michel43 = new Michel();
        addObject(michel43,586,20);
        Bernard bernard = new Bernard();
        addObject(bernard,0,290);
        bernard.setLocation(0,332);
        Bernard bernard2 = new Bernard();
        addObject(bernard2,0,332);
        Gérarld gérarld = new Gérarld();
        addObject(gérarld,71,430);
        Gérarld gérarld2 = new Gérarld();
        addObject(gérarld2,200,430);
        GoodGérarld goodGérarld = new GoodGérarld();
        addObject(goodGérarld,676,1);
        GoodGérarld goodGérarld2 = new GoodGérarld();
        addObject(goodGérarld2,737,0);
    }
}
