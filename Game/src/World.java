import java.util.List;

public class World {

    int width;
    int height;

    public World(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void printMap(int worldWidth, int worldHeight,
                         int playerXCoordinaate, int playerYCoordinaate, char playerSymbol,
                         int dragonXCoordinaate, int dragonYCoordinaate, char dragonSymbol,
                         int orcXCoordinaate, int orcYCoordinaate, char orcSymbol, List<Item> items) {
        // kirjutan fori ja vajtuad enterit ja siis tuleb see
        // algväärtus, kuni iga tsükkel
        char symbol = ' ';
        for (int y = 0; y < worldHeight; y++) {
            //System.out.println("--"+i);
            System.out.println();
            //println teeb uue rea
            for (int x = 0; x < worldWidth; x++) {
                // või on ||
                //String symbol; //kui panna see siia siis siin luaakse iga kord uus muutuja ehk deklareerimine, esmakordne väärtuse andmine on intsialiseerimine
                if (y == 0 || y == worldHeight -1) {
                    //System.out.print("-");
                    symbol = '-';
                } else if (x == 0 || x == worldWidth -1) {
                    //System.out.print("|");
                    symbol = '|';
                } else {
                    // command + option + m või parem klõps factor extract aktiivsele osale
                    for (Item i: items) {
                        if (i.yCoordinate == y && i.xCoordinate == x) {
                            //System.out.print("I");
                            symbol = 'I';
                            break;
                        }
                    }
                    if (playerXCoordinaate == x && playerYCoordinaate == y) {
                        //System.out.print(playerSymbol);
                        symbol = playerSymbol;
                    } else if (dragonXCoordinaate == x && dragonYCoordinaate == y) {
                        //System.out.print(dragonSymbol);
                        symbol = dragonSymbol;
                    } else if (orcXCoordinaate == x && orcYCoordinaate == y) {
                        //System.out.print(orcSymbol);
                        symbol = orcSymbol;
                    }
//                    for (Charater c: characters) {
//                        if (c.xCoordinaate == x && c.yCoordinaate == y) {
//                            symbol = c.symbol;
//                        }
//                    }
                    //sout ja vajutad enterit ja sisi tuleb system out print
                }
                System.out.print(symbol);
                symbol = ' ';
            }
        }
    }
    // int on tagastustüüp ehk mis järgneb return kirjele




    //private static int getRandomCoordinaate(int worldDimension) {
    // return (int) (Math.random() * (worldDimension - 2) + 1);
    //returni järel tuleb täisarv
    // }

    // void on tagastsustüüp ehk mis tüüp järgneb return kirjele
    // void tähendab, et ei tagastatagi midagi

}
