package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RoomReader implements Serializable{

    public List<Room> readRooms(String fileName) throws IOException, ClassNotFoundException {
        List<Room> list = new ArrayList<Room>();

        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);

        while(true){
            try{
                Object obj = ois.readObject();
                Room room = (Room)obj;
                list.add(room);
            }catch(EOFException e){
                //Do nothing
                break;
            }
        }
        ois.close();
        return list;
    }
}
