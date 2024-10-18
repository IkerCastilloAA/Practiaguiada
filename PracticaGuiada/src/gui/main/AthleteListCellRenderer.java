package gui.main;

import java.awt.Component;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;

import domain.Athlete;


public class AthleteListCellRenderer extends DefaultListCellRenderer {
	
	/**
	 *
	 */
	 private static final long serialVersionUID = 1L;
	 @Override
	 public Component getListCellRendererComponent(JList<?> list,
	 Object value, int index, boolean isSelected, boolean hasFocus) {
		 JLabel jLabel = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, hasFocus);
			Athlete a = (Athlete) value;
			
			jLabel.setText(a.getName());
			
	 return jLabel;
	 }

}
