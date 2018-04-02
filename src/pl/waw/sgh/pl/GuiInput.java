package pl.waw.sgh.pl;

import com.sun.codemodel.internal.JOp;

import javax.swing.*;
import java.awt.*;

public class GuiInput {

    public static void main(String[] args) {



        ImageIcon icon = new ImageIcon("/Users/piotrparulski/IdeaProjects/CP_summer_2018/src/images");

        JOptionPane.showMessageDialog(null, "Hello!");
        String myText = JOptionPane.showInputDialog("What is your name: ");
        JOptionPane.showMessageDialog(null,"Hello " + myText + "!");

        int res = -1;
        while (res!=0) {
            res = JOptionPane.showConfirmDialog(null, "Are you sure?");
            JOptionPane.showMessageDialog(null, "Result: " + res);
        }
    }

}
