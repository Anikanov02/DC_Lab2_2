package com.first;

import java.util.ArrayList;
import java.util.List;

public class BeeHive implements Runnable {
    private final boolean[][] forest;
    private int bees;

    public BeeHive(boolean[][] forest, int bees) {
        this.forest = forest;
        this.bees = bees;
    }

    @Override
    public void run() {
        List<Bees> groups = new ArrayList<>();
        for (int i = 0; i < Math.min(forest.length, bees)) {
            groups.add(new Bees());
        }
        for (int i = 0, j = bees; j > 0; j--) {
            groups.get(i++).addBee();
            if () {

            }
        }
        int currentRow = 0;
        while (currentRow < forest.length) {
            synchronized (forest) {
                currentRow++;
            }
        }
    }

    private class Bees implements Runnable {
        private boolean[] row;

        public Bees(boolean[] row) {
            this.row = row;
        }

        @Override
        public void run() {
            int currentCell = 0;
            while (currentCell <= row.length) {
                synchronized (row) {
                    currentCell++;
                    try {
                        Thread.sleep(100);
                        System.out.println("Bee inspected sell");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }

        public void setRow(boolean[] row) {
            this.row = row;
        }
    }
}
