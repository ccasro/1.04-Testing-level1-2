package org.ccasro.level2.exercise4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class ItemListTest {

    @Test
    void testArrayList(){
        Item item1 = new Item("1");
        Item item2 = new Item("2");
        Item item3 = new Item("3");
        Item item4 = new Item("4");

        ArrayList<Item> list = new ArrayList<>();
        list.add(item1);
        list.add(item2);
        list.add(item3);

        assertThat(list).containsExactly(item1,item2,item3);

        assertThat(list).containsExactlyInAnyOrder(item3,item1,item2);

        assertThat(list).filteredOn(i->i.equals(item1)).hasSize(1);

        assertThat(list).doesNotContain(item4);
    }
}
