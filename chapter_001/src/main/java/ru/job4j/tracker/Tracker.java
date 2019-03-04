package ru.job4j.tracker;

import ru.job4j.models.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author Oleg Perov(fg12g@mail.ru)
 * @version $Id$
 * @since 0.1
 **/


public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];
    private static final Random RN = new Random();
    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализаущий добавление заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        //Реализовать метод генерации.
        return String.valueOf(System.currentTimeMillis() + RN.nextLong());
    }

    //получение заявки по id - public Item findById(String id);
    public Item findByld(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

    //получение списка по имени - public Item[] findByName(String key);
    public Item[] findByName(String key) {
        List<Item> list = new ArrayList<>();
        for (Item item : items) {
            if (item != null && item.getName().equals(key)) {
                list.add(item);
            }
        }
        return items;
    }

    //получение списка всех заявок
    public Item[] findAll() {
          Item[] result = Arrays.copyOf(items,position);
          return result;
    }

    //редактирование заявок
    public boolean replace(String id, Item item) {
        for (int i = 0; i < items.length; i++) {
            if (findByld(id).equals(items[i])) {
                items[i] = item;
                break;
            }
            return true;
        }
        return false;
    }

    //удаление заявок
    protected void delete(Item item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && item.equals(items[i].getId())) {
                items[i] = null;
                System.arraycopy(items, i + 1, items, i, items.length - i - 1);
                items[items.length - 1] = null;
                break;
            }
        }
    }
}