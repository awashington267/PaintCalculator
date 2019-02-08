package com.company;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class RoomWriter {
    public void writeRooms(String filename, List<Room> roomList) throws IOException {
        FileOutputStream fos = new FileOutputStream(filename);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        for (Room room : roomList){
            oos.writeObject(room);
        }

        oos.close();

    }
}
