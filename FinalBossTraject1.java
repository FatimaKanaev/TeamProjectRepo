import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinalBossTraject1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalBossTraject1 extends World
{

    /**
     * Constructor for objects of class FinalBossTraject1.
     * 
     */
    public FinalBossTraject1()
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
        addObject(mainCharacter,86,157);
        mainCharacter.setLocation(124,164);
        mainCharacter.setLocation(110,172);
        mainCharacter.setLocation(107,166);
        Michel michel = new Michel();
        addObject(michel,169,174);
        Michel michel2 = new Michel();
        addObject(michel2,66,114);

        Michel michel3 = new Michel();
        addObject(michel3,146,107);
        Michel michel4 = new Michel();
        addObject(michel4,101,92);
        Michel michel5 = new Michel();
        addObject(michel5,192,132);
        Michel michel6 = new Michel();
        addObject(michel6,227,120);
        Michel michel7 = new Michel();
        addObject(michel7,273,112);
        Michel michel8 = new Michel();
        addObject(michel8,318,97);
        Michel michel9 = new Michel();
        addObject(michel9,340,91);
        Michel michel10 = new Michel();
        addObject(michel10,388,79);
        Michel michel11 = new Michel();
        addObject(michel11,411,80);
        Michel michel12 = new Michel();
        addObject(michel12,435,76);
        Michel michel13 = new Michel();
        addObject(michel13,466,61);
        Michel michel14 = new Michel();
        addObject(michel14,499,59);
        Michel michel15 = new Michel();
        addObject(michel15,522,55);
        Michel michel16 = new Michel();
        addObject(michel16,536,49);
        Michel michel17 = new Michel();
        addObject(michel17,563,45);
        Michel michel18 = new Michel();
        addObject(michel18,587,40);
        Michel michel19 = new Michel();
        addObject(michel19,611,35);
        Michel michel20 = new Michel();
        addObject(michel20,651,22);
        Michel michel21 = new Michel();
        addObject(michel21,673,21);
        Michel michel22 = new Michel();
        addObject(michel22,722,9);
        Michel michel23 = new Michel();
        addObject(michel23,88,425);
        Michel michel24 = new Michel();
        addObject(michel24,161,392);
        Michel michel25 = new Michel();
        addObject(michel25,221,372);
        Michel michel26 = new Michel();
        addObject(michel26,252,359);
        Michel michel27 = new Michel();
        addObject(michel27,295,343);
        Michel michel28 = new Michel();
        addObject(michel28,336,326);
        Michel michel29 = new Michel();
        addObject(michel29,397,305);
        Michel michel30 = new Michel();
        addObject(michel30,407,304);
        Michel michel31 = new Michel();
        addObject(michel31,447,289);
        Michel michel32 = new Michel();
        addObject(michel32,456,282);
        Michel michel33 = new Michel();
        addObject(michel33,469,276);
        Michel michel34 = new Michel();
        addObject(michel34,538,252);
        Michel michel35 = new Michel();
        addObject(michel35,578,236);
        Michel michel36 = new Michel();
        addObject(michel36,618,221);
        Michel michel37 = new Michel();
        addObject(michel37,673,201);
        Michel michel38 = new Michel();
        addObject(michel38,717,184);
        Michel michel39 = new Michel();
        addObject(michel39,134,404);
        Michel michel40 = new Michel();
        addObject(michel40,189,380);
        Michel michel41 = new Michel();
        addObject(michel41,367,314);
        Michel michel42 = new Michel();
        addObject(michel42,514,263);
        Michel michel43 = new Michel();
        addObject(michel43,565,245);
        Michel michel44 = new Michel();
        addObject(michel44,638,212);
        Gérarld gérarld = new Gérarld();
        addObject(gérarld,12,430);
        Bernard bernard = new Bernard();
        addObject(bernard,0,392);
        Bernard bernard2 = new Bernard();
        addObject(bernard2,0,335);
        Bernard bernard3 = new Bernard();
        addObject(bernard3,0,280);
        Bernard bernard4 = new Bernard();
        addObject(bernard4,0,212);
        Bernard bernard5 = new Bernard();
        addObject(bernard5,0,146);
        Bernard bernard6 = new Bernard();
        addObject(bernard6,0,90);
        Bernard bernard7 = new Bernard();
        addObject(bernard7,0,38);
        Michel michel45 = new Michel();
        addObject(michel45,36,149);
        Michel michel46 = new Michel();
        addObject(michel46,51,175);
        GoodBernard goodBernard = new GoodBernard();
        addObject(goodBernard,746,128);
    }
}
