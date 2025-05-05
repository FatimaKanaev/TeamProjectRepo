import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WalkToTheWitch2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WalkToTheWitch2 extends World
{

    /**
     * Constructor for objects of class WalkToTheWitch2.
     * 
     */
    public WalkToTheWitch2()
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
        MainCharacter mainCharacter = new MainCharacter();
        addObject(mainCharacter,380,107);
        mainCharacter.setLocation(369,109);
        Michel michel = new Michel();
        addObject(michel,411,116);
        Michel michel2 = new Michel();
        addObject(michel2,603,201);
        Michel michel3 = new Michel();
        addObject(michel3,589,217);
        Michel michel4 = new Michel();
        addObject(michel4,554,229);
        Michel michel5 = new Michel();
        addObject(michel5,509,240);
        Michel michel6 = new Michel();
        addObject(michel6,467,251);
        Michel michel7 = new Michel();
        addObject(michel7,444,267);
        Michel michel8 = new Michel();
        addObject(michel8,422,287);
        Michel michel9 = new Michel();
        addObject(michel9,414,307);
        Michel michel10 = new Michel();
        addObject(michel10,412,329);
        Michel michel11 = new Michel();
        addObject(michel11,426,357);
        Michel michel12 = new Michel();
        addObject(michel12,460,388);
        Michel michel13 = new Michel();
        addObject(michel13,499,407);
        Michel michel14 = new Michel();
        addObject(michel14,555,429);
        Michel michel15 = new Michel();
        addObject(michel15,501,124);
        Michel michel16 = new Michel();
        addObject(michel16,573,124);
        Michel michel17 = new Michel();
        addObject(michel17,420,124);
        Michel michel18 = new Michel();
        addObject(michel18,458,124);
        Michel michel19 = new Michel();
        addObject(michel19,225,85);
        Michel michel20 = new Michel();
        addObject(michel20,173,83);
        Michel michel21 = new Michel();
        addObject(michel21,137,78);
        Michel michel22 = new Michel();
        addObject(michel22,81,83);
        Michel michel23 = new Michel();
        addObject(michel23,33,83);
        Michel michel24 = new Michel();
        addObject(michel24,7,83);
        Michel michel25 = new Michel();
        addObject(michel25,270,41);
        Michel michel26 = new Michel();
        addObject(michel26,234,13);
        Michel michel27 = new Michel();
        addObject(michel27,294,81);
        Michel michel28 = new Michel();
        addObject(michel28,188,301);
        Michel michel29 = new Michel();
        addObject(michel29,157,307);
        Michel michel30 = new Michel();
        addObject(michel30,123,302);
        Michel michel31 = new Michel();
        addObject(michel31,103,299);
        Michel michel32 = new Michel();
        addObject(michel32,82,292);
        Michel michel33 = new Michel();
        addObject(michel33,149,261);
        Michel michel34 = new Michel();
        addObject(michel34,170,265);
        Michel michel35 = new Michel();
        addObject(michel35,183,281);
        Michel michel36 = new Michel();
        addObject(michel36,188,286);
        Michel michel37 = new Michel();
        addObject(michel37,212,305);
        Michel michel38 = new Michel();
        addObject(michel38,109,268);
        Michel michel39 = new Michel();
        addObject(michel39,97,281);
        Michel michel40 = new Michel();
        addObject(michel40,92,282);
        Michel michel41 = new Michel();
        addObject(michel41,81,293);
        Michel michel42 = new Michel();
        addObject(michel42,73,305);
        Bernard bernard = new Bernard();
        addObject(bernard,0,144);
        bernard.setLocation(0,188);
        Bernard bernard2 = new Bernard();
        addObject(bernard2,0,188);
        Bernard bernard3 = new Bernard();
        addObject(bernard3,0,257);
        Bernard bernard4 = new Bernard();
        addObject(bernard4,0,355);
        bernard4.setLocation(0,401);
        Bernard bernard5 = new Bernard();
        addObject(bernard5,0,401);
        Michel michel43 = new Michel();
        addObject(michel43,449,77);
        Michel michel44 = new Michel();
        addObject(michel44,476,56);
        Michel michel45 = new Michel();
        addObject(michel45,524,54);
        mainCharacter.setLocation(221,383);
        mainCharacter.setLocation(221,381);
        mainCharacter.setLocation(239,367);
        mainCharacter.setLocation(225,371);
        Gérarld gérarld = new Gérarld();
        addObject(gérarld,59,430);
        Gérarld gérarld2 = new Gérarld();
        addObject(gérarld2,171,430);
        Gérarld gérarld3 = new Gérarld();
        addObject(gérarld3,244,430);
        Gérarld gérarld4 = new Gérarld();
        addObject(gérarld4,322,430);
        Gérarld gérarld5 = new Gérarld();
        addObject(gérarld5,398,430);
        Gérarld gérarld6 = new Gérarld();
        addObject(gérarld6,474,430);
        Gérarld gérarld7 = new Gérarld();
        addObject(gérarld7,556,430);
        GoodBernard goodBernard = new GoodBernard();
        addObject(goodBernard,404,92);
        GoodBernard goodBernard2 = new GoodBernard();
        addObject(goodBernard2,390,102);
        goodBernard2.setLocation(390,105);
        GoodBernard goodBernard3 = new GoodBernard();
        addObject(goodBernard3,390,105);
        GoodBernard goodBernard4 = new GoodBernard();
        addObject(goodBernard4,353,37);
        GoodBernard goodBernard5 = new GoodBernard();
        addObject(goodBernard5,379,47);
        GoodBernard goodBernard6 = new GoodBernard();
        addObject(goodBernard6,402,41);
    }
}
