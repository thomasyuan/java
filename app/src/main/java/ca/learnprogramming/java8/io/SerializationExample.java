package ca.learnprogramming.java8.io;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

public class SerializationExample {

    static class Item implements Serializable {
        private static final long serialVersionUID = 1L;
        private final int mId;
        private final String mName;
        private final float mPrice;

        Item(final int id, final String name, final float price) {
            mId = id;
            mName = name;
            mPrice = price;
        }

        public String toString() {
            return "Id " + mId + ", Name " + mName + ", Price: " + mPrice;
        }
    }

    static class ShoppingCart implements Serializable {
        private static final long serialVersionUID = 1L;
        private final int mId;
        private List<Item> mItems = new ArrayList<>();
        ShoppingCart(final int id) {
            mId = id;
        }

        int getId() {
            return mId;
        }

        void add(final Item item) {
            mItems.add(item);
        }

        void list() {
            for (Item i : mItems) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("\n==== Serialization Example ====");

        ShoppingCart cart = new ShoppingCart(1);
        cart.add(new Item(0, "iPhone SE", 399.00f));
        cart.add(new Item(1, "iPhone 11", 599.00f));
        cart.add(new Item(2, "iPhone 12", 799.00f));

        System.out.println("ShoppingCart: " + cart.getId() + " " + cart);
        cart.list();

        try (FileOutputStream fos = new FileOutputStream("cart.obj");
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(cart);

        } catch (IOException e) {
            System.err.println(e);
        }

        try (FileInputStream fis = new FileInputStream("cart.obj");
                ObjectInputStream ois = new ObjectInputStream(fis)) {

            ShoppingCart dc = (ShoppingCart)ois.readObject();
            System.out.println("\nDeserializing ShoppingCart:");
            System.out.println("ShoppingCart: " + dc.getId() + " " + dc);
            cart.list();
        } catch (ClassNotFoundException | IOException e) {
            System.err.println(e);
        }
    }
}
