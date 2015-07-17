package com.apmv1.fragmentosejemplo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Beto on 09/07/2015.
 */
public class DummyContent {

    public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * Un simple Mapa tipo Hash.
     */
    public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {
        // Agregando 3 items de ejemplo.
        addItem(new DummyItem("1", "Item 1"));
        addItem(new DummyItem("2", "Item 2"));
        addItem(new DummyItem("3", "Item 3"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * Un item que presenta contenido
     */
    public static class DummyItem {
        public String id;
        public String content;

        public DummyItem(String id, String content) {
            this.id = id;
            this.content = content;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
