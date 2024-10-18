package gui.main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

import domain.Athlete;
import domain.Athlete.Genre;

public class MainWindow extends JFrame {
	
	/*
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MainWindow() {
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setTitle("JJ.OO París 2024");
		setSize(640, 480);
		setLocationRelativeTo(null);
		
		List<Athlete> athlete = List.of(
				new Athlete(1, "Athleta 1", Genre.MALE, "Country 1", LocalDate.of(2000, 10, 1)),
				new Athlete(2, "Athleta 2", Genre.MALE, "Country 2", LocalDate.of(2000, 10, 2)),
				new Athlete(3, "Athleta 3", Genre.MALE, "Country 3", LocalDate.of(2000, 10, 3)),
				new Athlete(4, "Athleta 4", Genre.MALE, "Country 4", LocalDate.of(2000, 10, 4)),
				new Athlete(5, "Athleta 5", Genre.MALE, "Country 5", LocalDate.of(2000, 10, 5)),
				new Athlete(6, "Athleta 6", Genre.MALE, "Country 6", LocalDate.of(2000, 10, 6)),
				new Athlete(7, "Athleta 7", Genre.MALE, "Country 7", LocalDate.of(2000, 10, 7)),
				new Athlete(8, "Athleta 8", Genre.MALE, "Country 8", LocalDate.of(2000, 10, 8)),
				new Athlete(9, "Athleta 9", Genre.MALE, "Country 9", LocalDate.of(2000, 10, 9)),
				new Athlete(10, "Athleta 10", Genre.MALE, "Country 10", LocalDate.of(2000, 10, 10)),
				new Athlete(11, "Athleta 11", Genre.MALE, "Country 11", LocalDate.of(2000, 10, 11)),
				new Athlete(12, "Athleta 12", Genre.MALE, "Country 12", LocalDate.of(2000, 10, 12)),
				new Athlete(13, "Athleta 13", Genre.MALE, "Country 13", LocalDate.of(2000, 10, 13)),
				new Athlete(14, "Athleta 14", Genre.MALE, "Country 14", LocalDate.of(2000, 10, 14)),
				new Athlete(15, "Athleta 15", Genre.MALE, "Country 15", LocalDate.of(2000, 10, 15)),
				new Athlete(16, "Athleta 16", Genre.MALE, "Country 16", LocalDate.of(2000, 10, 16)),
				new Athlete(17, "Athleta 17", Genre.MALE, "Country 17", LocalDate.of(2000, 10, 17)),
				new Athlete(18, "Athleta 18", Genre.MALE, "Country 18", LocalDate.of(2000, 10, 18)),
				new Athlete(19, "Athleta 19", Genre.MALE, "Country 19", LocalDate.of(2000, 10, 19)),
				new Athlete(20, "Athleta 20", Genre.MALE, "Country 20", LocalDate.of(2000, 10, 20)),
				new Athlete(21, "Athleta 21", Genre.MALE, "Country 21", LocalDate.of(2000, 10, 21)),
				new Athlete(22, "Athleta 22", Genre.MALE, "Country 22", LocalDate.of(2000, 10, 22)),
				new Athlete(23, "Athleta 23", Genre.MALE, "Country 23", LocalDate.of(2000, 10, 23)),
				new Athlete(24, "Athleta 24", Genre.MALE, "Country 24", LocalDate.of(2000, 10, 24)),
				new Athlete(25, "Athleta 25", Genre.MALE, "Country 25", LocalDate.of(2000, 10, 25)),
				new Athlete(26, "Athleta 26", Genre.MALE, "Country 26", LocalDate.of(2000, 10, 26)),
				new Athlete(27, "Athleta 27", Genre.MALE, "Country 27", LocalDate.of(2000, 10, 27)),
				new Athlete(28, "Athleta 28", Genre.MALE, "Country 28", LocalDate.of(2000, 10, 28))
				);
		
		DefaultListModel<Athlete> modelo = new DefaultListModel<Athlete>();
		modelo.addAll(athlete);
		JList<Athlete> lista = new JList<Athlete>(modelo);
		
		lista.setFixedCellWidth(200);
		JScrollPane scroll = new JScrollPane(lista);
		add(scroll, BorderLayout.WEST);
		lista.setCellRenderer(new AthleteListCellRenderer());
	
		JTabbedPane jTabbedPane = new JTabbedPane();
		jTabbedPane.addTab("Datos", null);
		jTabbedPane.addTab("Medalla", null);
		add(jTabbedPane);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu fileMenu = new JMenu("Fichero");
        menuBar.add(fileMenu);
        fileMenu.setMnemonic(KeyEvent.VK_F);

        JMenuItem atletaMenuItem = new JMenuItem("Nuevo atleta...");
        fileMenu.add(atletaMenuItem);
        atletaMenuItem.setMnemonic(KeyEvent.VK_N);
        
        fileMenu.addSeparator();
        
        JMenuItem importMenuItem = new JMenuItem("Importar...");
        fileMenu.add(importMenuItem);
        importMenuItem.setMnemonic(KeyEvent.VK_I);   
        
        JMenuItem exportMenuItem = new JMenuItem("Exportar...");
        fileMenu.add(exportMenuItem);
        exportMenuItem.setMnemonic(KeyEvent.VK_E);
        
        fileMenu.addSeparator();
        
        JMenuItem exitMenuItem = new JMenuItem("Salir");
        fileMenu.add(exitMenuItem);
        exitMenuItem.setMnemonic(KeyEvent.VK_S);
        exitMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				confirmarSalida();
				
			}
        	
        });
        
        addWindowListener(new WindowAdapter() {
        	
        	@Override
        	public void windowClosing(WindowEvent e) {
        		confirmarSalida();
        	}

			
		});
        
		setVisible(true);
		
	}
	private void confirmarSalida() {
		int option = JOptionPane.showConfirmDialog(this,
				"¿Seguro que desea salir?",
				"¿Salir?",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE
		);
		
		if(option == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
		
	}
}
