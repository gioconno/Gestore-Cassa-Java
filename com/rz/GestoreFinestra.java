package com.rz; /**
 * classe per la gestione della finestra
 */

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class GestoreFinestra implements WindowListener {

    @Override
    public void windowActivated(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowClosed(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowClosing(WindowEvent e) {
        int answer = JOptionPane.showConfirmDialog(null, "Attenzione! Le operazioni in sospeso verranno annullate.\nVuoi veramente uscire?", "Chiusura programma", JOptionPane.YES_NO_OPTION);
        if (JOptionPane.YES_OPTION == answer) {
            System.out.println("Programma terminato");
            System.exit(0);
        }

    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowIconified(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowOpened(WindowEvent e) {
        // TODO Auto-generated method stub

    }
}
