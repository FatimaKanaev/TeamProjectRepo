import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WalkingToMermaid2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WalkToMermaid2 extends World
{

    /**
     * Constructor for objects of class WalkingToMermaid2.
     * 
     */
    public WalkToMermaid2()
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
        addObject(michel,86,71);
        MainCharacter mainCharacter = new MainCharacter();
        addObject(mainCharacter,107,126);
        mainCharacter.setLocation(109,147);
        mainCharacter.setLocation(109,131);
        mainCharacter.setLocation(103,131);
        mainCharacter.setLocation(103,123);
        mainCharacter.setLocation(102,124);
        Michel michel2 = new Michel();
        addObject(michel2,62,123);
        Michel michel3 = new Michel();
        addObject(michel3,202,132);
        Michel michel4 = new Michel();
        addObject(michel4,126,42);
        Michel michel5 = new Michel();
        addObject(michel5,183,107);
        Michel michel6 = new Michel();
        addObject(michel6,82,201);
        Michel michel7 = new Michel();
        addObject(michel7,89,313);
        Michel michel8 = new Michel();
        addObject(michel8,35,148);
        Michel michel9 = new Michel();
        addObject(michel9,7,308);
        Michel michel10 = new Michel();
        addObject(michel10,34,324);
        Michel michel11 = new Michel();
        addObject(michel11,115,341);
        Michel michel12 = new Michel();
        addObject(michel12,155,362);
        Michel michel13 = new Michel();
        addObject(michel13,178,400);
        Michel michel14 = new Michel();
        addObject(michel14,239,427);
        Michel michel15 = new Michel();
        addObject(michel15,258,70);
        Michel michel16 = new Michel();
        addObject(michel16,320,45);
        Michel michel17 = new Michel();
        addObject(michel17,308,57);
        Michel michel18 = new Michel();
        addObject(michel18,358,32);
        Michel michel19 = new Michel();
        addObject(michel19,401,45);
        Michel michel20 = new Michel();
        addObject(michel20,477,45);
        Michel michel21 = new Michel();
        addObject(michel21,509,49);
        Michel michel22 = new Michel();
        addObject(michel22,568,78);
        Michel michel23 = new Michel();
        addObject(michel23,555,128);
        Michel michel24 = new Michel();
        addObject(michel24,623,148);
        Michel michel25 = new Michel();
        addObject(michel25,665,152);
        Michel michel26 = new Michel();
        addObject(michel26,716,121);
        Michel michel27 = new Michel();
        addObject(michel27,675,186);
        Bernard bernard = new Bernard();
        addObject(bernard,0,152);
        Bernard bernard2 = new Bernard();
        addObject(bernard2,0,222);
        Bernard bernard3 = new Bernard();
        addObject(bernard3,0,276);
        Bernard bernard4 = new Bernard();
        addObject(bernard4,747,123);
        Bernard bernard5 = new Bernard();
        addObject(bernard5,747,172);
        Bernard bernard6 = new Bernard();
        addObject(bernard6,747,239);
        bernard6.setLocation(747,279);

        Gérarld gérarld = new Gérarld();
        addObject(gérarld,255,431);
        Gérarld gérarld2 = new Gérarld();
        addObject(gérarld2,327,431);
        Gérarld gérarld3 = new Gérarld();
        addObject(gérarld3,435,431);
        Gérarld gérarld4 = new Gérarld();
        addObject(gérarld4,563,431);
        GoodGérarld goodGérarld = new GoodGérarld();
        addObject(goodGérarld,695,430);
        GoodBernard goodBernard = new GoodBernard();
        addObject(goodBernard,746,390);
    }
}
