/*
 * @course: CMSC 335
 * @author: Michael Hawkins
 * 
 * @assignment: Project 3
 * @descrption: The Job class
 */
package project1;

public class Job extends GameElement {
    public int creatureIndex = 0;
    public long time = 0;
    
    
    public Job(int index, String name, int creatureIndex, long time){
        super(index, name);
        this.creatureIndex = creatureIndex;
        this.time = time;
    }
}
