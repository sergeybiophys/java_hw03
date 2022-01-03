package org.itstep.task06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemAlreadyExistsException;

public class Main {
    public static void main(String[] args) {
        // TODO: проверяйте ваш код здесь
        XmlReader[] arrayXml = new XmlReader[]{
                new XmlReader(),
                new XmlReader(),
                new XmlReader(),
                new XmlReader()
        } ;
        try{
            readXml(arrayXml);
        }
        catch(IOException ex)
        {

        }
        catch(FileSystemAlreadyExistsException ex){

                 new FileNotFoundException();
        }

    }
    public static void readXml(XmlReader[] array) throws IOException
    {
        for(XmlReader item: array)
        {
            item.read();
        }
    }
}
