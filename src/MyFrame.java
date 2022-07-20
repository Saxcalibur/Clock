import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {

    SimpleDateFormat timeFormat;
    SimpleDateFormat dateFormat;
    JLabel timeLabel;
    JLabel dateLabel;
    String time;
    String date;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Joestar's Clock");
        this.setLayout(new FlowLayout());
        this.setSize(330,160);
        this.setResizable(false);
        timeFormat = new SimpleDateFormat("HH:mm:ss.SSS");
        dateFormat = new SimpleDateFormat("E dd.MM.yyyy");
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Helvetica",Font.PLAIN,50));
        timeLabel.setForeground(new Color(0xFFFFFF));
        timeLabel.setBackground(new Color(0x00));
        timeLabel.setOpaque(true);
        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Arial",Font.PLAIN,35));
        dateLabel.setOpaque(true);
        this.add(timeLabel);
        this.add(dateLabel);
        this.setVisible(true);
        setTime();

    }
    public void setTime(){
        while(true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);
            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
