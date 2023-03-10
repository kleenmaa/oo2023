public class Player {
    int xCoordinaate;
    int yCoordinaate;
    char symbol;
    Direction direction; //3nda tunni teema

    // Ese: xCoordinaate, yCoordinaate, tugevustest, kasutuskordadest, nimest
    Item item; //  tegemist on klassikomplektiga ehk player klassi sees on Item klass
    // constructor
    public Player(int worldWidth, int worldHeight) {
        this.xCoordinaate = getRandomCoordinaate(worldWidth);
        this.yCoordinaate = getRandomCoordinaate(worldHeight);
        this.symbol = 'X';
        this.direction = Direction.UP;

    }

    private static int getRandomCoordinaate(int worldDimension) {
        return (int) (Math.random() * (worldDimension - 2) + 1);
        //returni järel tuleb täisarv
    }

    //public tähendab, et mõni teine klass saab ka seda funsktiooni kasutada
    //private tähendab, et ainult see klass saab seda funktsiooni kasutada

    public void move(String input, World world) {
        if (input.equals("w")) {
            this.direction = Direction.UP;
        } else if (input.equals("s")) {
            this.direction = Direction.DOWN;
        } else if (input.equals("a")) {
            this.direction = Direction.LEFT;
        } else if (input.equals("d")) {
            this.direction = Direction.RIGHT;
        }
        if (direction.equals(Direction.UP) && this.yCoordinaate > 1) {
            this.yCoordinaate = this.yCoordinaate - 1;
        } else if (direction.equals(Direction.DOWN) && this.yCoordinaate < world.height-2){
            this.yCoordinaate = this.yCoordinaate + 1;
        } else if (direction.equals(Direction.LEFT) && this.xCoordinaate > 1) {
            this.xCoordinaate = this.xCoordinaate - 1;
        } else if (direction.equals(Direction.RIGHT) && this.xCoordinaate < world.width-2) {
            this.xCoordinaate = this.xCoordinaate + 1;
        }
    }
}
