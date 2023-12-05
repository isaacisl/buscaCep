
package cep;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Font;

public class Sobre extends JDialog {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Sobre() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/home.png")));
		setTitle("Sobre");
		setResizable(false);
		setModal(true);
		setBounds(100, 100, 376, 205);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Buscador de CEP");
		lblNewLabel.setForeground(SystemColor.desktop);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(18, 21, 198, 22);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Professor José de Assis");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(18, 50, 151, 23);
		getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Sobre.class.getResource("/img/mit.png")));
		lblNewLabel_3.setBounds(248, 0, 96, 96);
		getContentPane().add(lblNewLabel_3);

		JButton btnGithub = new JButton("");
		btnGithub.setToolTipText("Documentação");
		btnGithub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				link("https://github.com/professorjosedeassis/cep");
			}
		});
		btnGithub.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGithub.setContentAreaFilled(false);
		btnGithub.setBorderPainted(false);
		btnGithub.setIcon(new ImageIcon(Sobre.class.getResource("/img/github.png")));
		btnGithub.setBounds(71, 84, 48, 48);
		getContentPane().add(btnGithub);

		JButton btnOk = new JButton("OK");
		btnOk.setForeground(SystemColor.desktop);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnOk.setBounds(259, 119, 74, 23);
		getContentPane().add(btnOk);

		JButton btnTutorial = new JButton("");
		btnTutorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				link("https://www.youtube.com/playlist?list=PLbEOwbQR9lqxVuDWNIrG57_JGcbIL3FWP");
			}
		});
		btnTutorial.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnTutorial.setIcon(new ImageIcon(Sobre.class.getResource("/img/youtube.png")));
		btnTutorial.setToolTipText("Tutorial");
		btnTutorial.setContentAreaFilled(false);
		btnTutorial.setBorderPainted(false);
		btnTutorial.setBounds(15, 84, 48, 48);
		getContentPane().add(btnTutorial);

	}

	private void link(String url) {
		Desktop desktop = Desktop.getDesktop();
		try {
			URI uri = new URI(url);
			desktop.browse(uri);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
