
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
    JLabel sizeLabel = new JLabel("Size:");
    nameInput = new JTextField();
    orderInput = new JTextField();
    localizedNameInput = new JTextField();
    widthInput = new JTextField();
    height = new JTextField();
    
    JPanel sizePanel = new JPanel();
    JPanel labelColumn = new JPanel();
    labelColumn.setLayout(new BoxLayout(labelColumn,BoxLayout.Y_AXIS));
    JPanel inputColumn = new JPanel();
    inputColumn.setLayout(new BoxLayout(inputColumn,BoxLayout.Y_AXIS));
    sizePanel.add(widthInput,new JLabel("x"),heightInput);
    labelColumn.add(nameLabel);
    labelColumn.add(localizedNameLabel);
    labelColumn.add(orderInput);
    labelColumn.add(
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
