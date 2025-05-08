import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class FairyRoom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FairyRoom extends World
{

    /**
     * Constructor for objects of class FairyRoom.
     * 
     */
    public FairyRoom()
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
        spawnRandomMirrors();
        Michel michel = new Michel();
        addObject(michel,454,164);
        Michel michel2 = new Michel();
        addObject(michel2,554,126);
        Michel michel3 = new Michel();
        addObject(michel3,611,130);
        Michel michel4 = new Michel();
        addObject(michel4,235,263);
        Michel michel5 = new Michel();
        addObject(michel5,232,244);
        Michel michel6 = new Michel();
        addObject(michel6,233,211);
        Michel michel7 = new Michel();
        addObject(michel7,68,212);
        Michel michel8 = new Michel();
        addObject(michel8,71,240);
        Michel michel9 = new Michel();
        addObject(michel9,71,276);
        Michel michel10 = new Michel();
        addObject(michel10,90,276);
        Michel michel11 = new Michel();
        addObject(michel11,147,276);
        Michel michel12 = new Michel();
        addObject(michel12,23,109);
        Michel michel13 = new Michel();
        addObject(michel13,53,165);
        Michel michel14 = new Michel();
        addObject(michel14,259,103);
        Michel michel15 = new Michel();
        addObject(michel15,317,103);
        Michel michel16 = new Michel();
        addObject(michel16,352,103);
        Michel michel17 = new Michel();
        addObject(michel17,414,103);
        Michel michel18 = new Michel();
        addObject(michel18,500,137);
        Michel michel19 = new Michel();
        addObject(michel19,548,137);
        Michel michel21 = new Michel();
        addObject(michel21,576,137);
        Michel michel22 = new Michel();
        addObject(michel22,666,103);
        Michel michel23 = new Michel();
        addObject(michel23,716,103);
        Michel michel24 = new Michel();
        addObject(michel24,185,274);
        Michel michel25 = new Michel();
        addObject(michel25,144,274);
        Michel michel26 = new Michel();
        addObject(michel26,86,274);
        Bernard bernard = new Bernard();
        addObject(bernard,0,204);
        bernard.setLocation(0,253);
        Bernard bernard2 = new Bernard();
        addObject(bernard2,0,253);
        Bernard bernard3 = new Bernard();
        addObject(bernard3,0,345);
        Bernard bernard4 = new Bernard();
        addObject(bernard4,0,397);
        Bernard bernard5 = new Bernard();
        addObject(bernard5,746,190);
        Bernard bernard6 = new Bernard();
        addObject(bernard6,746,254);
        Bernard bernard7 = new Bernard();
        addObject(bernard7,746,315);
        Bernard bernard8 = new Bernard();
        addObject(bernard8,746,390);
        Gérarld gérarld = new Gérarld();
        addObject(gérarld,60,430);
        Gérarld gérarld2 = new Gérarld();
        addObject(gérarld2,175,430);
        Gérarld gérarld3 = new Gérarld();
        addObject(gérarld3,237,430);
        Gérarld gérarld4 = new Gérarld();
        addObject(gérarld4,338,430);
        Gérarld gérarld5 = new Gérarld();
        addObject(gérarld5,350,430);
        Gérarld gérarld6 = new Gérarld();
        addObject(gérarld6,370,430);
        Gérarld gérarld7 = new Gérarld();
        addObject(gérarld7,390,430);
        Gérarld gérarld8 = new Gérarld();
        addObject(gérarld8,410,430);
        Gérarld gérarld9 = new Gérarld();
        addObject(gérarld9,514,430);
        Gérarld gérarld10 = new Gérarld();
        addObject(gérarld10,649,430);
        Gérarld gérarld11 = new Gérarld();
        addObject(gérarld11,716,430);
        MainCharacter mainCharacter = new MainCharacter();
        addObject(mainCharacter,55,371);
        mainCharacter.setLocation(40,380);
        Moon moon = new Moon();
        addObject(moon,350,73);
        Michel michel28 = new Michel();
        addObject(michel28,206,183);
        Michel michel29 = new Michel();
        addObject(michel29,230,167);
        Michel michel20 = new Michel();
        addObject(michel20,648,132);
    }
    
    public void spawnRandomMirrors(){
        int number = Greenfoot.getRandomNumber(2)+3; 

        for (int i = 0; i < number; i++) {
            int x = 300 + Greenfoot.getRandomNumber(141); // 100 to 500
            int y = 240 + Greenfoot.getRandomNumber(340); // 200 to 300

            addObject(new MirrorLevel1(), x, y);
        }
    }
    
    public void spawnMirrorsWithoutOverlap(int count) {
    int number = Greenfoot.getRandomNumber(4); // 0 to 5 mirrors
    int margin = 40; // Prevent spawning near the edge
    int minX = margin;
    int maxX = getWidth() - margin;
    int minY = margin;
    int maxY = getHeight() - margin;
    int minDistance = 40; 

    List<MirrorLevel1> placedMirrors = new ArrayList<>();

    for (int i = 0; i < number; i++) {
        boolean placed = false;
        int attempts = 0;

        while (!placed && attempts < 50) {
            int x = minX + Greenfoot.getRandomNumber(maxX - minX + 1);
            int y = minY + Greenfoot.getRandomNumber(maxY - minY + 1);
            boolean tooClose = false;

            for (MirrorLevel1 m : placedMirrors) {
                int dx = m.getX() - x;
                int dy = m.getY() - y;
                double distance = Math.sqrt(dx * dx + dy * dy);
                if (distance < minDistance) {
                    tooClose = true;
                    break;
                }
            }

            if (!tooClose) {
                MirrorLevel1 mirror = new MirrorLevel1();
                addObject(mirror, x, y);
                placedMirrors.add(mirror);
                placed = true;
            }

            attempts++;
        }
    }
}
}
