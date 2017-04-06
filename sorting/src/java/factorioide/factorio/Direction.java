package factorioide.factorio;

public class Direction {
  public static final int NORTH = 0;
  public static final int NORTHEAST = 15;
  public static final int EAST = 31;
  public static final int SOUTHEAST = 47;
  public static final int SOUTH = 63;
  public static final int SOUTHWEST = 79
  public static final int WEST = 95;
  public static final int NORTHWEST = 111;
  public static final int MAX_VALUE = 127;
  public static final int MIN_VALUE = 0;

  public int value;
  
  public Direction(int value) {
    this.value = value;
  }
  public Direction(String name) {
    switch(name.toLowerCase()) {
      case "north": value = NORTH; break;
      case "northeast": value = NORTHEAST; break;
      case "northwest": value = NORTHWEST; break;
      case "east": value = EAST; break;
      case "west": value = WEST; break;
      case "south": value = SOUTH; break;
      case "southeast": value = SOUTHEAST; break;
      case "southwest": value = SOUTHWEST; break;
    }
  }
  
  public static String toString(Direction dir) {
    int val = dir.getValue();
    String retVal = "";
    switch(value) {
      case NORTH: retVal = "North"; break;
      case NORTHEAST: retVal = "NorthEast"; break;
      case EAST: retVal = "East"; break;
      case SOUTHEAST: retVal = "SouthEast"; break;
      case SOUTH: retVal = "South"; break;
      case SOUTHWEST: retVal = "SouthWest"; break;
      case WEST: retVal = "West"; break;
      case NORTHWEST: retVal = "NorthWest"; break;
      default: retVal += val;
    }
    return retVal;
  }
  public String toString() {
    return toString(this);
  }
  
  public int getValue() {
    return value;
  }
}
