/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tool.util;

import br.com.tool.modal.FreeDuel;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Matheus
 */
public abstract class LendoFree extends FreeDuel {

    public static byte[] campos(int proxDuelista) throws FileNotFoundException, IOException {
        RandomAccessFile slus = null;
        byte[] buf = null;
        int proximo;

        if (proxDuelista < 39) {
            
            
            for (int i = 0; i < 38; i++) {
                
                proximo = FreeDuel.getSimon() + FreeDuel.getSoma();
                slus = new RandomAccessFile(FreeDuel.getFreeDuel(), "r");
                buf = new byte[2];
                slus.seek(proximo);
                slus.read(buf);
            }
        }else{
            slus = new RandomAccessFile(FreeDuel.getFreeDuel(), "r");
            buf = new byte[2];
            slus.seek(FreeDuel.getSimon());
            slus.read(buf);
        }

        slus.close();
        return buf;
    }
}
