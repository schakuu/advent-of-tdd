package org.advent.day1;

/**
 * Elf that is assigned calories
 */
public class Elf implements Comparable<Elf> {

    private Integer totalCalories = 0;

    /**
     * Calories carried by the Elf
     * @return total calories
     */
    public Integer getTotalCalories() {
        return totalCalories;
    }
    public void addCalories(Integer calories) {
        totalCalories += calories;
    }
    @Override
    public int compareTo(Elf arg0) {
        return this.getTotalCalories().compareTo(arg0.getTotalCalories());
    }
}
