package Pedido.UI;

import javax.swing.table.DefaultTableModel;

public class BrowsePedidoTable extends DefaultTableModel{
	private static final long serialVersionUID = -1557423094105855337L;
	public BrowsePedidoTable(Object[][] data,Object[] columnNames){
		super(data,columnNames);
	}
	@Override
    public boolean isCellEditable(int row, int column) {
       //all cells false
       return false;
    }
}
