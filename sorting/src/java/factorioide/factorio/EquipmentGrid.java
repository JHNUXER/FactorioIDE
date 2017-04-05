public class EquipmentGrid {
  public String name;
  public String order;
  public int width;
  public int height;
  
  public String[] toText() {
    return new String[] {
      "{",
      "\tname=\""+name+"\",",
      "\torder=\""+order+"\",",
      "\twidth="+width+",",
      "\theight="+height+","
      "}"
    };
  }
}
