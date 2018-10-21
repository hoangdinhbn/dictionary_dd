
package dictionary;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Collection;

/**
 *dinh 17020684
 * don 17020685
 * @author Pc
 */
public class Write_ToFile {
    
    FileOutputStream fos;
    OutputStreamWriter osw;
    public Write_ToFile(String name) throws FileNotFoundException, UnsupportedEncodingException
    {
       fos = new FileOutputStream(name+".txt",false);
       osw = new OutputStreamWriter(fos,"utf-8");
        
       
    }
    
    public void Write(Collection<Word> ghifile) throws IOException
    {
      
        for(Word name:ghifile)
        {
           osw.write(name.getWord_target()+ " / " + name.getWord_explain()+"\n");
        }
       osw.flush();
       fos.close();
    }
}
