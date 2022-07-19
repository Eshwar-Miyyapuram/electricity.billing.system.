import java.awt.*;

// import javax.imageio.ImageTypeSpecifier;
import javax.swing.*;

public class Login extends JFrame{

    Login(){

        super("Login Page");
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);



        JLabel lblusername =new JLabel("USERNAME");
        lblusername.setBounds(300,20,100,20);
        add(lblusername);

        JTextField username= new JTextField();
        username.setBounds(400,20,150,20);
        add(username);

        JLabel lblpassword =new JLabel("PASSWORD");
        lblpassword.setBounds(300,60,100,20);
        add(lblpassword);

        JTextField password= new JTextField();
        password.setBounds(400,60,150,20);
        add(password);

        JLabel loggingin =new JLabel("LOGIN IN AS");
        loggingin.setBounds(300,100,100,20);
        add(loggingin);

        Choice logging=new Choice();
        logging.add("Admin");
        logging.add("Customer");
        logging.setBounds(400,100,150,20);
        add(logging);


        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
        Image i2=i1.getImage().getScaledInstance(16,16, Image.SCALE_DEFAULT);
        JButton login=new JButton("LOG IN",new ImageIcon(i2));
        login.setBounds(330,160,110,20);
        add(login);

        ImageIcon i3=new ImageIcon(ClassLoader.getSystemResource("icon/cancel.jpg"));
        Image i4=i3.getImage().getScaledInstance(16,16, Image.SCALE_DEFAULT);
        JButton cancel=new JButton("CANCEL",new ImageIcon(i4));
        cancel.setBounds(450,160,110,20);
        add(cancel);


        ImageIcon i5=new ImageIcon(ClassLoader.getSystemResource("icon/signup.png"));
        Image i6=i5.getImage().getScaledInstance(16,16, Image.SCALE_DEFAULT);
        JButton signup=new JButton("SIGN UP",new ImageIcon(i6));
        signup.setBounds(390,200,110,20);
        add(signup);


        ImageIcon i7=new ImageIcon(ClassLoader.getSystemResource("icon/second.jpg"));
        Image i8=i7.getImage().getScaledInstance(250,250, Image.SCALE_DEFAULT);
        JLabel i9=new JLabel(new ImageIcon(i8));
        i9.setBounds(0,0,250,250);
        add(i9);



        setSize(640,300);
        setLocation(350,200);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Login();
    }
}
