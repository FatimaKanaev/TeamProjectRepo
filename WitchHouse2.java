import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WitchHouse2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WitchHouse2 extends World
{

    /**
     * Constructor for objects of class WitchHouse2.
     * 
     */
    public WitchHouse2()
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
        addObject(michel,482,413);
        Michel michel2 = new Michel();
        addObject(michel2,456,390);
        Michel michel3 = new Michel();
        addObject(michel3,449,372);
        Michel michel4 = new Michel();
        addObject(michel4,448,356);
        Michel michel5 = new Michel();
        addObject(michel5,471,340);
        Michel michel6 = new Michel();
        addObject(michel6,495,318);
        Michel michel7 = new Michel();
        addObject(michel7,514,301);
        Michel michel8 = new Michel();
        addObject(michel8,491,242);
        Michel michel9 = new Michel();
        addObject(michel9,481,223);
        Michel michel10 = new Michel();
        addObject(michel10,480,219);
        Michel michel11 = new Michel();
        addObject(michel11,475,202);
        Michel michel12 = new Michel();
        addObject(michel12,469,191);
        Michel michel13 = new Michel();
        addObject(michel13,463,177);
        Michel michel14 = new Michel();
        addObject(michel14,462,169);
        Michel michel15 = new Michel();
        addObject(michel15,465,155);
        Michel michel16 = new Michel();
        addObject(michel16,477,138);
        Michel michel17 = new Michel();
        addObject(michel17,477,128);
        Michel michel18 = new Michel();
        addObject(michel18,491,115);
        Michel michel19 = new Michel();
        addObject(michel19,499,102);
        Michel michel20 = new Michel();
        addObject(michel20,518,76);
        Michel michel21 = new Michel();
        addObject(michel21,545,60);
        Michel michel22 = new Michel();
        addObject(michel22,559,44);
        Michel michel23 = new Michel();
        addObject(michel23,567,29);
        Michel michel24 = new Michel();
        addObject(michel24,590,16);
        MainCharacter mainCharacter = new MainCharacter();
        addObject(mainCharacter,367,378);
        mainCharacter.setLocation(394,383);
        mainCharacter.setLocation(390,375);
        mainCharacter.setLocation(390,378);
        Michel michel25 = new Michel();
        addObject(michel25,175,191);
        Michel michel26 = new Michel();
        addObject(michel26,206,184);
        Michel michel27 = new Michel();
        addObject(michel27,239,184);
        Michel michel28 = new Michel();
        addObject(michel28,264,184);
        Michel michel29 = new Michel();
        addObject(michel29,124,156);
        Michel michel30 = new Michel();
        addObject(michel30,65,132);
        Michel michel31 = new Michel();
        addObject(michel31,22,122);
        Michel michel32 = new Michel();
        addObject(michel32,120,327);
        Michel michel33 = new Michel();
        addObject(michel33,80,323);
        Michel michel34 = new Michel();
        addObject(michel34,45,313);
        Michel michel35 = new Michel();
        addObject(michel35,14,279);
        Michel michel36 = new Michel();
        addObject(michel36,141,311);
        Michel michel38 = new Michel();
        addObject(michel38,94,282);
        Michel michel39 = new Michel();
        addObject(michel39,24,271);
        Michel michel40 = new Michel();
        addObject(michel40,9,250);
        Michel michel41 = new Michel();
        addObject(michel41,121,299);
        Michel michel42 = new Michel();
        addObject(michel42,273,48);
        Michel michel43 = new Michel();
        addObject(michel43,321,146);
        Michel michel44 = new Michel();
        addObject(michel44,309,126);
        Michel michel45 = new Michel();
        addObject(michel45,282,108);
        Michel michel46 = new Michel();
        addObject(michel46,268,104);
        Michel michel47 = new Michel();
        addObject(michel47,490,247);
        Michel michel48 = new Michel();
        addObject(michel48,293,92);
        Michel michel49 = new Michel();
        addObject(michel49,312,77);
        Michel michel50 = new Michel();
        addObject(michel50,337,87);
        Michel michel51 = new Michel();
        addObject(michel51,415,80);
        Michel michel52 = new Michel();
        addObject(michel52,384,66);
        Michel michel53 = new Michel();
        addObject(michel53,438,76);
        Michel michel54 = new Michel();
        addObject(michel54,342,72);
        Michel michel55 = new Michel();
        addObject(michel55,447,236);
        Michel michel56 = new Michel();
        addObject(michel56,438,244);
        Witch witch = new Witch();
        addObject(witch,243,228);
        witch.setLocation(308,223);
        witch.setLocation(309,217);
        Pearls pearls = new Pearls();
        addObject(pearls,459,256);
        pearls.setLocation(463,264);
        pearls.setLocation(456,257);
        pearls.setLocation(453,257);
        Quentin quentin = new Quentin();
        addObject(quentin,453,257);
        mainCharacter.setLocation(412,240);
        mainCharacter.setLocation(379,252);
        mainCharacter.setLocation(271,307);
        mainCharacter.setLocation(373,310);
        witch.setLocation(309,217);
        // Pearls pearls = new Pearls();
        addObject(pearls,459,256);
        pearls.setLocation(453,257);
        // Quentin quentin = new Quentin();
        addObject(quentin,453,257);
        mainCharacter.setLocation(369,320);
    }
}
