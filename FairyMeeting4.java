import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FairyMeeting4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FairyMeeting4 extends World
{

    /**
     * Constructor for objects of class FairyMeeting4.
     * 
     */
    public FairyMeeting4()
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
        addObject(mainCharacter,255,399);
        mainCharacter.setLocation(265,380);
        Fairy fairy = new Fairy();
        addObject(fairy,532,332);
        Michel michel = new Michel();
        addObject(michel,418,192);
        fairy.setLocation(697,355);
        fairy.setLocation(686,317);
        fairy.setLocation(684,332);
        Michel michel2 = new Michel();
        addObject(michel2,625,282);
        Michel michel3 = new Michel();
        addObject(michel3,574,288);
        Michel michel4 = new Michel();
        addObject(michel4,549,270);
        Michel michel5 = new Michel();
        addObject(michel5,561,222);
        Michel michel6 = new Michel();
        addObject(michel6,537,153);
        Michel michel7 = new Michel();
        addObject(michel7,463,146);
        Michel michel8 = new Michel();
        addObject(michel8,374,94);
        Michel michel9 = new Michel();
        addObject(michel9,207,111);
        Michel michel10 = new Michel();
        addObject(michel10,197,129);
        Michel michel11 = new Michel();
        addObject(michel11,204,146);
        Michel michel12 = new Michel();
        addObject(michel12,311,100);
        Michel michel13 = new Michel();
        addObject(michel13,227,122);
        Michel michel14 = new Michel();
        addObject(michel14,171,147);
        Michel michel15 = new Michel();
        addObject(michel15,118,147);
        Michel michel16 = new Michel();
        addObject(michel16,45,108);
        Michel michel17 = new Michel();
        addObject(michel17,4,100);
        Michel michel18 = new Michel();
        addObject(michel18,50,262);
        Michel michel19 = new Michel();
        addObject(michel19,18,257);
        Michel michel20 = new Michel();
        addObject(michel20,280,77);
        Gérarld gérarld = new Gérarld();
        addObject(gérarld,697,429);
        Gérarld gérarld2 = new Gérarld();
        addObject(gérarld2,582,429);
        Gérarld gérarld3 = new Gérarld();
        addObject(gérarld3,493,429);
        Gérarld gérarld4 = new Gérarld();
        addObject(gérarld4,412,429);
        Gérarld gérarld5 = new Gérarld();
        addObject(gérarld5,351,429);
        Gérarld gérarld6 = new Gérarld();
        addObject(gérarld6,280,429);
        gérarld6.setLocation(231,429);
        Gérarld gérarld7 = new Gérarld();
        addObject(gérarld7,231,429);
        Gérarld gérarld8 = new Gérarld();
        addObject(gérarld8,154,429);
        Gérarld gérarld9 = new Gérarld();
        addObject(gérarld9,50,429);
        Bernard bernard = new Bernard();
        addObject(bernard,0,177);
        Bernard bernard2 = new Bernard();
        addObject(bernard2,0,359);
        mainCharacter.setLocation(270,405);
        mainCharacter.setLocation(261,391);
        mainCharacter.setLocation(264,374);
        mainCharacter.setLocation(264,382);
        mainCharacter.setLocation(259,384);
        mainCharacter.setLocation(263,374);
        mainCharacter.setLocation(258,394);
        mainCharacter.setLocation(263,375);
        Quentin quentin = new Quentin();
        addObject(quentin,521,225);
        mainCharacter.setLocation(399,286);
        mainCharacter.setLocation(501,229);
        mainCharacter.setLocation(496,249);
        fairy.setLocation(356,245);
        fairy.setLocation(363,265);
        fairy.setLocation(373,254);
        fairy.setLocation(377,249);
        fairy.setLocation(490,396);
        fairy.setLocation(490,378);
        fairy.setLocation(490,374);
        fairy.setLocation(642,160);
        fairy.setLocation(586,147);
        fairy.setLocation(581,176);
        fairy.setLocation(593,153);
        fairy.setLocation(588,165);
        fairy.setLocation(583,167);
        GoodBernard goodBernard = new GoodBernard();
        addObject(goodBernard,404,90);
    }
}
