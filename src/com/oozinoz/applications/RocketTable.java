package com.oozinoz.applications;
import javax.swing.table.*;
/**
 * 
 * @author 2016112105 박선희
 * @date 20.04.09
 */

public class RocketTable extends AbstractTableModel {
	protected Rocket[] rockets;
	protected String[] columnNames = new String[] { "Name", "Price", "Apogee" };

	public RocketTable(Rocket[] rockets) {
		this.rockets = rockets;
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public String getColumnName(int i) {
		return columnNames[i];
	}

	public int getRowCount() {
		return rockets.length;
	}

	public Object getValueAt(int row, int col) { //각 열에 해당하는 특성에 맞게 추출
		Object answer=null;
		switch (columnNames[col]) {
		case "Name":
			answer = rockets[row].getName();
			break;
		case "Price":
			answer = rockets[row].getPrice();
			break;
		case "Apogee":
			answer = rockets[row].getApogee();
			break;
		}
		return answer;
	}
}
