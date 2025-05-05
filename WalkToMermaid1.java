import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WalkToMermaid1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WalkToMermaid1 extends World
{

    /**
     * Constructor for objects of class WalkToMermaid1.
     * 
     */
    public WalkToMermaid1()
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
        addObject(mainCharacter,42,70);
        Michel michel = new Michel();
        addObject(michel,41,9);
        Michel michel2 = new Michel();
        addObject(michel2,89,18);
        Michel michel3 = new Michel();
        addObject(michel3,131,29);
        Michel michel4 = new Michel();
        addObject(michel4,161,42);
        Michel michel5 = new Michel();
        addObject(michel5,185,52);
        Michel michel6 = new Michel();
        addObject(michel6,199,56);
        Michel michel7 = new Michel();
        addObject(michel7,228,69);
        Michel michel8 = new Michel();
        addObject(michel8,248,82);
        Michel michel9 = new Michel();
        addObject(michel9,262,89);
        Michel michel10 = new Michel();
        addObject(michel10,291,106);
        Michel michel11 = new Michel();
        addObject(michel11,304,126);
        Michel michel12 = new Michel();
        addObject(michel12,342,129);
        Michel michel13 = new Michel();
        addObject(michel13,387,149);

        Michel michel14 = new Michel();
        addObject(michel14,450,219);
        Michel michel15 = new Michel();
        addObject(michel15,407,165);
        Michel michel16 = new Michel();
        addObject(michel16,515,292);
        Michel michel17 = new Michel();
        addObject(michel17,471,235);
        Michel michel18 = new Michel();
        addObject(michel18,547,302);
        Michel michel19 = new Michel();
        addObject(michel19,581,362);
        Michel michel20 = new Michel();
        addObject(michel20,623,387);
        Michel michel21 = new Michel();
        addObject(michel21,28,121);
        Michel michel22 = new Michel();
        addObject(michel22,85,148);
        Michel michel23 = new Michel();
        addObject(michel23,70,136);
        Michel michel24 = new Michel();
        addObject(michel24,120,157);
        Michel michel25 = new Michel();
        addObject(michel25,144,174);
        Michel michel26 = new Michel();
        addObject(michel26,200,197);
        Michel michel27 = new Michel();
        addObject(michel27,381,352);
        Michel michel28 = new Michel();
        addObject(michel28,360,327);
        Michel michel29 = new Michel();
        addObject(michel29,389,353);
        Michel michel30 = new Michel();
        addObject(michel30,420,379);
        Michel michel31 = new Michel();
        addObject(michel31,447,400);
        Michel michel32 = new Michel();
        addObject(michel32,470,422);
        Michel michel33 = new Michel();
        addObject(michel33,477,428);
        Michel michel34 = new Michel();
        addObject(michel34,496,429);
        Michel michel35 = new Michel();
        addObject(michel35,141,206);
        Michel michel36 = new Michel();
        addObject(michel36,97,230);
        Michel michel37 = new Michel();
        addObject(michel37,79,240);
        Michel michel38 = new Michel();
        addObject(michel38,62,261);
        Michel michel39 = new Michel();
        addObject(michel39,49,285);
        Michel michel40 = new Michel();
        addObject(michel40,35,306);
        Michel michel41 = new Michel();
        addObject(michel41,12,319);
        Michel michel42 = new Michel();
        addObject(michel42,1,346);
        Michel michel43 = new Michel();
        addObject(michel43,228,321);
        Michel michel44 = new Michel();
        addObject(michel44,310,402);
        Bernard bernard = new Bernard();
        addObject(bernard,0,25);
        bernard.setLocation(0,71);
        Bernard bernard2 = new Bernard();
        addObject(bernard2,0,71);
        Bernard bernard3 = new Bernard();
        addObject(bernard3,0,397);
        Gérarld gérarld = new Gérarld();
        addObject(gérarld,42,430);
        Gérarld gérarld2 = new Gérarld();
        addObject(gérarld2,108,430);
        Gérarld gérarld3 = new Gérarld();
        addObject(gérarld3,193,430);
        Gérarld gérarld4 = new Gérarld();
        addObject(gérarld4,265,430);
        Gérarld gérarld5 = new Gérarld();
        addObject(gérarld5,341,430);
        Gérarld gérarld6 = new Gérarld();
        addObject(gérarld6,401,430);
        GoodGérarld goodGérarld = new GoodGérarld();
        addObject(goodGérarld,541,430);
    }
}
