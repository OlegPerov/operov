package ru.job4j.loop;


/**
 * @author Oleg Perov(fg12g@mail.ru)
 * @version $Id$
 * @since 0.1
 */


public class Board {
    /**
     * Переменные  width - это ширина доски, height - это высота доски;
     *
     * @return возвращает шахматную доску из символов x и пробелов
     */
    public String paint(int width, int height)
    {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i=0; i < width;i++) {
            for (int j=0; j < height;j++ ) {
                // условие проверки, что писать пробел или X
                // Выше в задании мы определили закономерность, когда нужно проставлять X
                if ((i+j)%2==0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод на новую строку.
            screen.append(ln);
        }
        return screen.toString();
    }
}
