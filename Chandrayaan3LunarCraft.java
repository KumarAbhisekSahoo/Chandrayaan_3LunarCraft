public class Chandrayaan3LunarCraft {
	

    private int x, y, z;
    private Direction direction;

    public Chandrayaan3LunarCraft(int x, int y, int z, Direction direction) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.direction = direction;
    }

    public void executeCommands(String[] commands) {
        for (String command : commands) {
            executeCommand(command);
        }
    }

    private void executeCommand(String command) {
        switch (command) {
            case "f":
                moveForward();
                break;
            case "b":
                moveBackward();
                break;
            case "l":
                turnLeft();
                break;
            case "r":
                turnRight();
                break;
            case "u":
                turnUp();
                break;
            case "d":
                turnDown();
                break;
            default:
                // Handle invalid command (optional)
                break;
        }
    }

    private void moveForward() {
        switch (direction) {
            case N:
                y++;
                break;
            case S:
                y--;
                break;
            case E:
                x++;
                break;
            case W:
                x--;
                break;
            case Up:
                z++;
                break;
            case Down:
                z--;
                break;
        }
    }

    private void moveBackward() {
        switch (direction) {
            case N:
                y--;
                break;
            case S:
                y++;
                break;
            case E:
                x--;
                break;
            case W:
                x++;
                break;
            case Up:
                z--;
                break;
            case Down:
                z++;
                break;
        }
    }

    private void turnLeft() {
        switch (direction) {
            case N:
                direction = Direction.W;
                break;
            case S:
                direction = Direction.E;
                break;
            case E:
                direction = Direction.N;
                break;
            case W:
                direction = Direction.S;
                break;
            case Up :
                direction=Direction.N;
                break;
            case Down:
                direction=Direction.S;
        }
    }

    private void turnRight() {
        switch (direction) {
            case N :
                direction = Direction.E;
                break;
            case S:
                direction = Direction.W;
                break;
            case E:
                direction = Direction.S;
                break;
            case W:
                direction = Direction.N;
                break;
            case Up:
                direction = Direction.S;
                break;
            case Down:
                direction= Direction.N;
                break;
        }
    }

    private void turnUp() {
        switch (direction) {
            case N:
                direction = Direction.Up;
                break;
            case S:
                direction = Direction.Down;
                break;
            case E:
                direction = Direction.Up;
                break;
            case W:
                direction = Direction.Down;
                break;
        }
    }

    private void turnDown() {
        switch (direction) {
            case N:
                direction = Direction.Down;
                break;
            case S:
                direction = Direction.Up;
                break;
            case E:
                direction = Direction.Down;
                break;
            case W:
                direction = Direction.Up;
                break;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public Direction getDirection() {
        return direction;
    }

    public static void main(String[] args) {
        Chandrayaan3LunarCraft lunarCraft = new Chandrayaan3LunarCraft(0, 0, 0, Direction.N);
        String[] commands = {"f", "r", "u", "b", "l"};
        lunarCraft.executeCommands(commands);
        System.out.println("Final Position: (" + lunarCraft.getX() + ", " + lunarCraft.getY() + ", " + lunarCraft.getZ() + ")");
        System.out.println("Final Direction: " + lunarCraft.getDirection());
    }

    private enum Direction {
        N, S, E, W, Up, Down
    }
}

