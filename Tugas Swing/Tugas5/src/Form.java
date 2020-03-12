import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;

public class Form extends JFrame {
    JLabel lForm, lName, lNim, lGender, lAgama, lAlamat,lSemester;
    JTextField tfName, tfNim, tfSemester;
    JRadioButton rbLakiLaki, rbPrempuan;
    JComboBox cbAgama;
    JTextArea taAlamat;
    String[] agama = {"none","Islam", "Kristen", "Hindu", "Budha", "konghucu"};
    JButton bTampil;

    public void tampilanForm() {
        setTitle("Data Diri");
        lForm = new JLabel("DATA DIRI MAHASISWA");
        lName = new JLabel("Nama");
        tfName = new JTextField();
        lNim = new JLabel("NIM");
        tfNim = new JTextField();
        lSemester = new JLabel("Semester");
        tfSemester = new JTextField();
        lGender = new JLabel("Jenis Kelamin");
        rbLakiLaki = new JRadioButton("Laki-laki");
        rbPrempuan = new JRadioButton("Perempuan");
        lAgama = new JLabel("Agama");
        cbAgama = new JComboBox(agama);
        lAlamat = new JLabel("Alamat");
        taAlamat = new JTextArea();
        bTampil = new JButton("OK");

        ButtonGroup gender = new ButtonGroup();
        gender.add(rbLakiLaki);
        gender.add(rbPrempuan);

        setLayout(null);
        add(lForm);
        add(lName);
        add(tfName);
        add(lNim);
        add(tfNim);
        add(lSemester);
        add(tfSemester);
        add(lGender);
        add(rbLakiLaki);
        add(rbPrempuan);
        add(lAgama);
        add(cbAgama);
        add(lAlamat);
        add(taAlamat);
        add(bTampil);

        lForm.setBounds(200, 40, 300, 30);
        lName.setBounds(100, 80, 100, 30);
        tfName.setBounds(210, 80, 150, 30);
        lNim.setBounds(100, 120, 100, 30);
        tfNim.setBounds(210, 120, 150, 30);
        lSemester.setBounds(100, 160, 100, 30);
        tfSemester.setBounds(210, 160, 150, 30);
        lGender.setBounds(100, 200, 100, 30);
        rbLakiLaki.setBounds(210, 200, 100, 30);
        rbPrempuan.setBounds(320, 200, 100, 30);
        lAgama.setBounds(100, 230, 100, 30);
        cbAgama.setBounds(210, 230, 150, 30);
        lAlamat.setBounds(100, 270, 100, 30);
        taAlamat.setBounds(210, 270, 200, 70);
        bTampil.setBounds(250, 350, 160, 30);

        setSize(550, 450);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        bTampil.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(rootPane, "YEEEAY ");
            }
        
    });
    }
}