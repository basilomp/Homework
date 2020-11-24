package ru.geekbrains.java.javaone.homework.LessonEight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FeedApp extends JFrame{
    //Создаем котов
    Cat cat1 = new Cat("Инфёрнал Рэйдж", 50, false);
    Cat cat2 = new Cat("Элдерли Эйдж", 30, false);
    Cat cat3 = new Cat("Синайл Сэйдж", 20, false);
    Bowl bowl = new Bowl(100, 200);


    //Создаем фрейм
    JFrame frame = new JFrame();

    //Загружаем изображения
    ImageIcon cat1Icon = new ImageIcon("cat1.png");
    ImageIcon cat2Icon = new ImageIcon("cat2.jpg");
    ImageIcon cat3Icon = new ImageIcon("cat3.jpg");
    ImageIcon bowl1 = new ImageIcon("bowl.png");

    //Создаем кнопки
    JButton cat1Button = new JButton(cat1Icon);
    JButton cat2Button = new JButton(cat2Icon);
    JButton cat3Button = new JButton(cat3Icon);
    JButton bowlButton = new JButton(bowl1);
    JButton fill = new JButton("Наполнить миску");



    //Создаем подписи
    JLabel cat1Name = new JLabel("\t" + cat1.getName() + " || Голод: " + cat1.getHunger());
    JLabel cat2Name = new JLabel("\t" + cat2.getName() + " || Голод: " + cat2.getHunger());
    JLabel cat3Name = new JLabel("\t" + cat3.getName() + " || Голод: " + cat3.getHunger());
    JLabel task = new JLabel("\tНажмите на миску, чтобы узнать, сколько осталось еды.");



    public FeedApp(){
        frame.setTitle("Корми котов!");
        frame.setBounds(100, 100,1920,1080);





        //Добавляем обработчики кликов
        bowlButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
//                bowl.setFood(bowl.getFood(), bowl);
                JOptionPane.showMessageDialog(frame.getComponent(0), "В миске осталось: "
                        + bowl.getFood() + " грамм еды.");
            }
        });

        cat1Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                cat1.feed(bowl);
            }
        });



        cat2Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                cat2.feed(bowl);
            }
        });

        cat3Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                cat3.feed(bowl);
            }
        });

        fill.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                bowl.setFood(bowl.getFood(), bowl);
            }
        });

        //Создаем поле с котами и подписями.
        Box cats = new Box(BoxLayout.Y_AXIS);
//        cats.add(choose);
        cats.add(cat1Name);
        cats.add(cat1Button);
        cats.add(cat2Name);

        cats.add(cat2Button);
        cats.add(cat3Name);

        cats.add(cat3Button);
        cats.setVisible(true);

        //Создаем поле с миской
        Box bowl = new Box(BoxLayout.Y_AXIS);
        bowl.add(task);
        bowl.add(bowlButton);
        bowl.add(fill);
        bowl.setVisible(true);
        frame.add(cats, BorderLayout.WEST);
        frame.add(bowl, BorderLayout.EAST);
        bowl.setVisible(true);


        //Задаем параметры панелей
        cats.setAlignmentX(Component.LEFT_ALIGNMENT);
        cats.setPreferredSize(new Dimension(268, 720));
        cats.setMaximumSize(new Dimension(268, 720));
        bowl.setMaximumSize(new Dimension(700, 720));
        frame.setPreferredSize(new Dimension(1024, 720));
        frame.setMaximumSize(new Dimension(1920, 1080));
        frame.pack();
        frame.setVisible(true);


    }

    public static void main(String[] args) {
        FeedApp window = new FeedApp();
        window.repaint();

    }



}