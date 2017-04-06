public class DirectionChooser extends JPanel implements ActionListener {
  private Direction direction;
  
  public JTextField input;
  public JLabel dirLabel;
  public JButton north;
  public JButton south;
  public JButton east;
  public JButton west;
  public JButton northEast;
  public JButton southEast;
  public JButton northWest;
  public JButton southwest;
  
  public DirectionChooser() {
    input = new JTextField();
    dirLabel = new JLabel("N");
    makeButtons();
    direction = new Direction("North");
  }
  
  public void update() {
    String dStr = direction.toString();
    String dChr = dStr.charAt(0)+"";
  }
  
  @Override
  public void actionPerformed(ActionEvent e) {
    JButton button = (JButton) e.getSource();
    String var = "";
    if (button == north) {
      var = "North";
      updateButtons();
    } else if (button == south) {
      var = "South";
      updateButtons();
    } else if (button == west) {
      var = "West";
      updateButtons();
    } else if (button == east) {
      var = "East";
      updateButtons();
    } else if (button == northEast) {
      var = "NorthEast";
      updateButtons();
    } else if (button == southEast) {
      var = "SouthEast";
      updateButtons();
    } else if (button == northWest) {
      var = "NorthWest";
      updateButtons();
    } else if (button == southWest) {
      var = "SouthWest";
      updateButtons();
    }
    direction.set(var);
  }
  
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(new Color(0,0,0));
    g.drawOval(0,0,this.getWidth(),this.getHeight());
  }
}
