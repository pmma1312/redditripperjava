package controller;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JList;

import model.DataStore;
import util.ReferenceFinder;
import view.MainFrame;

public class SaveListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		MainFrame frame = (MainFrame) ReferenceFinder.findFrame((Component) e.getSource());
		JList<String> subreddits = frame.getmJListSubReddits();
		
		DataStore store = new DataStore();
		store.save(subreddits);
		frame.printToConsole("Sucessfully saved the subreddits!");
	}

}
