package model;

import java.util.Collections;
import java.util.List;

public class Animal{

    private String name;
    private String birthday;
    private List<String> cmd;
    private int id;

    public Type getPetsType() {
        return petsType;
    }

    //private Type animalType;
    private Type petsType;

    public Animal (String name, String birthday, List<String> cmd, int id, Type petsType) {
        this.name = name;
        this.birthday = birthday;
        this.cmd = cmd;
        this.id = id;
        this.petsType = petsType;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", cmd=" + getCmd() +
                ", petsType=" + getPetsType() +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public List<String> getCmd() {
        return cmd;
    }

    public void setCmd(List<String> cmd) {
        this.cmd = cmd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPetsType(Type petsType) {
        this.petsType = petsType;
    }

    public void learnNewCmd(String newCmd){
        for(String word:newCmd.split(" ")){
            getCmd().add(word);
        }
    }
}
