package timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class TimeTest {
    public static void main(String... args)
    {
        ActionListener listener = new TimePrinter();

        //每隔十秒调用一次listener中的actionPerformed函数
        //这个也是一个通过接口实现的特殊方法.
        //listener的 actionPerformed函数 即为回调函数
        Timer t = new Timer(10000, listener);
        t.start();
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

class TimePrinter implements ActionListener
{
    public void actionPerformed(ActionEvent event)
    {
        System.out.println("At the tone, the time is " + new Date());
        Toolkit.getDefaultToolkit().beep();
    }
}
