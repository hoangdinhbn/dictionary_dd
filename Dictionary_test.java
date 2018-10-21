/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.awt.Font;
import java.io.IOException;

/**
 *dinh 17020684
 * đôn 17020685
 * @author Pc
 */
public class Dictionary_test {
    
    public static void main(String[] args) throws IOException {
       Giaodien dg = new Giaodien();
       dg.setLocation(200,100);
       dg.setVisible(true);
    
       dg.setResizable(false);
       dg.showTime();
    }
}
    

