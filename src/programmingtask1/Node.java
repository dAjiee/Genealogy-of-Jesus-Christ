/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programmingtask1;

import java.util.Objects;

/**
 *
 * @author Alexander
 */
public class Node {
    private Node next, previous;
    private int born, death, lived;
    private String name, verse, description;
    
    public Node() {
        born = -1;
        death = -1;
        lived = -1;
        name = "";
        verse = "";
        description = "";
        next = null;
        previous = null;
    }

    public Node(String name, int born, int death, int lived, String verse, String description) {
        this.born = born;
        this.death = death;
        this.lived = lived;
        this.name = name;
        this.verse = verse;
        this.description = description;
        next = null;
        previous = null;
    }

    public Node(String name, int born, int death, int lived, String verse, String description, Node next, Node previous) {
        this.born = born;
        this.death = death;
        this.lived = lived;
        this.name = name;
        this.verse = verse;
        this.description = description;
        this.next = next;
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public int getBorn() {
        return born;
    }

    public void setBorn(int born) {
        this.born = born;
    }

    public int getDeath() {
        return death;
    }

    public void setDeath(int death) {
        this.death = death;
    }

    public int getLived() {
        return lived;
    }

    public void setLived(int lived) {
        this.lived = lived;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVerse() {
        return verse;
    }

    public void setVerse(String verse) {
        this.verse = verse;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.next);
        hash = 71 * hash + Objects.hashCode(this.previous);
        hash = 71 * hash + this.born;
        hash = 71 * hash + this.death;
        hash = 71 * hash + this.lived;
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + Objects.hashCode(this.verse);
        hash = 71 * hash + Objects.hashCode(this.description);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Node other = (Node) obj;
        if (this.born != other.born) {
            return false;
        }
        if (this.death != other.death) {
            return false;
        }
        if (this.lived != other.lived) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.verse, other.verse)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.next, other.next)) {
            return false;
        }
        return Objects.equals(this.previous, other.previous);
    }
    
    @Override
    public String toString(){
        return name + "," + born + "," + death + "," + lived + "," + verse + "," + description + "\n";
    }
}
