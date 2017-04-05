public class EquipmentGridEditor extends JPanel {
  public JTextField nameInput;
  public JTextField orderInput;
  public JTextField localizedNameInput;
  public JTextField widthInput;
  public JTextField heightInput;
  
  public EquipmentGridEditor() {
    JLabel nameLabel = new JLabel("Name:");
    JLabel orderLabel = new JLabel("Order:");
    JLabel localizedNameLabel = new JLabel("Localized Name");
    JLabel Size = new JLabel("Size:");
    
  }
  
  public EquipmentGrid save() {
    EquipmentGrid grid = new EquipmentGrid();
    grid.name = nameInput.getText();
    grid.order = orderInput.getText();
    grid.width = Integer.parseInt(widthInput.getText());
    grid.height = Integer.parseInt(heightInput.getText());
    Locale.add("en",nameInput.getText(),localizedNameInput.getText());
    return grid;
  }
}
